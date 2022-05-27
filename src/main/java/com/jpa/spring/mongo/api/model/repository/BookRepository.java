package com.jpa.spring.mongo.api.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.jpa.spring.mongo.api.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {
	
}
