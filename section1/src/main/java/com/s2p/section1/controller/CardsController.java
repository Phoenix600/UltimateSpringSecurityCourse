package com.s2p.section1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping("/myCards")
    public  String getCardsDetails () {
        return "Here are the card details from the DB";
    }

}