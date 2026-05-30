package com.Product.caresale.service;

import com.Product.caresale.exception.ResourceNotFoundException;
import com.Product.caresale.model.Car;
import com.Product.caresale.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;  // create auto table to postgre sql

    public List<Car> getAllCars() {
        return  carRepository.findAll();
    }
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }
    public Car getCarById(Long id) {
        return carRepository.findById(id)
                .orElseThrow (() ->
                   new ResourceNotFoundException(
                           "Car with id " + id + " not found"));
    }
    public void deleteCar(Long id) {
       if(!carRepository.existsById(id)) {
           throw new ResourceNotFoundException(
                   "Car with id " + id + "not found!");
       }
       carRepository.deleteById(id);
    }
}
