package com.example.scdemo.modules.test.controller;

import javax.xml.ws.RespectBinding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.scdemo.modules.test.vo.ConfigBean;

@Controller
public class Testcontroller {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(Testcontroller.class);
	
	
	@Value("${server.port}")
	private int port;
	@Value("${com.thornBird.name}")
	private String name;
	@Value("${com.thornBird.age}")
	private int age;
	@Value("${com.thornBird.desc}")
	private String desc;
	@Value("${com.thornBird.random}")
	private String random;
	
	@Autowired
	private ConfigBean configBean; 
	
	@RequestMapping("/test/log")
	@ResponseBody
	public String logTest(){
		LOGGER.trace("This is TRACE log");
		LOGGER.debug("This is DEBUG log");
		LOGGER.info("This is INFO log");
		LOGGER.warn("This is WARN log");
		LOGGER.error("This is ERROR log");
		
		return "this is log test. 这是log测试";
	}
	
	@RequestMapping("/test/config")
	@ResponseBody
	public String configTest(){
		StringBuffer s = new StringBuffer();
		s.append(port).append("---")
		.append(name).append("---")
		.append(age).append("---")
		.append(desc).append("---")
		.append(random).append("---").append("</br>");
		s.append(configBean.getName()).append("---")
		.append(configBean.getAge()).append("---")
		.append(configBean.getDesc()).append("---")
		.append(configBean.getRandom()).append("---");
		return s.toString();
	}
	
	
	@RequestMapping("/test/appDesc")
	@ResponseBody
	public String getAppDesc(){
		return "Hello word,this is spring boot demo.";
	}
}
