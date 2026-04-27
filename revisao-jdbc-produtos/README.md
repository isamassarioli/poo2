# revisao-jdbc-produtos

Projeto Java Swing + JDBC para a atividade de revisao de Banco de Dados (POO II).

## O que foi implementado

- Modelos de dominio: `Categoria` e `Produto`.
- Conexao JDBC por arquivo de configuracao (`db.properties`).
- DAO com os metodos pedidos no enunciado:
  - `CategoriaDAO`: inserir, listar.
  - `ProdutoDAO`: inserir, pesquisar, alterar, listarEstoque, listarTodos, listarPorCategoria.
- `GerenciadorDominio` para mediar UI e DAOs.
- Tela Swing com os botoes:
  - Inserir Categoria
  - Inserir Produto
  - Pesquisar
  - Alterar
  - Listar Estoque
  - Listar Todos
  - Listar por Categoria
- Tabela de produtos via `AbstractTableModel` (`ProdutoTableModel`).

## Configuracao do banco

1. Execute um dos scripts:
   - MySQL: `src/main/resources/sql/schema_mysql.sql`
   - PostgreSQL: `src/main/resources/sql/schema_postgres.sql`
2. Edite `src/main/resources/db.properties` com URL, usuario e senha.

## Executar

```bash
mvn clean compile
mvn exec:java
```

Classe principal: `com.mycompany.revisaojdbc.Main`
