package com.springdbmysql.springmysqldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//@EnableJpaRepositories(basePackages = {"com.springdbmysql.mysqldemo.dao"})
//This @EnableJpaRepositories annotation is must when the dao/repository is not under the root class,
//with @SpringBootApplication which enables auto configuration
@SpringBootApplication
public class SpingMysqlDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingMysqlDemoApplication.class, args);
	}

}

