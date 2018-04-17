package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableWebMvc
@Controller
public class DemoApplication extends WebMvcConfigurerAdapter {
	@RequestMapping("/index")
	@ResponseBody
	public String index() {
		return "RPC CLIENT";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
}
