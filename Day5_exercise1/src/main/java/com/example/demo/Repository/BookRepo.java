package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.BookEntity;

public interface BookRepo extends JpaRepository<BookEntity, Integer> {

}