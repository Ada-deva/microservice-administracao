package com.br.microservice.administracao.service;

import com.br.microservice.administracao.entities.Insumo;
import com.br.microservice.administracao.model.payload.request.InsumoRequest;
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
    public void execute(InsumoRequest insumoRequest){
        Insumo insumo = new Insumo();
        BeanUtils.copyProperties(insumoRequest.getDescrição(),insumo);
        insumoRepository.save(insumo);
    }

}
