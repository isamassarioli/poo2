package controller;

import viewer.FrmCadastroVacinacao;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author jean_
 */
public class GerInterGrafica {

    // SINGLETON
    private final static GerInterGrafica unicaInstancia = new GerInterGrafica();    
    private GerenciadorDominio gerDom;
    
    private GerInterGrafica()  {
        gerDom = new GerenciadorDominio();
    }
    
    public static GerInterGrafica getInstance() {
        return unicaInstancia;
    }

    public GerenciadorDominio getGerDominio() {
        return gerDom;
    }
    // FIM DO SINGLETON
    
    // ATRIBUTOS
    private FrmCadastroVacinacao frmPrinc = null;
    
    
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe){
        if (dlg == null){     
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class ).newInstance(parent,true);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(frmPrinc, "Erro ao abrir a janela " + classe.getName() );
            }
        }        
        dlg.setVisible(true);  
        return dlg;
    }
    
    public void abrirJanPrincipal(){
        if ( frmPrinc == null) {
            frmPrinc = new FrmCadastroVacinacao();
        }
        frmPrinc.setVisible(true);
        
    }
       
    
       /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroVacinacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroVacinacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroVacinacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroVacinacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        GerInterGrafica gerIG = new GerInterGrafica();
        gerIG.abrirJanPrincipal();
    }
}
