package com.br.microservice.administracao.service;


import com.br.microservice.administracao.entity.Menu;
import com.br.microservice.administracao.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveMenuService {

    private final MenuRepository menuRepository;

    public Menu salvar(Menu menu){
        return menuRepository.save(menu);
    }

}
