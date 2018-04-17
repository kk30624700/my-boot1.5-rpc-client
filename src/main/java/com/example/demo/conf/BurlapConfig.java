package com.example.demo.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.BurlapProxyFactoryBean;

import com.m24.demo.rpc.api.BurlapService;

@Configuration
public class BurlapConfig {
	@Bean
    public BurlapProxyFactoryBean burlapService() {
		BurlapProxyFactoryBean factory = new BurlapProxyFactoryBean();
        factory.setServiceUrl("http://localhost:8080/burlapService");
        factory.setServiceInterface(BurlapService.class);
        return factory;
    }
}
