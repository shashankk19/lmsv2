package com.ccproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ccproject.entities.Book;


@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
