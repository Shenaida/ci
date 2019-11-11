package com.minorjava.week8.ci.repository;

import com.minorjava.week8.ci.model.Hello;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HelloRepository extends CrudRepository<Hello, Long> {

}
