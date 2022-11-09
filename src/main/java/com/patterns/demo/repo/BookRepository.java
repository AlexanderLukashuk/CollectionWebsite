package com.patterns.demo.repo;

import com.patterns.demo.models.Entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {


}
