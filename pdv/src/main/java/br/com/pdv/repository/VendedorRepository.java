package br.com.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.pdv.entidade.VendedorEntidade;


public interface VendedorRepository extends JpaRepository<VendedorEntidade, Long>{

}