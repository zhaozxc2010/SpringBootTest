package main.java.com.zpz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka注册中心
 * @author zpz
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRegister

{
	public static void main(String[] args)
	{
		SpringApplication.run(ApplicationRegister.class, args);
	}

}
