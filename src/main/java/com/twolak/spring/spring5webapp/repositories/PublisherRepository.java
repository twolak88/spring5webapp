package com.twolak.spring.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.twolak.spring.spring5webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{

}
