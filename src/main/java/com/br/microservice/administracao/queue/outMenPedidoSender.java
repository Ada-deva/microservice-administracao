package com.br.microservice.administracao.queue;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import java.util.Queue;

@Component
@RequiredArgsConstructor
@Slf4j
public class outMenPedidoSender {

       private final RabbitTemplate rabbitTemplate;

        private final Queue queue;

        private final ObjectMapper objectMapper;

        public void send(enviarMenuPedido enviarMenuPedido) {
            String message = null;
            try {
                message = objectMapper.writeValueAsString(enviarMenuPedido);
                log.info("Mensagem enviada para o Rabbit {} {}",
                        enviarMenuPedido.getItems(), realizarPagamentoFinanceiro.getFornecedor());
                rabbitTemplate.convertSendAndReceive(queue.getName(),message);

            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
}
