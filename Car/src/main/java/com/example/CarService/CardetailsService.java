package com.example.CarService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Car.model.Car;
import com.example.CarRepository.CardetailsRepository;

@Service
public class CardetailsService {
	@Autowired
	CardetailsRepository cr;
	
	public List <Car> all()
	{
		return cr.findAll();
	}
	public Car saveDetails(Car id) {
		return cr.save(id);
	}
}
