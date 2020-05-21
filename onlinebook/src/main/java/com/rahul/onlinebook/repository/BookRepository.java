package com.rahul.onlinebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.onlinebook.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
