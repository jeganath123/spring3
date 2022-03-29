package io.jegan.com.spring3.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Car {

    private Engine engine;
    @Value("${model}")
    private String model;
    private Test test;

    public Car(Engine engine, Test test) {
        this.engine = engine;
        this.test = test;
    }
}
