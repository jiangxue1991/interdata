package com.zym.wx.interdata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.xml.ws.soap.MTOM;


@EnableWebMvc
@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.zym.wx.interdata")
public class InterdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterdataApplication.class, args);
	}
}
