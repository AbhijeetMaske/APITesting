package com.synergyconnect.service;

import com.synergyconnect.exception.BookNotFoundException;
import com.synergyconnect.model.BookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookDataService {

	private final List<BookData> bookList = new ArrayList<>();

	public List<BookData> getAllBooks() {
		return bookList;
	}

	public BookData getBookById(Long id) {
		return bookList.stream().filter(book -> book.getId().equals(id)).findFirst()
				.orElseThrow(() -> new BookNotFoundException(id));
	}

	public void addBook(BookData bookData) {
		bookList.add(bookData);
	}

	public void updateBook(BookData updatedBookData) {
		bookList.stream().filter(book -> book.getId().equals(updatedBookData.getId())).findFirst()
				.ifPresent(existingBook -> {
					existingBook.setTitle(updatedBookData.getTitle());
					existingBook.setAuthor(updatedBookData.getAuthor());
					existingBook.setGenre(updatedBookData.getGenre());
					existingBook.setPublishedYear(updatedBookData.getPublishedYear());
					existingBook.setIsbn(updatedBookData.getIsbn());
					existingBook.setAvailable(updatedBookData.isAvailable());
				});
	}

	public void deleteBookById(Long id) {
		boolean removed = bookList.removeIf(book -> book.getId().equals(id));
		if (!removed) {
			throw new BookNotFoundException(id);
		}
	}
}
