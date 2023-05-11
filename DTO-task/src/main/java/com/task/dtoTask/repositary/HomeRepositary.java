package com.task.dtoTask.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.dtoTask.model.Student;

@Repository
public interface HomeRepositary extends JpaRepository<Student, Integer> {

}
