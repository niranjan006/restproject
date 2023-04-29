package com.example.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.College;
import com.example.crud.service.CollegeService;

@RestController
public class CollegeController {
	@Autowired
	CollegeService cs;
	@GetMapping("/id")
	public List<College> details(){
		return cs.getDetails();
	}
	@PostMapping("/save")
	public String all(@RequestBody College id) {
		cs.save(id);
		return "saved";
	}
	@PutMapping("/update")
	public String fun(@RequestBody College id) {
		cs.update(id);
		return "updated";
	}
	@DeleteMapping("/delete{id}")
	public String mall(@PathVariable int id) {
		cs.delete(id);
		return "Deleted";
	}
	@GetMapping("/sort/{field}")
	public List<College>sortCollege(@PathVariable String field){
		return cs.sortCollege(field);
	}
	@GetMapping("/page/{pnum}/{psize}")
	public List<College> page(@PathVariable("pnum")int num,@PathVariable("psize")int size)
	{
		return cs.page(num,size);
	}
	
	//pagination sorting
	@GetMapping("/paginationsort/{pnum}/{psize}/{name}")
	public List<College> paginationsorting(@PathVariable("pnum")int pnum,@PathVariable("psize")int psize,@PathVariable("name")String name)
	{
		return cs.paginationsorting(pnum,psize,name);
	}
}
