create sequence OPERADOR_ID_SEQ;

create table OPERADOR (
    ID bigint not null primary key default nextval('OPERADOR_ID_SEQ'::regclass),
    NOME varchar(255) not null,
    EMAIL varchar(255) not null
);