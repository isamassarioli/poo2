
CREATE TABLE TipoVacina (
  idTipoVacina SERIAL,
  descricao VARCHAR(45) NULL,
  PRIMARY KEY (idTipoVacina)
);


CREATE TABLE Vacina (
  idVacina SERIAL,
  nomeVacina VARCHAR(255) NULL,
  qtdeDoses INT NULL,
  idTipoVacina INT NOT NULL,
  PRIMARY KEY (idVacina),
  FOREIGN KEY (idTipoVacina)
    REFERENCES TipoVacina (idTipoVacina)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);


CREATE TABLE Paciente (
  idPaciente SERIAL,
  nomePaciente VARCHAR(255) NULL,
  cpf VARCHAR(14) NULL,
  dtDose1 DATE NULL,
  dtDose2 DATE NULL,
  precisaDose2 INT NULL,
  idVacina INT NOT NULL,
  PRIMARY KEY (idPaciente),
  FOREIGN KEY (idVacina)
    REFERENCES Vacina (idVacina)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);


INSERT INTO TipoVacina (idTipoVacina, descricao) VALUES (1, 'COVID');
INSERT INTO TipoVacina (idTipoVacina, descricao) VALUES (2, 'Outras');

INSERT INTO Vacina (idVacina, nomeVacina, qtdeDoses, idTipoVacina) VALUES (1, 'CoronaVac', 2, 1);
INSERT INTO Vacina (idVacina, nomeVacina, qtdeDoses, idTipoVacina) VALUES (2, 'AstraZeneca', 2, 1);
INSERT INTO Vacina (idVacina, nomeVacina, qtdeDoses, idTipoVacina) VALUES (3, 'Pfizer', 2, 1);
INSERT INTO Vacina (idVacina, nomeVacina, qtdeDoses, idTipoVacina) VALUES (4, 'BCG', 1, 2);
INSERT INTO Vacina (idVacina, nomeVacina, qtdeDoses, idTipoVacina) VALUES (5, 'Gripe', 1, 2);
INSERT INTO Vacina (idVacina, nomeVacina, qtdeDoses, idTipoVacina) VALUES (6, 'Polio', 1, 2);
INSERT INTO Vacina (idVacina, nomeVacina, qtdeDoses, idTipoVacina) VALUES (7, 'Sarampo', 1, 2);
