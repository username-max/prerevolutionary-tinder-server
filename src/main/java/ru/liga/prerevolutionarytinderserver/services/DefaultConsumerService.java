package ru.liga.prerevolutionarytinderserver.services;

import ru.liga.prerevolutionarytinderserver.services.api.ConsumerService;

public class DefaultConsumerService implements ConsumerService {
    @Override
    public String next() {
        return "Следующая анкета";
    }

    @Override
    public String match() {
        return "|| Вы любимы ||";
    }

    @Override
    public String profile() {
        return "Ваш профиль";
    }

    @Override
    public String showListMatch() {
        return "Петя, Женя";
    }
}
