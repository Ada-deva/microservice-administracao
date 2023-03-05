package com.br.microservice.administracao.service;

import com.br.microservice.administracao.entities.Menu;
import com.br.microservice.administracao.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CreateOrRetriverMenuService {

        private final MenuRepository menuRepository;

    public Menu execute(Menu menu){
        menu.setDescrição(UUID.randomUUID().toString());
        return menuRepository.findByDecricao(menu.getDescrição())
                .orElse(menuRepository.save(menu));
    }
}
