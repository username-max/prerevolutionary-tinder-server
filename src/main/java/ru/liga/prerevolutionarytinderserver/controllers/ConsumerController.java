package ru.liga.prerevolutionarytinderserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.liga.prerevolutionarytinderserver.services.api.ConsumerService;

@RestController
public class ConsumerController {

    private final ConsumerService consumerService;

    @Autowired
    public ConsumerController(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }

    @GetMapping("/")
    public String startTinder() {
        return "HelloWorld!";
    }

    @GetMapping("/влево")
    public String next() {
        return consumerService.next();
    }

    @GetMapping("/вправо")
    public String match() {
        return consumerService.match();
    }

    @GetMapping("/анкета")
    public String profile() {
        return consumerService.profile();
    }

    @GetMapping("/любимцы")
    public String showListMatch() {
        return consumerService.showListMatch();
    }
}
