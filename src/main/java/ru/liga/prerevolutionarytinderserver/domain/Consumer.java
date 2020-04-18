package ru.liga.prerevolutionarytinderserver.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Consumers")
public class Consumer {
    @Id
    @Column(name = "Id")
    private int id;
    @Column(name = "Login")
    private String login;
    @Column(name = "pass")
    private String pass;
    @Column(name = "sex")
    private String sex;
    @Column(name = "description")
    private String description;

    public Consumer(){}

    public Consumer(int id, String login, String pass, String sex, String description){
        this.id = id;
        this.login = login;
        this.pass = pass;
        this.sex = sex;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public String getSex() {
        return sex;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "id='" + id + '\'' +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                ", sex='" + sex + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
