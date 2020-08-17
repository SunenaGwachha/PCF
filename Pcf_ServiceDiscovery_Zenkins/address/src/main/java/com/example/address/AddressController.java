package com.example.address;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @GetMapping("/address")
    public String getAddress(){
        return "Address From Address Controller";
    }

}
