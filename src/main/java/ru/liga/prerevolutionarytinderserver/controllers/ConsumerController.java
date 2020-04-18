package ru.liga.prerevolutionarytinderserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.liga.prerevolutionarytinderserver.dao.ConsumerDao;
import ru.liga.prerevolutionarytinderserver.services.api.ConsumerService;

@RestController
public class ConsumerController {

    private final ConsumerService consumerService;
    private final ConsumerDao consumerDao;

    @Autowired
    public ConsumerController(ConsumerService consumerService, ConsumerDao consumerDao) {
        this.consumerService = consumerService;
        this.consumerDao = consumerDao;
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

    @GetMapping("/find")
    public String find(@RequestParam String id) {
        return consumerDao.findByLogin(id).toString();
    }
}
