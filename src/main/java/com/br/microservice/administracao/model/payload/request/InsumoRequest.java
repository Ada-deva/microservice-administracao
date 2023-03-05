package com.br.microservice.administracao.model.payload.request;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class InsumoRequest {
    @NotNull
    private Long item;
    @NotNull
    private String descrição;
    @Min(value = 1, "Informe uma quantiadade mínima para atualizar insumos")
    private String qtd;
    @Min(value = 1, "Informe valor minimo do insumo")
    private Double valor;

}
