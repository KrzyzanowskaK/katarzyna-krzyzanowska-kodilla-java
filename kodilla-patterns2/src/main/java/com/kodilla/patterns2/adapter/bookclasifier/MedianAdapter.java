package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> libraryABook) {

        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> libraryBBook = new HashMap<>();

        for (com.kodilla.patterns2.adapter.bookclasifier.librarya.Book book : libraryABook) {
            com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book bookB =
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(book.getAuthor(),
                            book.getTitle(), book.getPublicationYear());

            libraryBBook.put(new BookSignature(book.getSignature()), bookB);
        }

        return medianPublicationYear(libraryBBook);
    }
}
