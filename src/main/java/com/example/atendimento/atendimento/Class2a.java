package com.example.atendimento.atendimento;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Class2a implements Interface2{
    
    public String process() {
        return "c2a";
    }

}
