package com.pruebas.springboot.microservicios.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

	@Bean("clienteRestTemplate")
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	}
}
