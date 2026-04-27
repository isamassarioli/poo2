CREATE DATABASE revisao_jdbc;

-- Conecte no banco revisao_jdbc e execute o restante do script.

CREATE TABLE IF NOT EXISTS Categoria (
    idCategoria SERIAL PRIMARY KEY,
    descricao VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS Produto (
    idProduto SERIAL PRIMARY KEY,
    nome VARCHAR(120) NOT NULL,
    quantidade INT NOT NULL,
    preco REAL NOT NULL,
    idCategoria INT NOT NULL,
    CONSTRAINT fk_produto_categoria
        FOREIGN KEY (idCategoria)
        REFERENCES Categoria (idCategoria)
);
