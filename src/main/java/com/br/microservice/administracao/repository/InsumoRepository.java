package com.br.microservice.administracao.repository;

import com.br.microservice.administracao.entities.Insumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsumoRepository extends JpaRepository<Insumo, Long> {

}
