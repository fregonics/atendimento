package com.example.atendimento.atendimento;

public class Class1 {
    
    Class2 c2;

    public Class1(Class2 c2) {
        this.c2 = c2;
    }

    public String process() {
        return "c1 - " + c2.process();
    }

}
