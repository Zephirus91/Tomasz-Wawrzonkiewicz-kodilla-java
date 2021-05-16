package com.kodilla.patterns2.adapter.bookclasifier;

import static org.junit.jupiter.api.Assertions.*;


import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {

        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author1","Title1", 1990, "ABC123"));
        bookSet.add(new Book("Author2","Title2", 1995, "DEF456"));
        bookSet.add(new Book("Author3","Title3", 2000, "GHI789"));
        bookSet.add(new Book("Author4","Title4", 2005, "JKL135"));
        bookSet.add(new Book("Author5","Title5", 2010, "MNO246"));

        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int publicationYearMedian = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2000, publicationYearMedian);
    }
}
