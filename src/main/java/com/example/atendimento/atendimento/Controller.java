package com.example.atendimento.atendimento;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    Class1 c1;

    public Controller() {
        this.c1 = new Class1(new Class2(new Class3()));

    }

    @GetMapping
    public String test() {
        return c1.process() + "\n";
    }
}
