package com.br.microservice.administracao.configuration;


import lombok.RequiredArgsConstructor;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class RabbitMQMenuPedidoSenderConfiguration {

    @Value("{business.administracao.message.queue.menu_pedido}")
    private String queueName;

    @Bean
    public Queue queue(){
        return new Queue(queueName, true);
        }

    }
