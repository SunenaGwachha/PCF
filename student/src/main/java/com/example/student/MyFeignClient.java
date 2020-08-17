package com.example.student;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="ADDRESS-SERVICE")
public interface MyFeignClient {

    @GetMapping(value="address")
    String getAddress();

}