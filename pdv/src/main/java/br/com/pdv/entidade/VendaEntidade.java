package br.com.pdv.entidade;


import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "venda",schema = "pdv")
public class VendaEntidade implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ven_codigo")
	private Long ven_codigo;
	
	
	public Long getVen_codigo() {
		return ven_codigo;
	}


	public void setVen_codigo(Long ven_codigo) {
		this.ven_codigo = ven_codigo;
	}


	@Column(name = "ven_data")
	private Date ven_data;


	public Date getVen_data() {
		return ven_data;
	}


	public void setVen_data(Date ven_data) {
		this.ven_data = ven_data;
	}
	
	
	



	
}
