package com.ensa.msgateway;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;


@EnableEurekaServer
@SpringBootApplication
public class MsGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsGatewayApplication.class, args);
    }
/*
    //route static
    //@Bean
    RouteLocator staticRoutes(RouteLocatorBuilder builder){
        returnbuilder.routes()
                .route(r-> r.path("/customers/**").uri("lb://MS-CUSTOMER").id(1))
                .route(r-> r.path("/customers/**").uri("lb://MS-INVOICE").id(2))
                .build();
    }

  //**
    @Bean
    DiscoveryClientRouteDefinitionLocator discoveryRoutes(DiscoveryClient dc, DiscoveryLocatorProperties dlp) {
        return new DiscoveryClientRouteDefinitionLocator(dc, dlp);
    }

 */
}
