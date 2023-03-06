package com.br.microservice.administracao.controller;

import com.br.microservice.administracao.model.payload.request.EnviarMenuPedidoRequest;
import com.br.microservice.administracao.model.payload.request.RealizarAlocacaoCompraInsumo;
import com.br.microservice.administracao.service.CreateInsumoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/insumo")
public class InsumoController {

    private final CreateInsumoService createInsumoService;

    @PostMapping(path = "/compra")
    @ResponseStatus(HttpStatus.CREATED)
    public void realizarAlocaoCompra (@RequestBody RealizarAlocacaoCompraInsumo realizarAlocacaoCompraInsumo){
        log.info("Ordem de compra recebido {}",realizarAlocacaoCompraInsumo);
        createInsumoService.execute(realizarAlocacaoCompraInsumo);
    }
}
