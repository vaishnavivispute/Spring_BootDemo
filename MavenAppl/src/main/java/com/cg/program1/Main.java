package com.cg.program1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
	public static void main(String args[])
	{
		ApplicationContext con = SpringApplication.run(Main.class, args);
	}

}