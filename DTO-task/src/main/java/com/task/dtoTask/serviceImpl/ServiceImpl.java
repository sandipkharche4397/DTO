package com.task.dtoTask.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.dtoTask.model.Student;
import com.task.dtoTask.repositary.HomeRepositary;
import com.task.dtoTask.serviceI.HomeServiceI;
@Service
public class ServiceImpl implements HomeServiceI{

	@Autowired
	HomeRepositary hr;
	@Override
	public Student savestudents(Student s) {
		
		return hr.save(s);
	}

}
