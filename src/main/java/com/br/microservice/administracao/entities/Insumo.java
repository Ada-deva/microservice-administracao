package com.br.microservice.administracao.entities;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "Insumo")
public class Insumo {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long item;

    private String descricao;

    private int quantidade;

    private Double valor;
}
