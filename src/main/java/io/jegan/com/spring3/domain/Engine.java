package io.jegan.com.spring3.domain;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Data
@Component
public class Engine {

    @Value("${engine.Type}")
    private String engineType;
}

