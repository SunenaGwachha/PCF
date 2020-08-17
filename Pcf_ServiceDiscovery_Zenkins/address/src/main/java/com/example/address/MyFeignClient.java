package com.example.address;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="ADDRESS-SERVICE")
public interface MyFeignClient {

    @GetMapping(value="getAddress")
    String getAddress();

}
