package com.britocosta.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.britocosta.algafood.AlgafoodApiApplication;
import com.britocosta.algafood.domain.model.FormaPagamento;
import com.britocosta.algafood.domain.repository.FormaPagamentoRepository;

public class FormaPagamentoMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE).run(args);

		FormaPagamentoRepository formaPagamentoRepository = applicationContext.getBean(FormaPagamentoRepository.class);

		List<FormaPagamento> todasFormasPagamento = formaPagamentoRepository.findAll();

		for (FormaPagamento formaPagamento : todasFormasPagamento) {

			System.out.println(formaPagamento.getDescription());

		}

	}

}
