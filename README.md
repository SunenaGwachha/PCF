# PCF
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

