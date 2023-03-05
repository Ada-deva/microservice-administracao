package com.br.microservice.administracao.service;

import com.br.microservice.administracao.entities.Menu;
import com.br.microservice.administracao.model.payload.request.RelatorioMenu;
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

    public RelatorioMenu execute (String descricao){
        log.info("Apresentação Menu executado");
        List<Menu> menuList = menuRepository.findAll();
        RelatorioMenu relatorioMenu = new RelatorioMenu();
        relatorioMenu.setDescricao(descricao);
        relatorioMenu.setValor(menuList.stream().mapToDouble(menu-> menu.getValor().doubleValue()).sum());
        return relatorioMenu;
    }
}
