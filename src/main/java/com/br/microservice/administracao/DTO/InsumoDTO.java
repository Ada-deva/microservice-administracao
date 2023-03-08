package com.br.microservice.administracao.DTO;

import com.br.microservice.administracao.enums.TipoItem;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class InsumoDTO {

    private Long id;
    private String nome;
    private String marca;
    private String unidade;
    private double valor;
    private int quantidade;
    private TipoItem item;



}
