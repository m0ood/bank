package com.bank.Web.bank.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Money {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer money;
    private Long user_id;

    public Money(Long id, Integer money, Long user_id) {
        this.id = id;
        this.money = money;
        this.user_id = user_id;
    }

    public Money(Integer money, Long user_id) {
        this.money = money;
        this.user_id = user_id;
    }

    public Money() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}
