package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookA = new HashSet<>();
        bookA.add(new Book("Terry Pratchett", "Wyrd sisters", 1980, "A1234"));
        bookA.add(new Book("Terry Pratchett", "Witches Abroad", 1989, "B1234"));
        bookA.add(new Book("Terry Pratchett", "Lords and Ladies", 1997, "C1234"));
        bookA.add(new Book("Terry Pratchett", "Maskerade", 2000, "D1234"));

        //When
        int median = medianAdapter.publicationYearMedian(bookA);

        //Then
        Assert.assertEquals(1997, median);
    }
}
