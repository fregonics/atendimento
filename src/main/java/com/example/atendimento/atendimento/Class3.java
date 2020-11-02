package com.example.atendimento.atendimento;

import org.springframework.stereotype.Component;

public class Class3 {
    
    String message;

    public Class3(String message) {
        this.message = message;
    }


    public String process() {
        return this.message;
    }

}
