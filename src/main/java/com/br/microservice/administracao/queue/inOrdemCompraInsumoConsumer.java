package com.br.microservice.administracao.queue;

import com.br.microservice.administracao.model.payload.request.InsumoRequest;
import com.br.microservice.administracao.service.CreateInsumoService;
import com.br.microservice.administracao.service.SaveInsumoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class inOrdemCompraInsumoConsumer {

    private final ObjectMapper objectMapper;
    private final CreateInsumoService createInsumoService;
    @RabbitListener (queues = "${business.message.queue.ordem_compra}")
    public void receiveMessage (String message) throws JsonProcessingException{
        InsumoRequest insumoRequest = objectMapper.readValue(message, InsumoRequest.class);
        createInsumoService.execute(insumoRequest);
    }

}
