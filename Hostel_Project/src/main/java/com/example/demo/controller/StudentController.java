package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	
	@PostMapping("student/{bedId}")
	public ResponseEntity addStudent(@PathVariable int bedId,@RequestBody StudentDTO studentDTO) {
		studentService.addStudent(bedId,studentDTO);
		return new ResponseEntity("Student Added", HttpStatus.CREATED);
	}
}
