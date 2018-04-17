package com.example.demo.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import com.m24.demo.rpc.api.RmiService;

@Configuration
public class RmiConfig {
	@Bean
	public RmiProxyFactoryBean rmiService() {
		RmiProxyFactoryBean rmi = new RmiProxyFactoryBean();
		rmi.setServiceUrl("rmi://localhost/rmiService");
		rmi.setServiceInterface(RmiService.class);
		
//		rmi.setLookupStubOnStartup(false );
//		rmi.setRefreshStubOnConnectFailure(true );
//		rmi.afterPropertiesSet();
		
		return rmi;
	}
}
