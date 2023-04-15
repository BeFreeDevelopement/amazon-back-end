package com.oscarperezarruti.amazon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.oscarperezarruti.amazon.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Long> { }