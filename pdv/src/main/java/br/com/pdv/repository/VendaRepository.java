package br.com.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.pdv.entidade.VendaEntidade;


public interface VendaRepository extends JpaRepository<VendaEntidade, Long>{

}