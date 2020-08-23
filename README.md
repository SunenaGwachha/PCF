# PCF

    Terminal Command
    Goto the project folder from terminal
    cf login
    Put this
        https://api.run.pivotal.io
    Give email Id:sunenagwachha@gmail.com
    and password:Ss--!
    cf push test-environment –-random-route -p target\employee-producer-0.0.1-SNAPSHOT.jar
    Create  file manifest.yaml manual in project or through command
    And just need to do cf push next time


Security, web , acutator dependency chahin6 ani yo cofig file banawunu par6


<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>io.pivotal.spring.cloud</groupId>
            <artifactId>spring-cloud-services-starter-service-registry</artifactId>
        </dependency>

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
