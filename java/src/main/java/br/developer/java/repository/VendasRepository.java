package br.developer.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.developer.java.entity.Vendas;

public interface VendasRepository extends JpaRepository<Vendas, Long> {

}
