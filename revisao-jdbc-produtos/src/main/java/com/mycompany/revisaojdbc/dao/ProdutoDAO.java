package com.mycompany.revisaojdbc.dao;

import com.mycompany.revisaojdbc.model.Categoria;
import com.mycompany.revisaojdbc.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    public Produto inserir(Produto produto) throws SQLException {
        String sql = "INSERT INTO Produto (nome, quantidade, preco, idCategoria) VALUES (?, ?, ?, ?)";

        try (Connection con = ConnectionFactory.getConnection();
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, produto.getNome());
            ps.setInt(2, produto.getQuantidade());
            ps.setFloat(3, produto.getPreco());
            ps.setInt(4, produto.getCategoria().getIdCategoria());
            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    produto.setIdProduto(rs.getInt(1));
                }
            }
            return produto;
        }
    }

    public Produto pesquisar(int idProduto) throws SQLException {
        String sql = """
                SELECT p.idProduto, p.nome, p.quantidade, p.preco,
                       c.idCategoria, c.descricao
                  FROM Produto p
                  JOIN Categoria c ON c.idCategoria = p.idCategoria
                 WHERE p.idProduto = ?
                """;

        try (Connection con = ConnectionFactory.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idProduto);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapProduto(rs);
                }
            }
        }
        return null;
    }

    public boolean alterar(Produto produto) throws SQLException {
        String sql = "UPDATE Produto SET nome = ?, quantidade = ?, preco = ?, idCategoria = ? WHERE idProduto = ?";

        try (Connection con = ConnectionFactory.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, produto.getNome());
            ps.setInt(2, produto.getQuantidade());
            ps.setFloat(3, produto.getPreco());
            ps.setInt(4, produto.getCategoria().getIdCategoria());
            ps.setInt(5, produto.getIdProduto());
            return ps.executeUpdate() > 0;
        }
    }

    public List<Produto> listarEstoque(int limite) throws SQLException {
        String sql = """
                SELECT p.idProduto, p.nome, p.quantidade, p.preco,
                       c.idCategoria, c.descricao
                  FROM Produto p
                  JOIN Categoria c ON c.idCategoria = p.idCategoria
                 WHERE p.quantidade < ?
                 ORDER BY p.quantidade, p.nome
                """;

        List<Produto> produtos = new ArrayList<>();

        try (Connection con = ConnectionFactory.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, limite);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    produtos.add(mapProduto(rs));
                }
            }
        }
        return produtos;
    }

    public List<Produto> listarTodos() throws SQLException {
        String sql = """
                SELECT p.idProduto, p.nome, p.quantidade, p.preco,
                       c.idCategoria, c.descricao
                  FROM Produto p
                  JOIN Categoria c ON c.idCategoria = p.idCategoria
                 ORDER BY p.idProduto
                """;

        List<Produto> produtos = new ArrayList<>();

        try (Connection con = ConnectionFactory.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                produtos.add(mapProduto(rs));
            }
        }
        return produtos;
    }

    public List<Produto> listarPorCategoria(int idCategoria) throws SQLException {
        String sql = """
                SELECT p.idProduto, p.nome, p.quantidade, p.preco,
                       c.idCategoria, c.descricao
                  FROM Produto p
                  JOIN Categoria c ON c.idCategoria = p.idCategoria
                 WHERE c.idCategoria = ?
                 ORDER BY p.nome
                """;

        List<Produto> produtos = new ArrayList<>();

        try (Connection con = ConnectionFactory.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idCategoria);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    produtos.add(mapProduto(rs));
                }
            }
        }
        return produtos;
    }

    private Produto mapProduto(ResultSet rs) throws SQLException {
        Categoria categoria = new Categoria();
        categoria.setIdCategoria(rs.getInt("idCategoria"));
        categoria.setDescricao(rs.getString("descricao"));

        Produto produto = new Produto();
        produto.setIdProduto(rs.getInt("idProduto"));
        produto.setNome(rs.getString("nome"));
        produto.setQuantidade(rs.getInt("quantidade"));
        produto.setPreco(rs.getFloat("preco"));
        produto.setCategoria(categoria);
        return produto;
    }
}
