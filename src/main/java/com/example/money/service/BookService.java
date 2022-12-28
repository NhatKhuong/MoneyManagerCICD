package com.example.money.service;

import com.example.money.model.Book;
import com.example.money.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public String save(Book book){
        try {
            bookRepository.save(book);
            return "save done";
        } catch (Exception e){
            e.printStackTrace();
        }
        return "save fail";

    }


}
