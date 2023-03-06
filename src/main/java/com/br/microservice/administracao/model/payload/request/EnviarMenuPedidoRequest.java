package com.br.microservice.administracao.model.payload.request;

import lombok.Data;
import org.wildfly.common.annotation.NotNull;

import java.util.List;

@Data
public class EnviarMenuPedidoRequest {

    @NotNull
    private List<MenuRequest> menu;


}
