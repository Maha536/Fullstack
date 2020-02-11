package com.cts.trating.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cts.training.mavenweb.dao.IStudentDao;
import com.cts.training.mavenweb.entity.Student;

@Component
public class IStudentSerImplementation implements IStudentSer {
	
	@Autowired
	private IStudentDao serv;
	
	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return this.serv.findAll();
	}

	@Override
	public Student findStudentById(Integer id) {
		// TODO Auto-generated method stub
		return this.serv.findById(id);
	}

	@Override
	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		return this.serv.add(student);
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		return this.serv.update(student);
	}

	@Override
	public boolean deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		return this.serv.delete(id);
	}

}
