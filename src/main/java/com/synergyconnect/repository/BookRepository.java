package com.synergyconnect.repository;

import com.synergyconnect.model.BookData;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository {
    List<BookData> findAll();
    BookData findById(Long id);
    void save(BookData book);
    void deleteById(Long id);
}
