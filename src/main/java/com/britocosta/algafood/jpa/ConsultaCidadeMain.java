package com.britocosta.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.britocosta.algafood.AlgafoodApiApplication;
import com.britocosta.algafood.domain.model.Cidade;
import com.britocosta.algafood.domain.repository.CidadeRepository;

public class ConsultaCidadeMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE).run(args);

		CidadeRepository cidadeRepository = applicationContext.getBean(CidadeRepository.class);

		List<Cidade> todasCidades = cidadeRepository.findAll();

		for (Cidade cidade : todasCidades) {

			System.out.printf("%s - %s\n", cidade.getName(), cidade.getEstado(), cidade.getName());

		}

	}

}
