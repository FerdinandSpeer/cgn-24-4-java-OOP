package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    private Book [] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.deepEquals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(books);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    public void addBook (Book newbook){
        Book [] arrayOfNewBooks = new Book[books.length + 1];
        for (int i=0; i< books.length; i++){
            arrayOfNewBooks[i]=books[i];
        }
        arrayOfNewBooks[books.length] = newbook;
        books = arrayOfNewBooks;
    }
}
