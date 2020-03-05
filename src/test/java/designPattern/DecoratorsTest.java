package designPattern;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class DecoratorsTest {

    @Test
    public void decoratorPattern() throws IOException {
        final File f = new File("target", "out.bin");
        final FileOutputStream fos = new FileOutputStream(f);
        final BufferedOutputStream bos = new BufferedOutputStream(fos);
        final ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeBoolean(true);
        oos.writeInt(42);
        oos.writeObject(new ArrayList<Integer>());

        oos.flush();
        oos.close();
        bos.close();
        fos.close();

        assertTrue(f.exists());
    }
}