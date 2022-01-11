package com.britocosta.algafood.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.britocosta.algafood.domain.model.Cozinha;

@Repository
public interface CozinhaRepository extends JpaRepository<Cozinha, Long>{
	
	//List<Cozinha> listar();
	//Cozinha buscar(Long id);
	//Cozinha salvar(Cozinha cozinha);
	//void remover(Long id);
}
