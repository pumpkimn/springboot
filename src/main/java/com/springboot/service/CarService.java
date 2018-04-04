package com.springboot.service;

import com.springboot.domain.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author lee  业务逻辑类
 *
 */
@Service
public class CarService {
    public List<Car> list() {
        Car car = new Car(1,"法拉利", 558d, new Date());
        Car car1 = new Car(2,"兰博基尼", 558d, new Date());
        Car car2 = new Car(3,"奥托", 558d, new Date());
        Car car3 = new Car(4,"奥迪", 558d, new Date());


        List<Car> list = new ArrayList<>();
        list.add(car);
        list.add(car1);
        list.add(car2);
        list.add(car3);
        return list;
    }
}
