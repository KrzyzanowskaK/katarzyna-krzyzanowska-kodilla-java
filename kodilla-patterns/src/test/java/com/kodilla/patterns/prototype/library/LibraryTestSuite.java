package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Book Library");
        Book book1 = new Book("Hobbit", "Tolkien", LocalDate.of(1980,10,20));
        Book book2 = new Book("Holmes", "Doyle", LocalDate.of(1890,02,11));
        Book book3 = new Book("1984", "Orwell", LocalDate.of(1949, 06, 30));
        Book book4 = new Book("Dog Year", "Katz", LocalDate.of(2010, 07, 14));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        //shallow clone
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Book Library Shallow Copy");
        } catch (CloneNotSupportedException e) {
            System.out.println("Error: " + e);
        }

        //deep clone
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Book Library Deep Copy");
        } catch (CloneNotSupportedException e) {
            System.out.println("Error: " + e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
    }
}
