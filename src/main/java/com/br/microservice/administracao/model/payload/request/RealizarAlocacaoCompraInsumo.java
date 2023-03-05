package com.br.microservice.administracao.model.payload.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class RealizarAlocacaoCompraInsumo {
    @NotNull
    private List<InsumoRequest> insumos;

}
