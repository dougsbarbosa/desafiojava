package br.developer.java.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.developer.java.entity.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long>{
	
	
}