package designPattern.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryBookTest {

    @Test
    public void fictionLibraryBook() {
        final LibraryBook.Builder builder = new LibraryBook.Builder();
        final LibraryBook book = builder
                .withBookName("War and Peace")
                .build();

        assertEquals(BookType.FICTION, book.getBookType());
    }

}