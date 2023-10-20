package com.alliance.springbootprofiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.w3c.dom.ls.LSOutput;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

  @Autowired
  public Animal animal;


  @Value("${animal.name}")
  private String name;

  @Override
  public void run(String... args) throws Exception {
    animal.makeSound();
    System.out.println(name);
  }



}

