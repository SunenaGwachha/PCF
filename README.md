# PCF

Security dependency chahin6 ani yo cofig file banawunu par6

package com.example.student.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class Config extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().permitAll();
    }
}


Inside pom.xml choose this range 2.--3.0 range spring version otherwise it doesnot support Pcf service discovery go to https://start.spring.io/ get correct dependency from there


       <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.2.9.RELEASE</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    
    <dependency>
            <groupId>io.pivotal.spring.cloud</groupId>
            <artifactId>spring-cloud-services-starter-service-registry</artifactId>
        </dependency>


Link follow for simple helloworld
https://www.youtube.com/watch?v=bafEegslWoc

Link follow for MySQL
https://www.youtube.com/watch?v=ftpDc-D-hYM
https://www.javainuse.com/pcf/pcf-sql


Link follow for rabit MQ
https://www.javainuse.com/pcf/pcf-rabbitmq

Link follow for service registry
https://www.youtube.com/watch?v=-1vRg22chr0

Link follow for service registry and zenkins
https://www.youtube.com/watch?v=1fPTOhn8fgk

see the groovy script
