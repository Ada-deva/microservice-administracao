package com.br.microservice.administracao.configuration;
import com.br.microservice.administracao.DTO.MenuDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.Serializer;
import org.springframework.context.annotation.Configuration;


import java.nio.charset.StandardCharsets;
import java.util.Objects;


@Configuration
@Slf4j
@RequiredArgsConstructor
public class MenuRequestSerializer implements Serializer<MenuDTO> {

    private final ObjectMapper objectMapper;

    @Override
    public byte[] serialize(String s, MenuDTO menuDTO) {
        try {
            if(Objects.nonNull(menuDTO)){

                String message = objectMapper.writeValueAsString(menuDTO);
                return message.getBytes(StandardCharsets.UTF_8);

            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return new byte[0];
    }



    public MenuRequestSerializer (){
        this.objectMapper = new ObjectMapper();
    }


}
