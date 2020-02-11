package com.cts.trating.web.services;

import java.util.List;

import com.cts.training.mavenweb.entity.Student;

public interface IStudentSer {
	List<Student> findAllStudent();
	Student findStudentById(Integer id);
	boolean addStudent(Student student);
	boolean updateStudent(Student student);
	boolean deleteStudent(Integer id);
}
