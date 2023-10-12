package com.alliance.springbootprofiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class myConfig {

  @Bean
  public DataSource dataSource(@Value("${dataSource.userName}") String userName,@Value("${dataSource.password}") String password) {

    DataSource dataSource = new DataSource();
    dataSource.setUserName(userName);
    dataSource.setPassword(password);

    System.out.println("This is my datasource"+dataSource.getUserName());
    return dataSource;


  }
}
