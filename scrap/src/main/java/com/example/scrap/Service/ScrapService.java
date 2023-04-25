package com.example.scrap.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.scrap.Repository.ScraprepClass;
import com.example.scrap.model.ScrapClass;

@Service
public class ScrapService {
	@Autowired
	ScraprepClass sr;
	@GetMapping(value="/id")
	public List <ScrapClass> all(){
		List<ScrapClass> std=sr.findAll();
		return std;
	}
}
