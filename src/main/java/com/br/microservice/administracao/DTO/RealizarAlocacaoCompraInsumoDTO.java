package com.br.microservice.administracao.DTO;

import com.br.microservice.administracao.entity.Insumo;
import com.br.microservice.administracao.enums.TipoItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RealizarAlocacaoCompraInsumoDTO {
    @JsonProperty(value = "preco_compra")
    private double precoCompra;

    private String marca;

    private int quantidade;

    @JsonProperty("unidade_quantidade")
    private int unidadeQuantidade;

    private String unidade;

    private TipoItem item;


}
