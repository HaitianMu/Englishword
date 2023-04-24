package com.example.sql2;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.sql2.mapper")
public class Sql2Application {

	public static void main(String[] args) {
		SpringApplication.run(Sql2Application.class, args);
	}

}
