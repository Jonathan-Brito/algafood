package com.britocosta.algafood.domain;

import java.util.List;

import com.britocosta.algafood.domain.model.Cozinha;

import lombok.Data;
import lombok.NonNull;

@Data
public class CozinhasXmlWrapper {
	
	@NonNull
	private List<Cozinha> cozinas;

}
