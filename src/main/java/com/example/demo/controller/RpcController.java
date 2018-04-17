package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.m24.demo.rpc.api.BurlapService;
import com.m24.demo.rpc.api.HessianService;
import com.m24.demo.rpc.api.HttpInvokerService;
import com.m24.demo.rpc.api.RmiService;

@Controller
public class RpcController {
	@Autowired
	HessianService hessianService;
	@Autowired
	RmiService rmiService;
	@Autowired
	BurlapService burlapService;
	@Autowired
	HttpInvokerService httpInvokerService;
	
	@RequestMapping("/hessian")
	@ResponseBody
	public String hessian() {
		return hessianService.getMsg();
	}
	
	@RequestMapping("/rmi")
	@ResponseBody
	public String rmi() {
		return rmiService.getMsg();
	}
	
	@RequestMapping("/burlap")
	@ResponseBody
	public String burlap() {
		return burlapService.getMsg();
	}
	
	@RequestMapping("/httpInvoker")
	@ResponseBody
	public String httpInvoker() {
		return httpInvokerService.getMsg();
	}
}
