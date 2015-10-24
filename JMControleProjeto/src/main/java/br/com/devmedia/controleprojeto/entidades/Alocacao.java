package br.com.devmedia.controleprojeto.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "alocacao")
public class Alocacao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "CARGA_HORARIA")
	private Integer cargaHoraria;
	
	@Column(name = "SITUACAO")
	private Integer situacao;
	
	@JoinColumn(name = "COLABORADOR_ID", referencedColumnName = "ID")
	@ManyToOne
	private Colaborador colaboradorId;
	
	@JoinColumn(name = "PROJETO_ID", referencedColumnName = "ID")
	@ManyToOne
	private Projeto projetoId;

	public Alocacao() {
	}

	public Alocacao(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Integer getSituacao() {
		return situacao;
	}

	public void setSituacao(Integer situacao) {
		this.situacao = situacao;
	}

	public Colaborador getColaboradorId() {
		return colaboradorId;
	}

	public void setColaboradorId(Colaborador colaboradorId) {
		this.colaboradorId = colaboradorId;
	}

	public Projeto getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Projeto projetoId) {
		this.projetoId = projetoId;
	}
	
}