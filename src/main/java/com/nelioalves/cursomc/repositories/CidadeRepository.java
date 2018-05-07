package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Cidade;

//É uma interface que herda de JpaRepository acessando os dados do tipo Categoria com o atributo identificador Integer (do id)
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
