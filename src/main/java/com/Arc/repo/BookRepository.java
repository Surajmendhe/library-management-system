package com.Arc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Arc.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
