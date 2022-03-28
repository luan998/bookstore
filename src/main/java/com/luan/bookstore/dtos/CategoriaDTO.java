package com.luan.bookstore.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.luan.bookstore.domain.Categoria;

public class CategoriaDTO implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message= "Campo Nome é requerido")
	@Length(min = 3, max = 100, message = "O nome deve ter entre 3 a 100 carácteres")
	private String nome;
	
	@NotEmpty(message = "Campo Descriçao é requerido")
	@Length(min = 3, max = 300, message = "A descrição deve ter entre 3 a 300 carácteres")
	private String descricao;

	public CategoriaDTO() {
		super();
	}

	public CategoriaDTO(Categoria obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.descricao = obj.getDescricao();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
