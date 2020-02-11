package com.cts.training.webmaven.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cts.training.webmaven.entity.Student;

@Component
public class StudentDaoImplementation implements DaoInterface {
	
	private  JdbcTemplate jdbcTemplate;
	
	//sql templates
	private final String SQL_FETCH_ALL="select * from student";
	private final String SQL_FETCH_BY_ID="select * from student where id=?";
	private final String SQL_INSERT="insert into student(id,name,email,department) values ?";
	private final String SQL_UPDATE="update student where id=?";
	private final String SQL_DELETE="delete from student where id=?";
	
	@Autowired
	public StudentDaoImplementation(DataSource dataSource){
		this.jdbcTemplate = new  JdbcTemplate(dataSource);
		
	}
	
	
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		//this.jdbcTemplate.query(<raw query>,<mapper>);
		List<Student> students = this.jdbcTemplate.query(this.SQL_FETCH_ALL,new BeanPropertyRowMapper<Student>(Student.class));
		return students;
	}

	@Override
	public Student findBy(Integer id) {
		// TODO Auto-generated method stub
		Student student = this.jdbcTemplate.query(this.SQL_FETCH_BY_ID,new Object[]{id},new BeanPropertyRowMapper<Student>(Student.class));
		return student;
	}

	@Override
	public boolean add(Student student) {
		// TODO Auto-generated method stub
		int n=this.jdbcTemplate.update(this.SQL_INSERT,
				new Object[] {student.getId(),student.getName(),student.getEmail(),student.getDept()},
				new BeanPropertyRowMapper<Student>(Student.class));
		if(n>0)
			return true;
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		int n=this.jdbcTemplate.delete(this.SQL_FETCH_Y_ID,
				new Object[]{id},
				new BeanPropertyRowMapper<Student>(Student.class));
		if(n>0)
			return true;
		return false;
	}

	@Override
	public boolean update(Student student) {
		// TODO Auto-generated method stub
		int n =this.jdbcTemplate.update(this.SQL_UPDATE,
				new Object[] {student.getId(),student.getName(),student.getEmail(),student.getDept()},
				new BeanPropertyRowMapper<Student>(Student.class));
		if(n>0)
			return true;
		return false;
	}

}
