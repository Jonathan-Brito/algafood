package com.britocosta.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.britocosta.algafood.AlgafoodApiApplication;
import com.britocosta.algafood.domain.model.Permissao;
import com.britocosta.algafood.domain.repository.PermissaoRepository;

public class ConsultaPermissaoMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE).run(args);

		PermissaoRepository permissaoRepository = applicationContext.getBean(PermissaoRepository.class);

		List<Permissao> todasPermissoes = permissaoRepository.findAll();

		for (Permissao permissao : todasPermissoes) {

			System.out.printf("%s - %s\n", permissao.getName(), permissao.getDescription());

		}

	}

}
