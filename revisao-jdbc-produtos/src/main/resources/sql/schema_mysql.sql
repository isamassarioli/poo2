CREATE DATABASE IF NOT EXISTS revisao_jdbc;
USE revisao_jdbc;

CREATE TABLE IF NOT EXISTS Categoria (
    idCategoria INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS Produto (
    idProduto INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(120) NOT NULL,
    quantidade INT NOT NULL,
    preco FLOAT NOT NULL,
    idCategoria INT NOT NULL,
    CONSTRAINT fk_produto_categoria
        FOREIGN KEY (idCategoria)
        REFERENCES Categoria (idCategoria)
);
