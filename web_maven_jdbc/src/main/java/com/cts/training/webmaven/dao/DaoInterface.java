package com.cts.training.webmaven.dao;

import java.util.List;

import com.cts.training.webmaven.entity.Student;

public interface DaoInterface {
	
	List<Student> findAll();
	Student findBy(Integer id);
	boolean add(Student student);
	boolean delete(Integer id);
	boolean update(Student student);
}
