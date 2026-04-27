package com.mycompany.revisaojdbc.domain;

import com.mycompany.revisaojdbc.dao.CategoriaDAO;
import com.mycompany.revisaojdbc.dao.ProdutoDAO;
import com.mycompany.revisaojdbc.model.Categoria;
import com.mycompany.revisaojdbc.model.Produto;
import java.sql.SQLException;
import java.util.List;

public class GerenciadorDominio {

    private final CategoriaDAO categoriaDAO;
    private final ProdutoDAO produtoDAO;

    public GerenciadorDominio() {
        this.categoriaDAO = new CategoriaDAO();
        this.produtoDAO = new ProdutoDAO();
    }

    public Categoria inserirCategoria(String descricao) throws SQLException {
        Categoria categoria = new Categoria(null, descricao);
        return categoriaDAO.inserir(categoria);
    }

    public List<Categoria> listarCategorias() throws SQLException {
        return categoriaDAO.listar();
    }

    public Produto inserirProduto(Produto produto) throws SQLException {
        return produtoDAO.inserir(produto);
    }

    public Produto pesquisarProduto(int idProduto) throws SQLException {
        return produtoDAO.pesquisar(idProduto);
    }

    public boolean alterarProduto(Produto produto) throws SQLException {
        return produtoDAO.alterar(produto);
    }

    public List<Produto> listarEstoque(int limite) throws SQLException {
        return produtoDAO.listarEstoque(limite);
    }

    public List<Produto> listarTodosProdutos() throws SQLException {
        return produtoDAO.listarTodos();
    }

    public List<Produto> listarProdutosPorCategoria(int idCategoria) throws SQLException {
        return produtoDAO.listarPorCategoria(idCategoria);
    }
}
