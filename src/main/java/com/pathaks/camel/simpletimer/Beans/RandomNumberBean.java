package com.pathaks.camel.simpletimer.Beans;

import org.springframework.stereotype.Component;
import java.util.Random; 

@Component
public class RandomNumberBean {

    private static Random random = new Random();

    public String randomNumberBean(){

        int randomNumber = random.nextInt();
        return String.valueOf(randomNumber) + "\n";
    }   
}