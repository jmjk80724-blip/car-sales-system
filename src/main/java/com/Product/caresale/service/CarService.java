package com.Product.caresale.service;

import com.Product.caresale.model.Car;
import com.Product.caresale.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    public List<Car> getAllCars() {
        return  carRepository.findAll();
    }
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
