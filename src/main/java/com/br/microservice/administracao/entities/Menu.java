package com.br.microservice.administracao.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table (name = "Menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long item;

    private String descrição;

    private List<Insumo> insumo;

    private Double valor;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = (insumo.stream().mapToDouble(vlr-> vlr.getValor()).reduce(0, Double::sum)*1.7);
    }
}
