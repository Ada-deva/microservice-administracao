package com.br.microservice.administracao.controller;

import com.br.microservice.administracao.DTO.InsumoDTO;
import com.br.microservice.administracao.service.CreateInsumoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/insumo")
public class InsumoController {

    private final CreateInsumoService createInsumoService;

    @PostMapping(path = "/compra")
    @ResponseStatus(HttpStatus.CREATED)
    public void realizarAlocaoCompra (@RequestBody InsumoDTO realizarAlocacaoCompraInsumoDTO){
        createInsumoService.execute(realizarAlocacaoCompraInsumoDTO);
    }
}
