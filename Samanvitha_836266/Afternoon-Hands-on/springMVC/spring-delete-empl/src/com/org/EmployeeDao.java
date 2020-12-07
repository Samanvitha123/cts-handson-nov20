package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void store(Employee emp)
	{
		jdbcTemplate.update("insert into employee values(?,?,?)",new Object[] {emp.getId(),emp.getName(),emp.getSalary()});
	}
	
	public void delete(int id)
	{
		jdbcTemplate.update("delete from employee where id=?",new Object[] {id});
	}

}
