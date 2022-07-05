package br.com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.java.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}