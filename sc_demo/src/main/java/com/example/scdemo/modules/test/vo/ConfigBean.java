package com.example.scdemo.modules.test.vo;

import javax.xml.ws.RespectBinding;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@PropertySource("classpath:config/application222222.properties")
@ConfigurationProperties(prefix = "com.thorn.bird")
public class ConfigBean {
	
	private int port;
	private String name;
	private int age;
	private String desc;
	private String random;
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getRandom() {
		return random;
	}

	public void setRandom(String random) {
		this.random = random;
	}

	@Override
	public String toString() {
		return "ConfigBean [port=" + port + ", name=" + name + ", age=" + age + ", desc=" + desc + ", random=" + random
				+ "]";
	}

	@RequestMapping("/test/config")
	@ResponseBody
	public String configTest(){
		StringBuffer s = new StringBuffer();
		s.append(port).append("---")
		.append(name).append("---")
		.append(age).append("---")
		.append(desc).append("---")
		.append(random).append("---");
		return s.toString();
	}
	
}
