package com.Product.caresale.Controller;


import com.Product.caresale.model.Car;
import com.Product.caresale.service.CarService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    CarService carService;
    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id ) {
        return carService.getCarById(id);
    }
    @PostMapping
    public Car addCar(@Valid @RequestBody Car car) {
        return carService.saveCar(car);
    }
    @DeleteMapping("/{id}")
            public String deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
        return "Car deleted successfully!";
        }
}
