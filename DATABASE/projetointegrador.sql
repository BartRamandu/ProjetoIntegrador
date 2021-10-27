CREATE DATABASE db_cultivar;
USE db_cultivar;

CREATE TABLE tb_categoria (
	id INT NOT NULL AUTO_INCREMENT,
	categoria varchar(255) NOT NULL,
	nome_vendedor varchar(255) NOT NULL,
	forma_pagamento varchar(255) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE tb_usuario (
	id INT NOT NULL AUTO_INCREMENT,
	nome varchar(255) NOT NULL,
	email varchar(255) NOT NULL,
	senha varchar(255) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE tb_produto (
	id INT NOT NULL AUTO_INCREMENT,
	produto varchar(255) NOT NULL,
	valor DECIMAL(10,2) NOT NULL,
	estoque INT NOT NULL,
	peso_unitario DECIMAL(10,3) NOT NULL,
	id_categoria INT NOT NULL,
	id_usuario INT NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (id_categoria) REFERENCES tb_categoria(id),
	FOREIGN KEY (id_usuario) REFERENCES tb_usuario(id)	
);

