package com.example.carController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Car.model.Car;
import com.example.CarRepository.CardetailsRepository;
import com.example.CarService.CardetailsService;

@RestController
public class CardetailsController {
	@Autowired
	CardetailsService cn;
	@Autowired
	CardetailsRepository cr;

@GetMapping(value="/id")
public List<Car>all()
{
	return cr.findAll();
}
@PostMapping("/id1")
public String fun(@RequestBody Car id) {
	cn.saveDetails(id);
	return "updated";
}
}
