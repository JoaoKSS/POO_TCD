/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.edu.ifnmg.gui;

import br.edu.ifnmg.copy.Copy;
import br.edu.ifnmg.copy.CopyDao;
import br.edu.ifnmg.credential.Credential;
import br.edu.ifnmg.credential.CredentialDao;
import br.edu.ifnmg.emprestimo.Emprestimo;
import br.edu.ifnmg.user.User;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author ketsu
 */
public class EmprestarLivro extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadrastroUsuario
     */
    private static EmprestarLivro instance;
    private Long selectedId;

    public EmprestarLivro() {
        initComponents();
        // Centralização da janela
        //setLocationRelativeTo(null);
        lblIncorreto.setVisible(false);
        lblEmprestimo.setVisible(false);
        lblSelecione.setVisible(false);
        lblIndisponivel.setVisible(false);
        updateBookTable();
        ocultarColunaId();
    }

    public static EmprestarLivro getInstance() {
        if (instance == null) {
            instance = new EmprestarLivro();
        }
        instance.updateBookTable();
        TelaPrincipal.getInstance(TelaPrincipal.current_cred).jDesktop.add(instance);
        return instance;
    }

    private void ocultarColunaId() {
        int columnIndex = 0;
        TableColumn colunaId = tableLivro.getColumnModel().getColumn(columnIndex);
        colunaId.setMinWidth(0);
        colunaId.setMaxWidth(0);
        colunaId.setPreferredWidth(0);
        colunaId.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    private LocalDate getSelectedDate(com.toedter.calendar.JDateChooser dateChooser) {
        if (dateChooser.getDate() != null) {
            return dateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
        return LocalDate.now();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSelecione1 = new javax.swing.JLabel();
        lblAtualizado = new javax.swing.JLabel();
        PwdSenha = new javax.swing.JPasswordField();
        lblUsuario = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        calDate = new com.toedter.calendar.JDateChooser();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLivro = new javax.swing.JTable();
        lblSenha = new javax.swing.JLabel();
        lblSelecione = new javax.swing.JLabel();
        lblIncorreto = new javax.swing.JLabel();
        lblEmprestimo = new javax.swing.JLabel();
        lblIndisponivel = new javax.swing.JLabel();

        lblSelecione1.setForeground(new java.awt.Color(240, 0, 0));
        lblSelecione1.setText("Selecione um Livro");

        lblAtualizado.setForeground(new java.awt.Color(0, 0, 255));
        lblAtualizado.setText("Livro Atualizado Com Sucesso!!");

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        lblUsuario.setText("Leitor");

        lblNome.setText("Data de entrega");

        btnSalvar.setText("Confirmar Empréstimo");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        tableLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Autor", "Páginas", "Ano", "Edição", "Disponivel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableLivro);

        lblSenha.setText("Senha");

        lblSelecione.setForeground(new java.awt.Color(240, 0, 0));
        lblSelecione.setText("Selecione um Livro");

        lblIncorreto.setForeground(new java.awt.Color(240, 0, 0));
        lblIncorreto.setText("Usuário ou Senha Incorretos!");

        lblEmprestimo.setForeground(new java.awt.Color(0, 0, 255));
        lblEmprestimo.setText("Emprestimo Efetuado Com Sucesso!!");

        lblIndisponivel.setForeground(new java.awt.Color(240, 0, 0));
        lblIndisponivel.setText("Livro Indisponível!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(391, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblIncorreto, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSelecione)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblIndisponivel)
                        .addGap(106, 106, 106))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(calDate, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblUsuario)
                                        .addComponent(lblSenha))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PwdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(16, 16, 16))
                        .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addContainerGap(24, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblSelecione)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(lblIncorreto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmprestimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIndisponivel)
                .addGap(63, 63, 63))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(calDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblUsuario)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSenha)
                                .addComponent(PwdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(86, 86, 86)
                            .addComponent(btnSalvar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableLivro.getSelectedRow();
        if (selectedRow != -1) {
            EmprestaLivro();
            updateBookTable();
        } else {
            System.out.println("Selecione um livro antes de adicionar um emprestimo.");
            lblIncorreto.setVisible(false);
            lblEmprestimo.setVisible(false);
            lblSelecione.setVisible(true);
            lblIndisponivel.setVisible(false);
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        instance = null;
    }//GEN-LAST:event_formInternalFrameClosing

    private void updateBookTable() {
        try {
            CopyDao copyDao = new CopyDao();
            List<Copy> copies = copyDao.findAll();

            DefaultTableModel model = (DefaultTableModel) tableLivro.getModel();
            model.setRowCount(0);

            for (Copy copy : copies) {
                Object[] rowData = {
                    copy.getBook().getTitle(),
                    copy.getBook().getAuthors(),
                    copy.getBook().getPages(),
                    copy.getBook().getYear(),
                    copy.getBook().getEdition(),
                    copy.isDisponivel(),};
                model.addRow(rowData);

                tableLivro.getSelectionModel().addListSelectionListener(e -> {
                    int selectedRow = tableLivro.getSelectedRow();
                    if (selectedRow != -1) {
                        selectedId = copy.getId();
                        lblIncorreto.setVisible(false);
                        lblEmprestimo.setVisible(false);
                        lblSelecione.setVisible(false);
                        lblIndisponivel.setVisible(false);
                    }
                });
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void EmprestaLivro() {
        try {
            System.out.println("Autenticar");
            User usuario = null;
            Credential test = null;
            try {
                test = new Credential();
                test.setUsername(txtUsuario.getText());
                test.setPassword(new String(PwdSenha.getPassword()));
                usuario = new CredentialDao().authenticate(test);
            } catch (Exception e) {
                System.out.println("Login: " + e.getMessage());
            }

            if (usuario != null) {
                System.out.println("Usuário e Senha Validos");
                PwdSenha.setText("");
                txtUsuario.setText("");

                Emprestimo.emprestar(getSelectedDate(calDate), TelaPrincipal.current_cred.getUser(), usuario, tableLivro.getSelectedRows(), lblIndisponivel);
                lblEmprestimo.setVisible(true);
                lblIncorreto.setVisible(false);
                lblSelecione.setVisible(false);

            } else {

                // Usuário NÃO-autenticado
                System.out.println("Usuário e/ou Senha Inválidos Tente Novamente.");
                txtUsuario.requestFocus();
                txtUsuario.selectAll();
                PwdSenha.setText(null);
                lblIncorreto.setVisible(true);
                lblEmprestimo.setVisible(false);
                lblSelecione.setVisible(false);
                lblIndisponivel.setVisible(false);

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmprestarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmprestarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmprestarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmprestarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmprestarLivro().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PwdSenha;
    private javax.swing.JButton btnSalvar;
    private com.toedter.calendar.JDateChooser calDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAtualizado;
    private javax.swing.JLabel lblEmprestimo;
    private javax.swing.JLabel lblIncorreto;
    private javax.swing.JLabel lblIndisponivel;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSelecione;
    private javax.swing.JLabel lblSelecione1;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tableLivro;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
