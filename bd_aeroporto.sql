CREATE TABLE passageiro(
	id 					SERIAL PRIMARY KEY,
	nome 				VARCHAR(100) NOT NULL,
	cpf 				VARCHAR(14) NOT NULL,
	data_nascimento 	DATE NOT NULL,
	email 				VARCHAR(100) NOT NULL,
	telefone 			VARCHAR(100) NOT NULL
);

CREATE TABLE voo(
	id 					SERIAL PRIMARY KEY,
	origem 				VARCHAR(100) NOT NULL,
	destino 			VARCHAR(100) NOT NULL,
	data_partida 		DATE NOT NULL,
	hora_partida 		TIME NOT NULL,
	classe 				VARCHAR(100) NOT NULL,
	preco 				NUMERIC(6,2) NOT NULL
);

CREATE TABLE reserva(
	id 					SERIAL PRIMARY KEY NOT NULL,
	id_passageiro 		INT REFERENCES passageiro(id) NOT NULL,
	id_voo 				INT REFERENCES voo(id) NOT NULL,
	assento 			VARCHAR(5) NOT NULL
);

INSERT INTO passageiro(nome, cpf, data_nascimento, email, telefone)
VALUES ('Kaylane', '123.456.789-10', '30/09/2003', 'kaylane@ufu.br', '(34) 94002-8922');

