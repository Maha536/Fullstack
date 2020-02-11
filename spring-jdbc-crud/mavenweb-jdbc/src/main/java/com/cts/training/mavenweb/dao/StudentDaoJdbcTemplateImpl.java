package com.cts.training.mavenweb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.cts.training.mavenweb.entity.Student;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



@Repository
public class StudentDaoJdbcTemplateImpl implements IStudentDao {

	// has the dependency on DataSource
	// works on raw sql queries (templated)
	private JdbcTemplate jdbcTemplate;
	
	// SQL templates
	private final String SQL_FETCH_ALL = "select * from student";
	private final String SQL_FETCH_BY_ID = "select * from student where id=?";
	private final String SQL_INSERT = "insert into student(name,email) values(?, ?)";
	private final String SQL_UPDATE = "update student set name=?, email=? where id=?";
	private final String SQL_DELETE = "delete from student where id=?";
	
	
	/*class CustomRowMapper implements RowMapper<Student>{

		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
		
	}*/
	
	@Autowired
	public StudentDaoJdbcTemplateImpl(DataSource dataSource) {
		// TODO Auto-generated constructor stub
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		// this.jdbcTemplate.query(<raw query>, <mapper>);
		// raw query : will be used to retrieve ReusltSet
		// mapper  : will be used to map it into List<Student>
		// BeanPropertyRowMapper : converts each record from ResultSet into Student object
		// and assembles them as a collection
		// this.jdbcTemplate.query(SQL_FETCH_ALL, new CustomRowMapper());
		
		List<Student> students = this.jdbcTemplate.query(this.SQL_FETCH_ALL,new BeanPropertyRowMapper<Student>(Student.class));
	
		return students;

	}

	@Override
	public Student findById(Integer id) {
		// TODO Auto-generated method stub
		Student student =  this.jdbcTemplate.queryForObject(this.SQL_FETCH_BY_ID,
				 new Object[] {id}, // place holder values
				 new BeanPropertyRowMapper<Student>(Student.class));
		return student;
	}

	@Override
	public boolean add(Student student) {
		// TODO Auto-generated method stub
		int n = this.jdbcTemplate.update(this.SQL_INSERT, new Object[] {student.getName(), student.getEmail()});
		// n : number of rows affected
		if(n>0)
			return true;
		return false;
	}

	@Override
	public boolean update(Student student) {
		// TODO Auto-generated method stub
		int n = this.jdbcTemplate.update(this.SQL_UPDATE, new Object[] {student.getName(), student.getEmail(), student.getId()});
		// n : number of rows affected
		if(n>0)
			return true;
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		int n = this.jdbcTemplate.update(this.SQL_DELETE, new Object[] {id});
		// n : number of rows affected
		if(n>0)
			return true;
		return false;
	}

}































