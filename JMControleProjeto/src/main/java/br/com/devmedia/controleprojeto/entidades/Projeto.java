package br.com.devmedia.controleprojeto.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "projeto")
public class Projeto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "SITUACAO")
	private String situacao;
	
	@Column(name = "ORCAMENTO")
	private Double orcamento;
	
	@OneToMany(mappedBy = "projetoId")
	private List<Alocaco> alocacoList;

	public Projeto() {
	}

	public Projeto(Integer id) {
		this.id = id;
	}
}
