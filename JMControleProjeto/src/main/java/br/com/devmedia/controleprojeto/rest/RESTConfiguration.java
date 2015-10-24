package br.com.devmedia.controleprojeto.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * <p>
 * Essa classe foi criada para determinar que todos os serviços RESTful de nosso
 * sistema terão como path principal: localhost:8080/JMControleProjeto/recursos/
 * <nome_do_recurso>. Esta definição é feita através da
 * anotação @ApplicationPath, observada sobre a assinatura da classe.
 * </p>
 * <p>
 * Leia mais em: Como construir uma aplicação de Controle de Projetos com JavaEE
 * – Parte 1:
 * <a href="http://www.devmedia.com.br/como-construir-uma-aplicacao-de-controle-de-
 * projetos-com-javaee-parte-1/32873#ixzz3pV9gJyug">aplicação
 * de controle de projetos javaee 7</a>
 * </p>
 * 
 * @author marcos
 */
@ApplicationPath(value = "recursos")
public class RESTConfiguration extends Application {

}