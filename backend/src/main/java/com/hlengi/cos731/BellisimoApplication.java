package com.hlengi.cos731;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class BellisimoApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(BellisimoApplication.class, args);
	}
        
        @Bean
        public SimpleZuulFilter filter()
        {
            return new SimpleZuulFilter();
        }
}
