package com.br.microservice.administracao.service;

import com.br.microservice.administracao.entity.Insumo;
import com.br.microservice.administracao.repository.InsumoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateOrReatriverInsumoService {

        private final InsumoRepository insumoRepository;

        public Insumo salvar(Insumo insumo){
            return insumoRepository.findById(insumo.getId())
                    .orElse(insumoRepository.save(insumo));
        }
}
