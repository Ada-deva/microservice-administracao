package com.br.microservice.administracao.DTO;

import com.br.microservice.administracao.entity.Insumo;
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
    @NotNull
    private List<InsumoDTO> insumos;



}
