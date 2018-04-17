package com.example.demo.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import com.m24.demo.rpc.api.HessianService;

@Configuration
public class HessianConfig {
	@Bean
    public HessianProxyFactoryBean hessianService() {
        HessianProxyFactoryBean factory = new HessianProxyFactoryBean();
        factory.setServiceUrl("http://localhost:8080/hessianService");
        factory.setServiceInterface(HessianService.class);
        return factory;
    }
}
