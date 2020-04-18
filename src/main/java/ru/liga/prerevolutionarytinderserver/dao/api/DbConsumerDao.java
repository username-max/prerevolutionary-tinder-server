package ru.liga.prerevolutionarytinderserver.dao.api;

import ru.liga.prerevolutionarytinderserver.domain.Consumer;

public interface DbConsumerDao {

    void showAllConsumers();

    void showAllMatchConsumers();

    int add(String login, String pass, String description);

    Consumer findById(int id);

    Consumer findByLogin(String login);

    Consumer findByPassword(String pass);

    Consumer findByLoginAndPassword(String login, String pass);

    int save(Consumer consumer);

    void delete(Consumer consumer);


}
