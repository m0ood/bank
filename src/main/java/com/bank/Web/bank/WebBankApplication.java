package com.bank.Web.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebBankApplication {
	public static Long id;
	public static String name;
	public static Integer money;
	public static void main(String[] args) {
		SpringApplication.run(WebBankApplication.class, args);
	}

}
