create sequence CLIENTE_ID_SEQ;

create table CLIENTE (
    ID bigint not null primary key default nextval('CLIENTE_ID_SEQ'::regclass),
    NOME varchar(255) not null,
    EMAIL varchar(255) not null
);