package com.twolak.spring.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.twolak.spring.spring5webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
