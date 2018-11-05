package main.java.com.zpz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootStart
{
	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootStart.class, args);
	}
}
