package com.codeforfun.ehcache.spring_ehcache_impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
@EnableCaching
@SpringBootApplication
public class SpringEhcacheImplApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEhcacheImplApplication.class, args);
	}

}
