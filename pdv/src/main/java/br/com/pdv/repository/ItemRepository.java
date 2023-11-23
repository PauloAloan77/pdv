package br.com.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pdv.entidade.ItemEntidade;

public interface ItemRepository extends JpaRepository<ItemEntidade, Long>{

}