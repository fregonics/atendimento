package com.example.atendimento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Cliente a ser atendido
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cliente {

    /**
     * Identificador do objeto
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nome do cliente
     */
    private String nome;
    
    /**
     * Email de contato
     */
    private String email;
}