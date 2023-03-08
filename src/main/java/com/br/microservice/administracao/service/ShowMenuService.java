package com.br.microservice.administracao.service;

import com.br.microservice.administracao.entity.Menu;
import com.br.microservice.administracao.DTO.RelatorioMenuDTO;
import com.br.microservice.administracao.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ShowMenuService {

    private final MenuRepository menuRepository;

    @Cacheable (cacheNames = "showMenu", key = "#item")

    public RelatorioMenuDTO execute (String descricao){
        log.info("Apresentação Menu executado");
        List<Menu> menuList = menuRepository.findAll();
        RelatorioMenuDTO relatorioMenuDTO = new RelatorioMenuDTO();
        relatorioMenuDTO.setDescricao(descricao);
        relatorioMenuDTO.setValor(menuList.stream().mapToDouble(menu-> menu.getValor().doubleValue()).sum());
        return relatorioMenuDTO;
    }
}
