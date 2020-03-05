package designPattern.strategy;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ClientTest {

    @Test
    public void useConsoleLogging() {
        final Client client = new Client(new ConsoleLogging());
        client.doWork(32);
    }

    @Test
    public void useFileLogging() throws IOException {
        final File tempFile = File.createTempFile("test", "log");
        final Client client = new Client(new FileLogging(tempFile));
        client.doWork(41);
        client.doWork(42);
        client.doWork(43);

        final BufferedReader reader = new BufferedReader(new FileReader(tempFile));
        assertEquals("Even number: 42", reader.readLine());
        assertEquals(-1, reader.read());
    }

    @Test
    public void useMockLogging() {
        final Logging mockLogging = mock(Logging.class);
        final Client c = new Client(mockLogging);
        c.doWork(1);
        c.doWork(2);
        verify(mockLogging).write("Even number: 2");
    }
}