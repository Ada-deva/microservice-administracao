package com.br.microservice.administracao.service;

import com.br.microservice.administracao.entities.Insumo;
import com.br.microservice.administracao.repository.InsumoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateOrReatriverInsumoService {

        private final InsumoRepository insumoRepository;

        public Insumo execute(Insumo insumo){
            return insumoRepository.findById(insumo.getItem())
                    .orElse(insumoRepository.save(insumo));
        }
}
