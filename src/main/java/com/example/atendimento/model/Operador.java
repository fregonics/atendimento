package com.example.atendimento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Funcionário que resolve o {@link com.example.atendimento.model.Atendimento}
 */
@Data
@NoArgsConstructor
@Entity
public class Operador {

    /**
     * Identificador do objeto
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nome do operador
     */
    private String nome;
    
    /**
     * Email de contato do operador
     */
    private String email;
}