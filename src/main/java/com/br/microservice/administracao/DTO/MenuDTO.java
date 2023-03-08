package com.br.microservice.administracao.DTO;

import com.br.microservice.administracao.entity.Menu;
import lombok.*;

import javax.validation.constraints.Min;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuDTO {

    private String descricao;

    private Double valor;

    public MenuDTO of (Menu menu){
        return MenuDTO.builder()
                .descricao(menu.getDescricao())
                .valor(menu.getValor())
                .build();
    }

    public Menu toEntity (){
        return Menu.builder()
                .descricao(descricao)
                .valor(valor)
                .build();
    }
}

