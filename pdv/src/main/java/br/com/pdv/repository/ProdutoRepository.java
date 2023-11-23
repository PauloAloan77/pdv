package br.com.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pdv.entidade.LojaEntidade;
import br.com.pdv.entidade.ProdutoEntidade;


public interface ProdutoRepository extends JpaRepository<ProdutoEntidade, Long>{

}