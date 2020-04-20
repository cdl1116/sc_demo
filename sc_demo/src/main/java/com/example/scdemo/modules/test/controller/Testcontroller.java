package com.example.scdemo.modules.test.controller;

import javax.xml.ws.RespectBinding;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Testcontroller {
	@RequestMapping("/test/appDesc")
	@ResponseBody
	public String getAppDesc(){
		return "Hello word,this is spring boot demo.";
	}
}
