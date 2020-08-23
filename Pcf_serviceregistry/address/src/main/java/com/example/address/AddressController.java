package com.example.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private MyFeignClient myFeignClient;

    @GetMapping("/address")
    public String getAddress(){
        return "Address From Address Controller";
    }


    @GetMapping("/getNameFromStudentService")
    public String getStudentName(){


        return myFeignClient.getStdName();


    }

}
