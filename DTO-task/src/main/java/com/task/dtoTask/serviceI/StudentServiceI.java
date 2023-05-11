package com.task.dtoTask.serviceI;

import com.task.dtoTask.dto.StudentDto;
import com.task.dtoTask.model.Student;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentServiceI {



		
		public Student toEntity(StudentDto dto);
		
		public StudentDto todto(Student s);
		

}
