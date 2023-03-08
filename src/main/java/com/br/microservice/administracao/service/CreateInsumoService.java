package com.br.microservice.administracao.service;

import com.br.microservice.administracao.entity.Insumo;
import com.br.microservice.administracao.DTO.InsumoDTO;
import com.br.microservice.administracao.repository.InsumoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateInsumoService {

    private final InsumoRepository insumoRepository;

    @CacheEvict(cacheNames = "rlinsumo", allEntries = true)
    public void execute(InsumoDTO insumoDTO){
        Insumo insumo = new Insumo();
        BeanUtils.copyProperties(insumoDTO.getId(),insumo);
        insumoRepository.save(insumo);
    }

}
