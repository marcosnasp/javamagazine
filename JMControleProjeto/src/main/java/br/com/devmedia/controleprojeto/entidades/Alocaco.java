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
@Table(name = "alocaco")
public class Alocaco implements Serializable {
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

	public Alocaco() {
	}

	public Alocaco(Integer id) {
		this.id = id;
	}

}
