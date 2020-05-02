package com.qyc.hystrix.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author qyc
 * @time 2020/5/2 - 22:49
 */
@Entity
@Table(name = "qqqqq")
public class Order implements Serializable {
    @Id
    private int id;
    private String number;

    public Order(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public Order() {
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

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
