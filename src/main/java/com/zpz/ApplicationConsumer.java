package main.java.com.zpz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Springboot消费者
 * @author zpz
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationConsumer
{
	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
	public static void main(String[] args)
	{
		SpringApplication.run(ApplicationConsumer.class,args);
	}

}
