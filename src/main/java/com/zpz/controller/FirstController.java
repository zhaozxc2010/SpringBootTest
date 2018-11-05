package main.java.com.zpz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FirstController
{
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value="/firstTest")
	@ResponseBody
	public String firstTest()
	{
		return restTemplate.getForEntity("http://compute-service/first", String.class).getBody();
	}
	
	@RequestMapping("/hello")
	public String login(){
		return "hello world!";
	}
	
}
