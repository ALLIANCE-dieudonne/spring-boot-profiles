package com.alliance.springbootprofiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dog")
public class Dog implements Animal{
        @Override
        public void makeSound() {
                System.out.println("baa...");
        }
}
