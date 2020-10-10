package com.example.atendimento.atendimento;

import java.util.List;

import com.example.atendimento.model.Cliente;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    
    @GetMapping(value = "clientes")
    public List<Cliente> consultarCliente(@RequestParam String sort) {
        return List.of(
            new Cliente(1L, "Luiz", "luizgustavofcsg@hotmail.com"), 
            new Cliente(2L, sort, "luizgustavofcsg@gmail.com")
        );
    }

    @GetMapping("clientes/{id}")
    public Cliente clienteByID(@PathVariable long id) {
        return new Cliente(id, "luiz", "luis@asdfasd.com");
    }

    @PostMapping(value = "clientes")
    public Cliente incluirCliente(@RequestBody Cliente body) {
        body.setId(1L);
        return body;
    }

    @PutMapping("clientes/{id}")
    public Cliente atualizarCliente(@RequestBody Cliente body, @PathVariable long id) {
        body.setId(id);
        return body;
    }

    @DeleteMapping("clientes/{id}")
    public String removerCliente(@PathVariable long id) {
        return "registro " + id + " apagado";
    }
}