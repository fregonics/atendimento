create sequence ATENDIMENTO_ID_SEQ;

create table ATENDIMENTO (
    ID bigint not null primary key default nextval('ATENDIMENTO_ID_SEQ'::regclass),
    SUMARIO varchar(512) not null,
    CRIACAO timestamp not null,
    DESCRICAO text not null,
    TIPO varchar(10) not null,
    CLIENTE_ID bigint not null,
    RESPONSAVEL_ID bigint not null,

    constraint ATENDIMENTO_CLIENTE_ID foreign key (CLIENTE_ID) references CLIENTE(ID),
    constraint ATENDIMENTO_RESPONSAVEL_ID foreign key (RESPONSAVEL_ID) references OPERADOR(ID)
);