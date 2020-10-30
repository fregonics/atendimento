package com.example.atendimento.atendimento;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    Class1 c1;
    ClasseInjetavel ci;

    public Controller(ClasseInjetavel ci, Class1 c1) {
        this.c1 = c1;
        this.ci = ci;
    }

    @GetMapping
    public String test() {
        return c1.process() + "\n" + ci.process();
    }
}
