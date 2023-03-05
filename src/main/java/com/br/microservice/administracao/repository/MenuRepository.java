package com.br.microservice.administracao.repository;

import com.br.microservice.administracao.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MenuRepository extends JpaRepository <Menu, Long> {
    Optional<Menu> findByDecricao(String descricao);
}
