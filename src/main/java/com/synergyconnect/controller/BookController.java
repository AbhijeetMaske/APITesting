package com.synergyconnect.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.synergyconnect.model.BookData;
import com.synergyconnect.service.BookDataService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookDataService bookDataService;

    // Retrieve all books
    @GetMapping("/all")
    public ResponseEntity<List<BookData>> getAllBooks(HttpServletResponse response) {
        Cookie cookie = new Cookie("userRole", "admin");
        cookie.setHttpOnly(true);
        response.addCookie(cookie);
        return new ResponseEntity<>(bookDataService.getAllBooks(), HttpStatus.OK);
    }

    // Retrieve book by ID
    @GetMapping("/get")
    public ResponseEntity<BookData> getBookById(@RequestParam Long bookId) {
        BookData bookData = bookDataService.getBookById(bookId);
        return new ResponseEntity<>(bookData, HttpStatus.OK);
    }

    // Add a new book
    @PostMapping("/add")
    public ResponseEntity<BookData> addBook(@RequestBody BookData bookData) {
        bookDataService.addBook(bookData);
        return new ResponseEntity<>(bookData, HttpStatus.CREATED);
    }

    // Update book with PUT (replace the entire record)
    @PutMapping("/update")
    public ResponseEntity<BookData> updateBook(@RequestParam Long bookId, @RequestBody BookData updatedBookData) {
        BookData existingBook = bookDataService.getBookById(bookId);
        updatedBookData.setId(bookId);
        bookDataService.updateBook(updatedBookData);
        return new ResponseEntity<>(updatedBookData, HttpStatus.OK);
    }

    // Partial update with PATCH (modify specific fields)
    @PatchMapping("/updatePartial")
    public ResponseEntity<BookData> partiallyUpdateBook(@RequestParam Long bookId, @RequestBody BookData partialUpdateData) {
        BookData existingBook = bookDataService.getBookById(bookId);
        if (partialUpdateData.getTitle() != null) existingBook.setTitle(partialUpdateData.getTitle());
        if (partialUpdateData.getAuthor() != null) existingBook.setAuthor(partialUpdateData.getAuthor());
        if (partialUpdateData.getGenre() != null) existingBook.setGenre(partialUpdateData.getGenre());
        bookDataService.updateBook(existingBook);
        return new ResponseEntity<>(existingBook, HttpStatus.OK);
    }

    // Delete a book by ID
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteBook(@RequestParam Long bookId) {
        bookDataService.deleteBookById(bookId);
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
}
