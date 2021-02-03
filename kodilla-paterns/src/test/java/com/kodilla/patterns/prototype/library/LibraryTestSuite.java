package com.kodilla.patterns.prototype.library;

import com.kodilla.paterns.prototype.library.Book;
import com.kodilla.paterns.prototype.library.Library;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        //Creating books
        for (int i = 0; i < 10; i++){
            Book book = new Book("book title: book no. " + i,"book author: author no. " + i,
                    LocalDate.of(1991,10,10));
        }


        //creating library and assigning the books
        Library library = new Library("new library");
        library.getBooks();

        //making a shallow clone of object library
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.getName();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.getName();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When


        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepCloneLibrary);


    }
}
