/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 2024122760199
 */
public class FramePrincipalProva extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FramePrincipalProva.class.getName());

    public FramePrincipalProva() {
    initComponents();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupVac = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItemInserir = new javax.swing.JMenuItem();
        jMenuItemExcluir = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanelVacina = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButtonCovid1 = new javax.swing.JRadioButton();
        jRadioButtonCovid2 = new javax.swing.JRadioButton();
        jRadioButtonOutra = new javax.swing.JRadioButton();
        jComboVacinas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButtonCadastro = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanelResumoTab = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableResumo = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPainelID = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jTextCPF = new javax.swing.JTextField();
        jButtonLimpar = new javax.swing.JButton();
        jPanelDose1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldData1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanelDose2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldData2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jMenuItemInserir.setText("Inserir");
        jMenuItemInserir.setToolTipText("");
        jMenuItemInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInserirActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItemInserir);

        jMenuItemExcluir.setText("Excluir");
        jMenuItemExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItemExcluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Nacional de Vacinação");

        jPanelVacina.setForeground(new java.awt.Color(255, 255, 255));
        jPanelVacina.setToolTipText("");

        jLabel5.setText("Tipo Vacina");

        buttonGroupVac.add(jRadioButtonCovid1);
        jRadioButtonCovid1.setText("COVID - 1° Dose");
        jRadioButtonCovid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCovid1ActionPerformed(evt);
            }
        });

        buttonGroupVac.add(jRadioButtonCovid2);
        jRadioButtonCovid2.setText("COVID - 2° Dose");
        jRadioButtonCovid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCovid2ActionPerformed(evt);
            }
        });

        buttonGroupVac.add(jRadioButtonOutra);
        jRadioButtonOutra.setText("Outras");
        jRadioButtonOutra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOutraActionPerformed(evt);
            }
        });

        jComboVacinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CoronaVac", "AstraZeneca", "Pfizer", "BCG", "Gripe", "Polio", "Sarampo" }));

        jLabel3.setText("Nome da Vacina");

        javax.swing.GroupLayout jPanelVacinaLayout = new javax.swing.GroupLayout(jPanelVacina);
        jPanelVacina.setLayout(jPanelVacinaLayout);
        jPanelVacinaLayout.setHorizontalGroup(
            jPanelVacinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVacinaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVacinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVacinaLayout.createSequentialGroup()
                        .addGroup(jPanelVacinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanelVacinaLayout.createSequentialGroup()
                                .addComponent(jRadioButtonCovid1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonCovid2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonOutra)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelVacinaLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboVacinas, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        jPanelVacinaLayout.setVerticalGroup(
            jPanelVacinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVacinaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVacinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonCovid1)
                    .addComponent(jRadioButtonCovid2)
                    .addComponent(jRadioButtonOutra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVacinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboVacinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonCadastro.setText("Inserir");
        jButtonCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroActionPerformed(evt);
            }
        });

        jPanelResumoTab.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumo"));

        jTableResumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Tipo Vacina", "Nome Vacina", "Data1", "Data2"
            }
        ));
        jTableResumo.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(jTableResumo);

        javax.swing.GroupLayout jPanelResumoTabLayout = new javax.swing.GroupLayout(jPanelResumoTab);
        jPanelResumoTab.setLayout(jPanelResumoTabLayout);
        jPanelResumoTabLayout.setHorizontalGroup(
            jPanelResumoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResumoTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelResumoTabLayout.setVerticalGroup(
            jPanelResumoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelResumoTabLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(281, 281, 281))
        );

        jScrollPane4.setViewportView(jPanelResumoTab);
        jPanelResumoTab.getAccessibleContext().setAccessibleName("");

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("Agenda Vacinação");

        jPainelID.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));
        jPainelID.setToolTipText("Dados Pessoais");
        jPainelID.setName("Dados Pessoais"); // NOI18N

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });

        jTextCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextCPFFocusLost(evt);
            }
        });
        jTextCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPainelIDLayout = new javax.swing.GroupLayout(jPainelID);
        jPainelID.setLayout(jPainelIDLayout);
        jPainelIDLayout.setHorizontalGroup(
            jPainelIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelIDLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPainelIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPainelIDLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jTextNome))
                    .addGroup(jPainelIDLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        jPainelIDLayout.setVerticalGroup(
            jPainelIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelIDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPainelIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPainelIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jLabel4.setText("1° Dose");

        jTextFieldData1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldData1FocusLost(evt);
            }
        });
        jTextFieldData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldData1ActionPerformed(evt);
            }
        });

        jLabel7.setText("DATA");

        javax.swing.GroupLayout jPanelDose1Layout = new javax.swing.GroupLayout(jPanelDose1);
        jPanelDose1.setLayout(jPanelDose1Layout);
        jPanelDose1Layout.setHorizontalGroup(
            jPanelDose1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDose1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDose1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldData1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanelDose1Layout.setVerticalGroup(
            jPanelDose1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDose1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDose1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel8.setText("2° Dose");

        jLabel9.setText("DATA");

        javax.swing.GroupLayout jPanelDose2Layout = new javax.swing.GroupLayout(jPanelDose2);
        jPanelDose2.setLayout(jPanelDose2Layout);
        jPanelDose2Layout.setHorizontalGroup(
            jPanelDose2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDose2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDose2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldData2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanelDose2Layout.setVerticalGroup(
            jPanelDose2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDose2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDose2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldData2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanelDose1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanelDose2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButtonCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPainelID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPainelID, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDose1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelDose2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCadastro)
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonLimpar))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableRelatorioMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jTableRelatorioMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableRelatorioMouseWheelMoved

    private void jButtonCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroActionPerformed
    // 1. Coletar os dados dos campos de texto (o .trim() remove espaços em branco)
    String nome = jTextNome.getText().trim();
    String cpf = jTextCPF.getText().trim();
    
    // --- NOVAS TRAVAS DE SEGURANÇA ---
    
    // Trava 1: Verifica se Nome ou CPF estão vazios
    if (nome.isEmpty() || cpf.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, preencha o Nome e o CPF antes de inserir.", "Campos Obrigatórios", javax.swing.JOptionPane.WARNING_MESSAGE);
        if (nome.isEmpty()) jTextNome.requestFocus();
        else jTextCPF.requestFocus();
        return; // Interrompe o código e não cadastra
    }

    // Trava 2: Garante que o CPF digitado é válido antes de salvar na tabela
    if (!isCPFValido(cpf)) {
        javax.swing.JOptionPane.showMessageDialog(this, "O CPF digitado é inválido. Verifique os números.", "Erro no CPF", javax.swing.JOptionPane.ERROR_MESSAGE);
        jTextCPF.requestFocus();
        return;
    }
    
    // Trava 3: Verifica se algum Tipo de Vacina foi selecionado
    if (!jRadioButtonCovid1.isSelected() && !jRadioButtonCovid2.isSelected() && !jRadioButtonOutra.isSelected()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, selecione o Tipo de Vacina.", "Campos Obrigatórios", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // ---------------------------------

    // Evita erro caso o botão seja clicado antes de selecionar a vacina
    String nomeVacina = "";
    if (jComboVacinas.getSelectedItem() != null) {
        nomeVacina = jComboVacinas.getSelectedItem().toString();
    }

    // 2. Pegar o RadioButton selecionado (Tipo de Vacina)
    String tipoVacina = "";
    if (jRadioButtonCovid1.isSelected()) {
        tipoVacina = "COVID - 1ª Dose";
    } else if (jRadioButtonCovid2.isSelected()) {
        tipoVacina = "COVID - 2ª Dose";
    } else if (jRadioButtonOutra.isSelected()) {
        tipoVacina = "Outras";
    }

    // 3. Pegar e VALIDAR as datas
    String data1 = "-";
    if (jPanelDose1.isVisible()) {
        data1 = jTextFieldData1.getText().trim();
        
        // Trava de segurança: Verifica se tem 10 caracteres e barras
        if (!data1.matches("\\d{2}/\\d{2}/\\d{4}")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Data da 1ª Dose inválida! Use o formato dd/MM/yyyy (com as barras).", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            jTextFieldData1.requestFocus();
            return; 
        }
        
        try {
            strToDate(data1); 
        } catch (java.text.ParseException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Data da 1ª Dose não existe no calendário!", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            jTextFieldData1.requestFocus();
            return; 
        }
    }

    String data2 = "-";
    if (jPanelDose2.isVisible()) {
        data2 = jTextFieldData2.getText().trim();
        
        // Trava de segurança para a data 2
        if (!data2.matches("\\d{2}/\\d{2}/\\d{4}")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Data da 2ª Dose inválida! Use o formato dd/MM/yyyy (com as barras).", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            jTextFieldData2.requestFocus();
            return; 
        }
        
        try {
            strToDate(data2);
        } catch (java.text.ParseException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Data da 2ª Dose não existe no calendário!", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            jTextFieldData2.requestFocus();
            return; 
        }
    }

    // 4. ADICIONAR NA TABELA (Só chega aqui se tudo estiver preenchido e correto)
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTableResumo.getModel();

    modelo.addRow(new Object[]{
        nome,
        cpf,
        tipoVacina,
        nomeVacina,
        data1,
        data2
    });

    jButtonLimparActionPerformed(evt);

    }//GEN-LAST:event_jButtonCadastroActionPerformed

    private void jRadioButtonCovid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCovid2ActionPerformed
        String[] vac1 = {"CoronaVac", "AstraZeneca", "Pfizer"};

        // Criamos o modelo e aplicamos ao ComboBox
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(vac1);
        jComboVacinas.setModel(model);
        
        jPanelDose1.setVisible(false);
        jPanelDose2.setVisible(true);
    }//GEN-LAST:event_jRadioButtonCovid2ActionPerformed

    private void jRadioButtonCovid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCovid1ActionPerformed
        String[] vac = {"CoronaVac", "AstraZeneca", "Pfizer"};

        // Criamos o modelo e aplicamos ao ComboBox
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(vac);
        jComboVacinas.setModel(model);
        
        // Adiciona as vacinas e mostra as duas datas
        jPanelDose1.setVisible(true);
        jPanelDose2.setVisible(true);

    }//GEN-LAST:event_jRadioButtonCovid1ActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
    jTextNome.setText("");
    jTextCPF.setText("");
    jTextFieldData1.setText("");
    jTextFieldData2.setText("");

    // 2. Desmarca os RadioButtons e limpa o ComboBox
    buttonGroupVac.clearSelection();
    jComboVacinas.removeAllItems();

    // 3. Esconde os painéis de data
    jPanelDose1.setVisible(false);
    jPanelDose2.setVisible(false);

    // 4. Devolve o foco (cursor piscando) para o campo Nome
    jTextNome.requestFocus();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jRadioButtonOutraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOutraActionPerformed
        String[] vac2 = {"BCG", "Gripe", "Polio", "Sarampo"};

        // Criamos o modelo e aplicamos ao ComboBox
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(vac2);
        jComboVacinas.setModel(model);
        
        jPanelDose1.setVisible(true);
        jPanelDose2.setVisible(false);
    }//GEN-LAST:event_jRadioButtonOutraActionPerformed

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeActionPerformed

    private void jTextCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCPFActionPerformed

    private void jTextFieldData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldData1ActionPerformed
    // Só calcula se o campo tiver algo digitado (evita erro se clicar fora com ele vazio)
    if (jTextFieldData1.getText().trim().length() >= 10) {
        try {
            String vacina = jComboVacinas.getSelectedItem().toString();
            Date data1 = strToDate(jTextFieldData1.getText());
            Calendar cal = Calendar.getInstance();
            cal.setTime(data1);

            // Converte de volta e joga no campo da Dose 2
            jTextFieldData1.setText(dateToStr(cal.getTime()));

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Data 1 inválida. Use o formato dd/MM/yyyy.");
            jTextFieldData1.setText(""); // Limpa o campo errado
        }
    }
    }//GEN-LAST:event_jTextFieldData1ActionPerformed

    private void jTextFieldData1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldData1FocusLost
    // Só calcula se o campo tiver algo digitado (evita erro se clicar fora com ele vazio)
    if (jTextFieldData1.getText().trim().length() >= 10) {
        try {
            String vacina = jComboVacinas.getSelectedItem().toString();
            Date data1 = strToDate(jTextFieldData1.getText());
            Calendar cal = Calendar.getInstance();
            cal.setTime(data1);

            // Regras do Requisito 3
            if (vacina.equals("CoronaVac") || vacina.equals("Pfizer")) {
                cal.add(Calendar.DAY_OF_MONTH, 21);
            } else if (vacina.equals("AstraZeneca")) {
                cal.add(Calendar.DAY_OF_MONTH, 80);
            }

            // Converte de volta e joga no campo da Dose 2
            jTextFieldData2.setText(dateToStr(cal.getTime()));

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Data 1 inválida. Use o formato dd/MM/yyyy.");
            jTextFieldData1.setText(""); // Limpa o campo errado
        }
    }
    }//GEN-LAST:event_jTextFieldData1FocusLost

    private void jTextCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextCPFFocusLost
        String cpf = jTextCPF.getText();
    
    // Só valida se o campo não estiver vazio
    if (!cpf.trim().isEmpty()) {
        if (!isCPFValido(cpf)) {
            JOptionPane.showMessageDialog(this, "CPF Inválido! Verifique os números digitados.", "Erro", JOptionPane.ERROR_MESSAGE);
            jTextCPF.setText(""); // Limpa o campo
            jTextCPF.requestFocus(); // Obriga o usuário a digitar de novo
        }
    }
    }//GEN-LAST:event_jTextCPFFocusLost

    private void jMenuItemInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInserirActionPerformed
        jButtonCadastro.doClick();
    }//GEN-LAST:event_jMenuItemInserirActionPerformed

    private void jMenuItemExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirActionPerformed
        int linhaSelecionada = jTableResumo.getSelectedRow();
    
    if (linhaSelecionada >= 0) {
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTableResumo.getModel();
        modelo.removeRow(linhaSelecionada);
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione uma linha para excluir.");
    }
    }//GEN-LAST:event_jMenuItemExcluirActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FramePrincipalProva().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupVac;
    private javax.swing.JButton jButtonCadastro;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JComboBox<String> jComboVacinas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItemExcluir;
    private javax.swing.JMenuItem jMenuItemInserir;
    private javax.swing.JPanel jPainelID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDose1;
    private javax.swing.JPanel jPanelDose2;
    private javax.swing.JPanel jPanelResumoTab;
    private javax.swing.JPanel jPanelVacina;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButtonCovid1;
    private javax.swing.JRadioButton jRadioButtonCovid2;
    private javax.swing.JRadioButton jRadioButtonOutra;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableResumo;
    private javax.swing.JTextField jTextCPF;
    private javax.swing.JTextField jTextFieldData1;
    private javax.swing.JTextField jTextFieldData2;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables

    // Converte de DATE para STRING
    private String dateToStr(Date time) throws ParseException {
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        formato.setLenient(false); 
        return formato.format(time); 
    }

    // Converte de STRING para DATE [cite: 57]
    private Date strToDate(String text) throws ParseException {
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        formato.setLenient(false); 
        return formato.parse(text);
    }
    
    // Método para validar o CPF
private boolean isCPFValido(String cpf) {
    // Remove qualquer caractere que não seja número (caso o usuário digite pontos ou traços)
    cpf = cpf.replaceAll("[^0-9]", ""); 
    
    // Verifica se tem 11 dígitos ou se todos os números são iguais (ex: 111.111.111-11)
    if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) return false;

    try {
        int soma = 0, peso = 10;
        for (int i = 0; i < 9; i++) soma += (cpf.charAt(i) - '0') * peso--;
        int resto = 11 - (soma % 11);
        char dig10 = (resto == 10 || resto == 11) ? '0' : (char) (resto + '0');

        soma = 0; peso = 11;
        for (int i = 0; i < 10; i++) soma += (cpf.charAt(i) - '0') * peso--;
        resto = 11 - (soma % 11);
        char dig11 = (resto == 10 || resto == 11) ? '0' : (char) (resto + '0');

        return (dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10));
    } catch (Exception e) {
        return false;
    }
}

}
