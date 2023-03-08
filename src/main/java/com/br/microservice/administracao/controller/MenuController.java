package com.br.microservice.administracao.controller;

import com.br.microservice.administracao.DTO.RelatorioMenuDTO;
import com.br.microservice.administracao.service.ShowMenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu")
@RequiredArgsConstructor
@Slf4j
public class MenuController {

    private final ShowMenuService showMenuService;



    @GetMapping(path = "/showmenu/{descricao}")
    public RelatorioMenuDTO getRelatorioMenu(@PathVariable String descricao){
        return showMenuService.execute(descricao);
    }

}
