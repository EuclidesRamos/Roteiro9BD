CREATE TABLE LABORATORIO (
    id serial PRIMARY KEY,
    nome varchar(50) NOT NULL,
    descricao varchar(100)
);

CREATE TABLE PROJETO (
    id serial PRIMARY KEY,
    titulo varchar(100) NOT NULL,
    descricao varchar(100),
    data_inicio date NOT NULL,
    data_fim date,
    id_laboratorio integer REFERENCES LABORATORIO (id) NOT NULL
);

CREATE TABLE ALUNO (
    matricula char(9) PRIMARY KEY,
    nome varchar(100) NOT NULL,
    cra double precision NOT NULL,
    dt_nasc date NOT NULL,
    id_projeto integer REFERENCES PROJETO (id) NOT NULL
);