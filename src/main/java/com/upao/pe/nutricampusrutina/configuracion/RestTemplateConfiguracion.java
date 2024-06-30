package com.upao.pe.nutricampusrutina.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguracion {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
