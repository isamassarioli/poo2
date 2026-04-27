package com.mycompany.revisaojdbc.view;

import com.mycompany.revisaojdbc.model.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProdutoTableModel extends AbstractTableModel {

    private final String[] colunas = {"ID", "Nome", "Qtde", "Preco", "Categoria"};
    private final List<Produto> dados = new ArrayList<>();

    public void setProdutos(List<Produto> produtos) {
        dados.clear();
        if (produtos != null) {
            dados.addAll(produtos);
        }
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto p = dados.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> p.getIdProduto();
            case 1 -> p.getNome();
            case 2 -> p.getQuantidade();
            case 3 -> p.getPreco();
            case 4 -> p.getCategoria() != null ? p.getCategoria().getDescricao() : "";
            default -> "";
        };
    }
}
