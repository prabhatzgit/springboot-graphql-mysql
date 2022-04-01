package com.springgraphql.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springgraphql.mysql.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}