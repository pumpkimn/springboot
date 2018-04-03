package com.springboot.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lee
 * car 实体类
 */
public class Car implements Serializable {
    private static final long serialVersionUID = -5821651550212075426L;

    private String name;
    private Double price;
    /* 时间转换 json 加上时区*/
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss", timezone = "GMT+8")
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
