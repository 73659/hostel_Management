package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Bed;
import com.example.demo.entity.Student;
import com.example.demo.exception.InvalidDataException;
import com.example.demo.repository.BedRepo;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;

	@Autowired
	BedRepo bedRepo;

	@Override
	public void addStudent(int bedId, StudentDTO studentDTO) {

		Bed bed = bedRepo.findById(bedId).get();
		if (bed.getStatus().equals("Available")) {

			Student student = new Student();
			student.setName(studentDTO.getName());
			student.setEmail(studentDTO.getEmail());
			student.setCourse(studentDTO.getCourse());
			student.setAge(studentDTO.getAge());

			student.setBed(bed);

			studentRepo.save(student);
			bed.setStatus("Occupied");

			bedRepo.save(bed);
		} else {
			throw new InvalidDataException("Bed is already occupied");
		}

	}

}
