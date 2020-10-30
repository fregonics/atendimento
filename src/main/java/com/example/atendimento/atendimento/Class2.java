package com.example.atendimento.atendimento;

import org.springframework.stereotype.Component;

@Component
public class Class2 {
    
    Class3 c3;

    public Class2(Class3 c3) {
        this.c3 = c3;
    }

    public String process() {
        return "c2 - " + c3.process();
    }

}
