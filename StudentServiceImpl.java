package com.greatLearning.studentManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatLearning.studentManagement.entity.Student;
import com.greatLearning.studentManagement.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	public StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {

		return studentRepository.findAll();
	}

	@Override
	public Student findById(int theId) {
		return studentRepository.findById(theId).get();
	}

	@Override
	public void save(Student thestudent) {
		studentRepository.save(thestudent);
	}

	@Override
	public void deleteById(int theId) {

		studentRepository.deleteById(theId);

	}

}