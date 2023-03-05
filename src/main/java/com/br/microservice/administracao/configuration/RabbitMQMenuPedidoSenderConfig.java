package com.br.microservice.administracao.configuration;


import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Queue;

@Configuration
public class RabbitMQMenuPedidoSenderConfig {

    @Value("${business.microservico.administracao.message.queue.menu_pedido}")
    private String queueName;

    @Bean
    public Queue queue(){
        return new Queue(queueName, true);
        }
    }

