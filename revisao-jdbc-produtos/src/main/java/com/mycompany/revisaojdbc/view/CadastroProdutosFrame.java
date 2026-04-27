package com.mycompany.revisaojdbc.view;

import com.mycompany.revisaojdbc.domain.GerenciadorDominio;
import com.mycompany.revisaojdbc.model.Categoria;
import com.mycompany.revisaojdbc.model.Produto;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.sql.SQLException;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class CadastroProdutosFrame extends JFrame {

    private final GerenciadorDominio gerenciador;
    private final ProdutoTableModel tableModel;

    private JTextField txtNomeCategoria;
    private JButton btnInserirCategoria;

    private JTextField txtIdProduto;
    private JTextField txtNomeProduto;
    private JTextField txtQuantidade;
    private JTextField txtPreco;
    private JComboBox<Categoria> comboCategoria;

    private JButton btnInserirProduto;
    private JButton btnPesquisar;
    private JButton btnAlterar;
    private JButton btnListarEstoque;
    private JButton btnListarTodos;
    private JButton btnListarPorCategoria;

    private JTable tabelaProdutos;

    public CadastroProdutosFrame() {
        this.gerenciador = new GerenciadorDominio();
        this.tableModel = new ProdutoTableModel();

        initComponents();
        configurarEventos();
        carregarCategorias();
    }

    private void initComponents() {
        setTitle("Cadastro de Produtos - JDBC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(900, 650));
        setLocationRelativeTo(null);

        JPanel painelPrincipal = new JPanel(new BorderLayout(10, 10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel painelFormulario = new JPanel(new GridBagLayout());
        painelFormulario.setBorder(BorderFactory.createTitledBorder("Cadastro de Produtos"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblCategoriaTitulo = new JLabel("Categoria");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        painelFormulario.add(lblCategoriaTitulo, gbc);

        gbc.gridwidth = 1;
        gbc.gridy = 1;
        gbc.gridx = 0;
        painelFormulario.add(new JLabel("Nome Categoria"), gbc);

        txtNomeCategoria = new JTextField(25);
        gbc.gridx = 1;
        painelFormulario.add(txtNomeCategoria, gbc);

        btnInserirCategoria = new JButton("Inserir Categoria");
        gbc.gridx = 2;
        painelFormulario.add(btnInserirCategoria, gbc);

        JLabel lblProdutoTitulo = new JLabel("Produto");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        painelFormulario.add(lblProdutoTitulo, gbc);

        gbc.gridwidth = 1;
        gbc.gridy = 3;
        gbc.gridx = 0;
        painelFormulario.add(new JLabel("ID Produto"), gbc);

        txtIdProduto = new JTextField(20);
        gbc.gridx = 1;
        painelFormulario.add(txtIdProduto, gbc);

        btnInserirProduto = new JButton("Inserir Produto");
        gbc.gridx = 2;
        painelFormulario.add(btnInserirProduto, gbc);

        gbc.gridy = 4;
        gbc.gridx = 0;
        painelFormulario.add(new JLabel("Nome Produto"), gbc);

        txtNomeProduto = new JTextField(20);
        gbc.gridx = 1;
        painelFormulario.add(txtNomeProduto, gbc);

        btnPesquisar = new JButton("Pesquisar");
        gbc.gridx = 2;
        painelFormulario.add(btnPesquisar, gbc);

        gbc.gridy = 5;
        gbc.gridx = 0;
        painelFormulario.add(new JLabel("Qtde"), gbc);

        txtQuantidade = new JTextField(20);
        gbc.gridx = 1;
        painelFormulario.add(txtQuantidade, gbc);

        btnAlterar = new JButton("Alterar");
        gbc.gridx = 2;
        painelFormulario.add(btnAlterar, gbc);

        gbc.gridy = 6;
        gbc.gridx = 0;
        painelFormulario.add(new JLabel("Preco R$"), gbc);

        txtPreco = new JTextField(20);
        gbc.gridx = 1;
        painelFormulario.add(txtPreco, gbc);

        btnListarEstoque = new JButton("Listar Estoque");
        gbc.gridx = 2;
        painelFormulario.add(btnListarEstoque, gbc);

        gbc.gridy = 7;
        gbc.gridx = 0;
        painelFormulario.add(new JLabel("Categoria"), gbc);

        comboCategoria = new JComboBox<>();
        gbc.gridx = 1;
        painelFormulario.add(comboCategoria, gbc);

        btnListarTodos = new JButton("Listar Todos");
        gbc.gridx = 2;
        painelFormulario.add(btnListarTodos, gbc);

        btnListarPorCategoria = new JButton("Listar por Categoria");
        gbc.gridy = 8;
        gbc.gridx = 2;
        painelFormulario.add(btnListarPorCategoria, gbc);

        JPanel painelTabela = new JPanel(new BorderLayout());
        painelTabela.setBorder(BorderFactory.createTitledBorder("Lista de Produtos"));
        tabelaProdutos = new JTable(tableModel);
        painelTabela.add(new JScrollPane(tabelaProdutos), BorderLayout.CENTER);

        painelPrincipal.add(painelFormulario, BorderLayout.NORTH);
        painelPrincipal.add(painelTabela, BorderLayout.CENTER);

        setContentPane(painelPrincipal);
        pack();
    }

    private void configurarEventos() {
        btnInserirCategoria.addActionListener(e -> inserirCategoria());
        btnInserirProduto.addActionListener(e -> inserirProduto());
        btnPesquisar.addActionListener(e -> pesquisarProduto());
        btnAlterar.addActionListener(e -> alterarProduto());
        btnListarEstoque.addActionListener(e -> listarEstoque());
        btnListarTodos.addActionListener(e -> listarTodos());
        btnListarPorCategoria.addActionListener(e -> listarPorCategoria());
    }

    private void carregarCategorias() {
        try {
            List<Categoria> categorias = gerenciador.listarCategorias();
            comboCategoria.removeAllItems();
            for (Categoria categoria : categorias) {
                comboCategoria.addItem(categoria);
            }
        } catch (SQLException ex) {
            mostrarErro("Erro ao listar categorias: " + ex.getMessage());
        }
    }

    private void inserirCategoria() {
        String nomeCategoria = txtNomeCategoria.getText().trim();
        if (nomeCategoria.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o nome da categoria.", "Atencao", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            Categoria categoria = gerenciador.inserirCategoria(nomeCategoria);
            comboCategoria.addItem(categoria);
            comboCategoria.setSelectedItem(categoria);
            txtNomeCategoria.setText("");
            JOptionPane.showMessageDialog(this, "Categoria inserida com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            mostrarErro("Erro ao inserir categoria: " + ex.getMessage());
        }
    }

    private void inserirProduto() {
        try {
            Categoria categoriaSelecionada = (Categoria) comboCategoria.getSelectedItem();
            if (categoriaSelecionada == null) {
                JOptionPane.showMessageDialog(this, "Selecione uma categoria.", "Atencao", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Produto produto = new Produto();
            produto.setNome(txtNomeProduto.getText().trim());
            produto.setQuantidade(Integer.parseInt(txtQuantidade.getText().trim()));
            produto.setPreco(Float.parseFloat(txtPreco.getText().trim().replace(',', '.')));
            produto.setCategoria(categoriaSelecionada);

            produto = gerenciador.inserirProduto(produto);
            txtIdProduto.setText(String.valueOf(produto.getIdProduto()));
            JOptionPane.showMessageDialog(this, "Produto inserido com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Quantidade e preco devem ser numericos.", "Atencao", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException ex) {
            mostrarErro("Erro ao inserir produto: " + ex.getMessage());
        }
    }

    private void pesquisarProduto() {
        try {
            int id = Integer.parseInt(txtIdProduto.getText().trim());

            Produto produto;
            produto = gerenciador.pesquisarProduto(id);

            if (produto == null) {
                JOptionPane.showMessageDialog(this, "Produto nao encontrado.", "Informacao", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            txtNomeProduto.setText(produto.getNome());
            txtQuantidade.setText(String.valueOf(produto.getQuantidade()));
            txtPreco.setText(String.valueOf(produto.getPreco()));
            selecionarCategoriaNoCombo(produto.getCategoria().getIdCategoria());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Informe um ID valido.", "Atencao", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException ex) {
            mostrarErro("Erro ao pesquisar produto: " + ex.getMessage());
        }
    }

    private void alterarProduto() {
        try {
            Categoria categoriaSelecionada = (Categoria) comboCategoria.getSelectedItem();
            if (categoriaSelecionada == null) {
                JOptionPane.showMessageDialog(this, "Selecione uma categoria.", "Atencao", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Produto produto = new Produto();
            produto.setIdProduto(Integer.parseInt(txtIdProduto.getText().trim()));
            produto.setNome(txtNomeProduto.getText().trim());
            produto.setQuantidade(Integer.parseInt(txtQuantidade.getText().trim()));
            produto.setPreco(Float.parseFloat(txtPreco.getText().trim().replace(',', '.')));
            produto.setCategoria(categoriaSelecionada);

            boolean alterado = gerenciador.alterarProduto(produto);
            if (alterado) {
                JOptionPane.showMessageDialog(this, "Produto alterado com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Produto nao encontrado para alteracao.", "Informacao", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Verifique os campos numericos (ID, Qtde e Preco).", "Atencao", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException ex) {
            mostrarErro("Erro ao alterar produto: " + ex.getMessage());
        }
    }

    private void listarEstoque() {
        try {
            int limite = Integer.parseInt(txtQuantidade.getText().trim());
            List<Produto> produtos = gerenciador.listarEstoque(limite);
            tableModel.setProdutos(produtos);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Informe um limite numerico no campo Qtde.", "Atencao", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException ex) {
            mostrarErro("Erro ao listar estoque: " + ex.getMessage());
        }
    }

    private void listarTodos() {
        try {
            List<Produto> produtos = gerenciador.listarTodosProdutos();
            tableModel.setProdutos(produtos);
        } catch (SQLException ex) {
            mostrarErro("Erro ao listar produtos: " + ex.getMessage());
        }
    }

    private void listarPorCategoria() {
        Categoria categoriaSelecionada = (Categoria) comboCategoria.getSelectedItem();
        if (categoriaSelecionada == null) {
            JOptionPane.showMessageDialog(this, "Selecione uma categoria.", "Atencao", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            List<Produto> produtos = gerenciador.listarProdutosPorCategoria(categoriaSelecionada.getIdCategoria());
            tableModel.setProdutos(produtos);
        } catch (SQLException ex) {
            mostrarErro("Erro ao listar por categoria: " + ex.getMessage());
        }
    }

    private void selecionarCategoriaNoCombo(Integer idCategoria) {
        for (int i = 0; i < comboCategoria.getItemCount(); i++) {
            Categoria categoria = comboCategoria.getItemAt(i);
            if (categoria.getIdCategoria().equals(idCategoria)) {
                comboCategoria.setSelectedIndex(i);
                break;
            }
        }
    }

    private void mostrarErro(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
