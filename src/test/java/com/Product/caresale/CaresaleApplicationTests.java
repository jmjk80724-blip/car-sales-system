package com.Product.caresale;
import com.Product.caresale.service.CarService;

import com.Product.caresale.model.Car;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class CaresaleApplicationTests {
	@Autowired
	CarService carService;
	@Test
	void contextLoads() {
	}
	@Test
	void shouldSaveCar() {
		Car car = new Car();
		car.setBrand("Toyota");
		car.setModel("Pickup Rarly");
		car.setPrice(50000);
		car.setColor("White");
		car.setYear(2018);

		Car saved = carService.saveCar(car);
		assertNotNull(saved.getId());
		assertEquals("Toyota", saved.getBrand());
	}

}
