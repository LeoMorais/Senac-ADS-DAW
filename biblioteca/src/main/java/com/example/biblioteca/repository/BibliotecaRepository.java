package com.example.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.biblioteca.model.Livros;

@Repository
public interface BibliotecaRepository extends CrudRepository<Livros, Long>{
	
}
