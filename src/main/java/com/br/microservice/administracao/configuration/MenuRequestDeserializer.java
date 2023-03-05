package com.br.microservice.administracao.configuration;

import com.br.microservice.administracao.model.payload.request.InsumoRequest;
import com.br.microservice.administracao.model.payload.request.MenuRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.serializer.Deserializer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class MenuRequestDeserializer implements Deserializer<MenuRequest>{

    private final ObjectMapper objectMapper;

    @Override
    public MenuRequest deserialize(String s, byte[] bytes) {
        log.info("Deserializando um objeto no tópico {}", s);
        String message = new String(bytes, StandardCharsets.UTF_8);
        try {
            return objectMapper.readValue(message, MenuRequest.class);
        } catch (JsonProcessingException e) {
            log.error("Não foi possível converter a mensagem no objeto desejado");
            return null;
        }

    }

    public MenuRequestDeserializer(){
        this.objectMapper = new ObjectMapper();
    }


}
