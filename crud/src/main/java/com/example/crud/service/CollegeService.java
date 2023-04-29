package com.example.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.crud.model.College;
import com.example.crud.repository.CollegeRepository;

@Service
public class CollegeService {
	@Autowired
	CollegeRepository cr;

	public List<College>getDetails()
	{
		return cr.findAll();
	}
	public College save (College id)
	{
		return cr.save(id);
	}
	
	public College update(College id)
	{
		return cr.save(id);
	}
	public void delete(int id)
	{
	     cr.deleteById(id);
	}
	public List<College>sortCollege(String field)
	{
		return cr.findAll(Sort.by(Direction.DESC,field));
	}
	public List<College> sort(String field)
	{
		return cr.findAll(Sort.by(field));
	}
	public List<College> page(int num, int size) {
		Page<College> p=cr.findAll(PageRequest.of(num, size));
		return p.getContent();
	}

	public List<College> paginationsorting(int pnum, int psize, String name) {
		// TODO Auto-generated method stub
		Page<College> p=cr.findAll(PageRequest.of(pnum, psize, Sort.by(name).descending()));
		return p.getContent();
	}
}
