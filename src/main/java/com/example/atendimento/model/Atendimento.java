package com.example.atendimento.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Um atendimento é uma interação iniciada por um cliente
 * e atendida por um operador
 */

@Data
@NoArgsConstructor
@Entity
public class Atendimento {

    /**
     * Identificador do objeto
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Breve descrição para que o operador possa iniciar o atendimento
     */
    private String sumario;

    /**
     * Data e hora da criação do atendimento
     */
    private LocalDateTime criacao;

    /**
     * Descrição detalhada sobre a requisição
     * @see #sumario
     */
    private String descricao;
    
    /**
     * Tipo de atendimento de acordo com o definido em
     * {@link com.example.atendimento.model.TipoAtendimento Tipo de atendimento}
     */
    @Enumerated(EnumType.STRING)
    private TipoAtendimento tipo;
    
    /**
     * {@link com.example.atendimento.model.Cliente Cliente}
     * que requisitou o atendimento
     */
    @ManyToOne
    private Cliente cliente;
    
    /**
     * {@Link com.example.atendimento.model.Operador Operador}
     * que será responsável pelo prosseguimento do atendimento
     */
    @ManyToOne
    private Operador responsavel;
}