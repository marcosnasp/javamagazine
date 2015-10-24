package br.com.devmedia.controleprojeto.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.TypedQuery;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import br.com.devmedia.controleprojeto.entidades.Cidade;
import br.com.devmedia.controleprojeto.entidades.Estado;

/**
 * Web Service REST que popula os dados da cidade e dos estados no banco de
 * dados.
 * 
 * @author marcos
 */
@Stateless
@Path(value = "/populaBancoRest")
public class PopulaBancoRest {

	@PersistenceContext(unitName = "ControleProjetoPU", type = PersistenceContextType.TRANSACTION)
	private EntityManager em;

	/**
	 * Operação REST que realiza a população dos dados das cidades e estados no
	 * banco de dados. Se o mesmo estiver vazio.
	 * 
	 * @return resposta ok.
	 */
	@GET
	@Produces
	public Response popularTabelasEstadosCidades() {
		TypedQuery<Estado> query = em.createQuery("SELECT FROM Estado e", Estado.class);
		List<Estado> estados = new ArrayList<Estado>();

		if (estados.isEmpty()) {
			popularBanco();
			estados = query.getResultList();
		}
		return Response.ok().build();
	}

	/**
	 * Popula os dados do banco de dados.
	 */
	private void popularBanco() {

		Estado saoPaulo = new Estado();
		saoPaulo.setNome("Sao Paulo");
		em.persist(saoPaulo);

		criarCidadesEstadoSaoPaulo(saoPaulo);

		Estado minasGerais = new Estado();
		minasGerais.setNome("Minas Gerais");
		em.persist(minasGerais);

		criarCidadesEstadoMinasGerais(minasGerais);

		Estado rioJaneiro = new Estado();
		rioJaneiro.setNome("Rio de Janeiro");
		em.persist(rioJaneiro);

		criarCidadesEstadoRioJaneiro(rioJaneiro);
	}

	/**
	 * Cria os dados das cidades e estados.
	 * 
	 * @param estado
	 */
	private void criarCidadesEstadoSaoPaulo(Estado estado) {
		Cidade cidade = new Cidade();

		cidade.setNome("Campinas");
		cidade.setEstado(estado);
		em.persist(cidade);

		Cidade cidade2 = new Cidade();

		cidade2.setNome("Ubatuba");
		cidade2.setEstado(estado);
		em.persist(cidade2);

		Cidade cidade3 = new Cidade();

		cidade3.setNome("Ribeirao Preto");
		cidade3.setEstado(estado);
		em.persist(cidade3);
	}

	/**
	 * Cria as cidades do Estado de Minas Gerais.
	 * 
	 * @param estado
	 */
	private void criarCidadesEstadoMinasGerais(Estado estado) {
		Cidade cidade = new Cidade();

		cidade.setNome("Belo Horizonte");
		cidade.setEstado(estado);
		em.persist(cidade);

		Cidade cidade2 = new Cidade();

		cidade2.setNome("Uberlandia");
		cidade2.setEstado(estado);
		em.persist(cidade2);

		Cidade cidade3 = new Cidade();

		cidade3.setNome("Varginha");
		cidade3.setEstado(estado);
		em.persist(cidade3);
	}

	/**
	 * Cria as cidades do estado Rio de Janeiro.
	 * 
	 * @param estado
	 */
	private void criarCidadesEstadoRioJaneiro(Estado estado) {
		Cidade cidade = new Cidade();

		cidade.setNome("Volta Redonda");
		cidade.setEstado(estado);
		em.persist(cidade);

		Cidade cidade2 = new Cidade();

		cidade2.setNome("Cabo Frio");
		cidade2.setEstado(estado);
		em.persist(cidade2);

		Cidade cidade3 = new Cidade();

		cidade3.setNome("Rio de Janeiro");
		cidade3.setEstado(estado);
		em.persist(cidade3);
	}
}
