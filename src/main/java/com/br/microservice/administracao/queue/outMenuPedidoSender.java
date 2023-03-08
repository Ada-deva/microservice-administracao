package com.br.microservice.administracao.queue;


import com.br.microservice.administracao.DTO.MenuDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import java.util.Queue;

@Component
@RequiredArgsConstructor
@Slf4j
public class outMenuPedidoSender {

    private final RabbitTemplate rabbitTemplate;

    private final Queue queue;

    private final ObjectMapper objectMapper;

    public void send(MenuDTO menuDTO) {
        String message = null;
        try {
            message = objectMapper.writeValueAsString(menuDTO);
            log.info("Mensagem enviada para o Rabbit {}",
                    menuDTO.getDescricao(),
                    menuDTO.getValor());
            rabbitTemplate.convertSendAndReceive(queue.toString(),message);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}