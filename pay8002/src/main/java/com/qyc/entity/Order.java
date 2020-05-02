package com.qyc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author qyc
 * @time 2020/4/23 - 15:13
 */
@Entity
@Table(name = "qqqqq")
public class Order {
    @Id
    private int id;
    private String number;

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Order(int id, String number) {
        this.id = id;
        this.number = number;
    }
}
