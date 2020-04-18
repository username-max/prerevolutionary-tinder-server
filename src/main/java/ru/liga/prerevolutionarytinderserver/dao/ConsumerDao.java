package ru.liga.prerevolutionarytinderserver.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Component;
import ru.liga.prerevolutionarytinderserver.dao.api.DbConsumerDao;
import ru.liga.prerevolutionarytinderserver.domain.Consumer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class ConsumerDao  implements DbConsumerDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void showAllConsumers() {
    }

    @Override
    public void showAllMatchConsumers() {

    }

    @Override
    public int add(String login, String pass, String description) {
        return 0;
    }

    @Override
    public Consumer findById(int id) {
        return entityManager.find(Consumer.class, id);
    }

    @Override
    public Consumer findByLogin(String login) {
        return entityManager.find(Consumer.class, login);
    }

    @Override
    public Consumer findByPassword(String pass) {
        return null;
    }

    @Override
    public Consumer findByLoginAndPassword(String login, String pass) {
        return null;
    }

    @Override
    public int save(Consumer consumer) {
        entityManager.persist(consumer);
        return consumer.getId();
    }

    @Override
    public void delete(Consumer consumer) {

    }
}
