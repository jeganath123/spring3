package io.jegan.com.spring3;

import io.jegan.com.spring3.domain.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring3Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Spring3Application.class, args);
        Car car=context.getBean("car", Car.class);
        System.out.println(car);
    }

}
