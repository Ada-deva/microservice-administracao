package com.br.microservice.administracao.service;

import com.br.microservice.administracao.entities.Insumo;
import com.br.microservice.administracao.entities.Menu;
import com.br.microservice.administracao.repository.InsumoRepository;
import com.br.microservice.administracao.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveInsumoService {
    private final InsumoRepository insumoRepository;

    public Insumo executar(Insumo insumo){
        return insumoRepository.save(insumo);
    }
}
