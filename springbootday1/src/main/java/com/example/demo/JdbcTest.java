package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class JdbcTest implements CommandLineRunner{
	@Autowired
	private  JdbcTemplate jt;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO Student VALUES (?,?,?,?)";
		Object[] objects = {525,"geethu",6,89};
		int rows_inserted = jt.update(sql,objects);
		System.out.println("rows_inserted"+rows_inserted);
		
		String sqlall = "DELETE FROM Student WHERE name =? AND id=?";
		Object[] objects1 = {"himani",1};
		
	    int rows_deleted =jt.update(sqlall,objects1);
	    System.out.println("deleted rows"+rows_deleted);
	    
	    String sqlbysem = "DELETE FROM Student WHERE sem=?";
	   
	    System.out.println("deleted row by sem"+jt.update(sqlbysem,8));
		
		}
	}


