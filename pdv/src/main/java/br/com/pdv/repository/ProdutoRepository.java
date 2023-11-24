package br.com.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.pdv.entidade.ProdutoEntidade;


public interface ProdutoRepository extends JpaRepository<ProdutoEntidade, Long>{

}