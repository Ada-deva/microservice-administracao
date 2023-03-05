package com.br.microservice.administracao.model.payload.request;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.Min;

@Data
public class MenuRequest {
    @NonNull
    private Long item;
    @NonNull
    private String descrição;
    @Min(value = 1, message = "Informe um valor acima de 1,00")
    private Double valor;
}

