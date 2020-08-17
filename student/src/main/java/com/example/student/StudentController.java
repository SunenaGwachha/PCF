package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    MyFeignClient myFeignClient;

    @GetMapping("/name")
    public String getName(){
        return "Sunena Gwachha CITI BANK";
    }


    @GetMapping("/addressfromaddress")
    public String communicate() {

        return myFeignClient.getAddress();

    }

}
