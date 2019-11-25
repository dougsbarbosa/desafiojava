package br.developer.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.developer.java.entity.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long>{

}
