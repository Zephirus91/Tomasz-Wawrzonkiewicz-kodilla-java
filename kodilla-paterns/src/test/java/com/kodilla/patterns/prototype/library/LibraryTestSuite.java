package com.kodilla.patterns.prototype.library;

import com.kodilla.paterns.prototype.library.Book;
import com.kodilla.paterns.prototype.library.Library;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Set;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        //Creating books
        Library library = new Library("new library 1");
        Set<Book> book = library.getBooks();
        for (int i = 0; i < 10; i++) {
            book.add(new Book("book title: book no. " + i, "book author: author no. " + i,
                    LocalDate.of(1991 + i, 1 + i, 10 + i)));
        }

        //making a shallow clone of object library
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("new library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("new library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When & Then

        for (Book books : library.getBooks()) {
            System.out.println(books.toString());
        }
        System.out.println("\n");

        for (Book books : cloneLibrary.getBooks()) {
            System.out.println(books.toString());
        }
        System.out.println("\n");

        for (Book books : deepCloneLibrary.getBooks()) {
            System.out.println(books.toString());
        }
        System.out.println("\n");

        assertEquals(10, book.size());
        assertEquals(10, library.getBooks().size());
        assertEquals(10, cloneLibrary.getBooks().size());
        assertEquals(10, deepCloneLibrary.getBooks().size());
        assertEquals(book.size(), library.getBooks().size());
        assertEquals(book.size(), cloneLibrary.getBooks().size());
        assertEquals(book.size(), deepCloneLibrary.getBooks().size());
    }
}
