package com.example.demo.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import com.m24.demo.rpc.api.HttpInvokerService;

@Configuration
public class HttpinvokeConfig {
	@Bean
    public HttpInvokerProxyFactoryBean httpInvokerService() {
		HttpInvokerProxyFactoryBean factory = new HttpInvokerProxyFactoryBean();
        factory.setServiceUrl("http://localhost:8080/httpInvokerService");
        factory.setServiceInterface(HttpInvokerService.class);
        return factory;
    }
}
