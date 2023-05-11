package com.task.dtoTask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.dtoTask.dto.StudentDto;
import com.task.dtoTask.model.Student;
import com.task.dtoTask.serviceI.HomeServiceI;
import com.task.dtoTask.serviceI.StudentServiceI;

@RestController
public class Homecontroller {
	
	@Autowired
	HomeServiceI hs;
	
	@Autowired
	StudentServiceI ss;
	
	@PostMapping(value="/save")
	public ResponseEntity<StudentDto> savestudent(@RequestBody StudentDto sdto)
	{
		Student st=ss.toEntity(sdto);
		
		Student st1=hs.savestudents(st);
		
		ss.todto(st1);
		
		return new ResponseEntity<StudentDto>(ss.todto(st1), HttpStatus.CREATED);
	}

}
