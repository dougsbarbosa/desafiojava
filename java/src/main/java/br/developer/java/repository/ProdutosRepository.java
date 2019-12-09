package br.developer.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.developer.java.entity.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long>{

}
