package com.mycompany.revisaojdbc;

import com.mycompany.revisaojdbc.view.CadastroProdutosFrame;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CadastroProdutosFrame frame = new CadastroProdutosFrame();
            frame.setVisible(true);
        });
    }
}
