package com.synergyconnect.exception;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(Long bookId) {
        super("Book with ID " + bookId + " not found.");
    }

    public BookNotFoundException(String message) {
        super(message);
    }
}
