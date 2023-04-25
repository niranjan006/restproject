package com.example.scrap.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.scrap.Repository.ScraprepClass;
import com.example.scrap.model.ScrapClass;

@RestController
public class ScrapClassController {
	     @Autowired
	     ScraprepClass sr;
	     @GetMapping(value="/id")
	     public List<ScrapClass> all(){
	    	 return sr.findAll();
	     }
	     
	     @GetMapping("/id/{id}")
	     public ScrapClass getDetailsById(@PathVariable int id)
	     {
	    	 return sr.findById(id).orElse(null);
	     }
	     @DeleteMapping("/id/{id}")
	     public String deleteDetailsById(@PathVariable int id)
	     {
	    	 sr.deleteById(id);
	    	 return "ID Details Deleted";
	     }
	     @PostMapping("/save")
	     public String deleteDetailsById(@RequestBody ScrapClass id)
	     {
	    	 sr.save(id);
	    	 return "ID DETAILS SAVED";
	     }
	     @PutMapping("/update")
	     public ScrapClass getdetailsById(@RequestBody ScrapClass s)
	     {
	    	 return sr.save(s);
	    	 
	     }
}
