package com.example.zuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableZuulProxy
@EnableZuulServer
@EnableDiscoveryClient
public class ZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServerApplication.class, args);
	}

//	@Bean
//	public PreFilter preFilter() {
//		System.out.println("prefilter");
//		return new PreFilter();
//	}
//	@Bean
//	public PostFilter postFilter() {
//		return new PostFilter();
//	}
//	@Bean
//	public ErrorFilter errorFilter() {
//		return new ErrorFilter();
//	}
//	@Bean
//	public RouteFilter routeFilter() {
//		return new RouteFilter();
//	}
}
