package com.springboot.controller;

import com.springboot.domain.Car;
import com.springboot.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lee
 *  控制层
 */
@RestController
@RequestMapping("/api")
public class CarController {
    @Autowired
    private CarService carService ;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResponseEntity<?> carList(){
        CustomType customType = new CustomType(400,"查询不到");
        List<Car> list = carService.list();
        if (list != null){
            customType.setCode(200);
            customType.setMessage("查询以下数据"+list);
        }
        return new ResponseEntity<>(customType, HttpStatus.OK);
    }

}
