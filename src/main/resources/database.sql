create database clinica_medica;

show databases;

use clinica_medica;

create table especialidade (
id int primary key auto_increment,
nome varchar(100) not null,
descricao varchar(1000)
);

create table convenio (
id int primary key auto_increment,
nome varchar(100) not null,
descricao varchar(1000)
);

create table funcionario (
id int primary key auto_increment,
usuario varchar(100),
senha varchar(50),
crm varchar(20) unique,
nome varchar(100) not null,
especialidade_id int,
idade int,
sexo char,
cpf varchar(11) unique,
rua varchar(100),
numero varchar(10),
complemento varchar(20),
bairro varchar(50),
cidade varchar(50),
estado varchar(50),
contato varchar(30),
email varchar(100),
data_nascimento date
foreign key (especialidade_id) references especialidade(id)
);

create table paciente (
id int primary key auto_increment,
nome varchar(100) not null,
idade int,
sexo char,
cpf varchar(11) unique,
convenio_id int,
rua varchar(100),
numero varchar(10),
complemento varchar(20),
bairro varchar(50),
cidade varchar(50),
estado varchar(50),
contato varchar(30),
email varchar(100),
data_nascimento date,
foreign key (convenio_id) references convenio(id)
);

create table prontuario (
id int primary key auto_increment,
paciente_id int,
data_consulta date,
receituario varchar(1000),
exames varchar(1000),
observacoes varchar(1000),
foreign key (paciente_id) references paciente(id)
);

create table consulta (
id int primary key auto_increment,
data_consulta datetime,
horario time,
funcionario_id int,
paciente_id int,
prontuario_id int,
sintomas varchar(500),
eRetorno boolean,
estaAtiva boolean,
foreign key (funcionario_id) references funcionario(id),
foreign key (paciente_id) references paciente(id),
foreign key (prontuario_id) references prontuario(id)
);

show tables;

select * from clinica_medica;

