package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
public class TestData implements CommandLineRunner {
	@Autowired
	private DataSource ds;
	@Autowired
	private  JdbcTemplate jt;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hi");
		System.out.println(ds.getClass().getName());
		System.out.println(jt.getClass().getName());

	}
}

