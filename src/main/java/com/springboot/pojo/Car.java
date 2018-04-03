package com.springboot.pojo;

import java.io.Serializable;
import java.util.Date;

public class Car implements Serializable {
    private static final long serialVersionUID = -5821651550212075426L;

    private String name;
    private Double price;
    private Date createDate;

    public Car() {
    }

    public Car(String name, Double price, Date createDate) {
        this.name = name;
        this.price = price;
        this.createDate = createDate;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", createDate=" + createDate +
                '}';
    }
}
