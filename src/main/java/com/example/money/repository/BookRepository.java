package com.example.money.repository;

import com.example.money.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
