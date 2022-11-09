package com.patterns.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

@SpringBootApplication
//public class CollectionApplication implements CommandLineRunner {
public class CollectionApplication {

//	@Autowired
//	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(CollectionApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		String sql = "insert into books (name, price, features) values ('In Search of Lost Time', 500, '{\"Limited Collection\"}'";
//
//		int rows = jdbcTemplate.update(sql);
//		if (rows > 0) {
//			System.out.println("A new row has been inserted");
//		}
//	}
}
