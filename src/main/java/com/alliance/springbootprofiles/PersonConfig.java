package com.alliance.springbootprofiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:person.properties")
public class PersonConfig {

  @Bean
  public Person getPersonInfo(@Value("${person.name}") String name,@Value("${person.age}") int age){

    Person person = new Person();
    person.setAge(age);
    person.setName(name);

    System.out.println(person.getAge() +":" + person.getName());

    return person;
  }



}
