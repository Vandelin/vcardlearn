package com.example.demo;

import ezvcard.VCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class NewController {

    @Autowired
    private NewService newService;

    @GetMapping("/new")
    public VCard bo(){
        return newService.generate();
    }
}
