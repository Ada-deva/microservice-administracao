package com.br.microservice.administracao.service;

import com.br.microservice.administracao.entity.Menu;
import com.br.microservice.administracao.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CreateOrRetriverMenuService {

        private final MenuRepository menuRepository;

    public Menu salvar(Menu menu){
        menu.setDescricao(UUID.randomUUID().toString());
        return menuRepository.findByDescricao(menu.getDescricao())
                .orElse(menuRepository.save(menu));
    }
}
