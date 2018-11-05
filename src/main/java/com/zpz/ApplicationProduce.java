package main.java.com.zpz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Springboot生产者
 * @author zpz
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationProduce extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer

{
	public static void main(String[] args)
	{
		SpringApplication.run(ApplicationProduce.class,args);
	}

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container)
	{
		// TODO 获取未被占用的端口
		int port = 8080;
		container.setPort(port);
		
	}

}
