
package br.com.pdv.entidade;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "item",schema = "pdv")
public class ItemEntidade implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "iditem")
	private Long idItem;
	
	@Column(name = "id_produtoFK")
	private Long id_produtoFK;
	
	@Column(name = "id_vendaFK")
	private Long id_vendaFK;
	
	public Long getIdItem() {
		return idItem;
	}
	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}
	public Long getId_produtoFK() {
		return id_produtoFK;
	}
	public void setId_produtoFK(Long id_produtoFK) {
		this.id_produtoFK = id_produtoFK;
	}
	public Long getId_vendaFK() {
		return id_vendaFK;
	}
	public void setId_vendaFK(Long id_vendaFK) {
		this.id_vendaFK = id_vendaFK;
	}
	



	
}
