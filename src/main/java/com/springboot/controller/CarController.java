package com.springboot.controller;

import com.springboot.domain.Car;
import com.springboot.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/**
 * @author lee
 *  控制层
 */
/*@RestController
@RequestMapping("/api")*/
@Controller
public class CarController {
    @Autowired
    private CarService carService ;

   // @RequestMapping(value = "/list",method = RequestMethod.GET)
    @GetMapping("carlist")
    public ModelAndView carList(){
        CustomType customType = new CustomType(400,"查询不到");
        List<Car> cars = carService.list();
        ModelAndView mv = new ModelAndView();
                mv.setViewName("carlist");
                mv.addObject("cars",cars);

                Car car = new Car();
                car.setId(5);
                car.setName("vovo");
                car.setCreateDate(new Date());
                car.setPrice(55558d);
        mv.addObject("car",car);
        return mv;
    }


    //http://127.0.0.1:8086/hithymeleaf
    //http://127.0.0.1:8086/hithymeleaf?name=lee
    @RequestMapping("hithymeleaf")
    public String himThyeleaf(
            @RequestParam(value = "name",required = false,defaultValue = "world") String name, Model model
    ){
        //模型数据
        model.addAttribute("name",name);
        //试图(resoureces 下的模板中的html：hello.html)
        // 转发到页面 hello.html3
        return "hello";
    }

}
