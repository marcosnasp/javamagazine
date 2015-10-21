package br.com.devmedia.controleprojeto.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "colaborador")
public class Colaborador implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "SEXO")
	private String sexo;
	
	@Column(name = "DATA_NASCIMENTO")
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@Column(name = "REMUNERACAO")
	private Double remuneracao;
	
	@Column(name = "EMAIL")
	private String email;
	
	@JoinColumn(name = "DEPARTAMENTO_ID", referencedColumnName = "ID")
	@ManyToOne
	private Departamento departamentoId;
	
	@OneToMany(mappedBy = "colaboradorId")
	private List<Alocaco> alocacoList;

	public Colaborador() {
	}

	public Colaborador(Integer id) {
		this.id = id;
	}
	
}	
