create table remedio(
    id bigint not null primary key auto_increment,
    nome varchar(50) not null,
    via varchar(50) not null,
    lote varchar(50) not null,
    quantidade bigint not null,
    validade varchar(100) not null,
    laboratorio varchar(100) not null
);