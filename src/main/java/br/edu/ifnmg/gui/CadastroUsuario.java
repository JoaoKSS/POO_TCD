/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.edu.ifnmg.gui;

import br.edu.ifnmg.adm.Adm;
import br.edu.ifnmg.adm.AdmDao;
import br.edu.ifnmg.credential.Credential;
import br.edu.ifnmg.credential.CredentialDao;
import br.edu.ifnmg.librarian.Librarian;
import br.edu.ifnmg.librarian.LibrarianDao;
import br.edu.ifnmg.reader.Reader;
import br.edu.ifnmg.reader.ReaderDao;
import br.edu.ifnmg.role.Role;
import br.edu.ifnmg.role.RoleDao;
import java.time.LocalDate;
import java.time.ZoneId;

/**
 *
 * @author ketsu
 */
public class CadastroUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadrastroUsuario
     */
    private static CadastroUsuario instance;

    public CadastroUsuario() {
        initComponents();
        // Centralização da janela
        //setLocationRelativeTo(null);
        lblCadastro.setVisible(false);
        lblIncorreto.setVisible(false);
    }

    public static CadastroUsuario getInstance() {
        if (instance == null) {
            instance = new CadastroUsuario();
        }
        TelaPrincipal.getInstance(TelaPrincipal.current_cred).jDesktop.add(instance);
        return instance;
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

        lblCadastro = new javax.swing.JLabel();
        pwdSenha = new javax.swing.JTextField();
        lblIncorreto = new javax.swing.JLabel();
        chkAtivo = new javax.swing.JCheckBox();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblAniversario = new javax.swing.JLabel();
        lblPapel = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        calDate = new com.toedter.calendar.JDateChooser();
        txtUsuario = new javax.swing.JTextField();
        boxPapel = new javax.swing.JComboBox<>();
        lblSenha = new javax.swing.JLabel();

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

        lblCadastro.setForeground(new java.awt.Color(0, 0, 255));
        lblCadastro.setText("Usuário Cadastrado!!");

        lblIncorreto.setForeground(new java.awt.Color(240, 0, 0));
        lblIncorreto.setText("Campos Indefinidos Troque-os!!");

        chkAtivo.setText("Ativo");

        lblNome.setText("Nome:");

        lblEmail.setText("Email:");

        lblAniversario.setText("Data de Aniversario:");

        lblPapel.setText("Papel:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblUsuario.setText("Usuário:");

        boxPapel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administrador", "Bibliotecário", "Leitor" }));

        lblSenha.setText("Senha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSenha)
                                    .addComponent(lblUsuario)
                                    .addComponent(lblPapel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                            .addComponent(pwdSenha))
                                        .addGap(83, 83, 83)
                                        .addComponent(chkAtivo))
                                    .addComponent(boxPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEmail)
                                    .addComponent(lblNome))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(txtEmail))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNome))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblAniversario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(calDate, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 79, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(98, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIncorreto))
                        .addGap(93, 93, 93)
                        .addComponent(btnSalvar)))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPapel)
                    .addComponent(boxPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(pwdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAtivo))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAniversario)
                    .addComponent(calDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblIncorreto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(lblCadastro))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        try {
            Credential auxiliar = TelaPrincipal.current_cred;
            TelaPrincipal.current_cred=null;
            Role role = new Role(boxPapel.getSelectedItem().toString());
            Long role_id = new RoleDao().saveOrUpdate(role);
            role.setId(role_id);

            Credential cred1 = new Credential();
            cred1.setId(null);
            cred1.setUsername(txtUsuario.getText());
            cred1.setPassword(pwdSenha.getText());
            cred1.setLastAccess(LocalDate.now());
            cred1.setEnabled(chkAtivo.isSelected());
            if (boxPapel.getSelectedItem().toString().equals("Bibliotecário")) {
                Librarian ana = null;
                ana = new Librarian();
                ana.setName(txtNome.getText());
                ana.setEmail(txtEmail.getText());
                ana.setBirthDate(getSelectedDate(calDate));
                ana.setRole(role);
                ana.setCredential(cred1);

                cred1.setUser(ana);
                Long user_id = new LibrarianDao().saveOrUpdate(ana);

                Librarian L = null;
                L = new LibrarianDao().findById(user_id);
                new LibrarianDao().saveOrUpdate(L);
                System.out.println("Bibliotecário Cadastrado!!");
                //instance.setAlwaysOnTop(false);
                lblCadastro.setVisible(true);
                //                this.setVisible(false);
                //                TelaPrincipal.getInstance(TelaPrincipal.current_cred).setVisible(true);
                System.out.println(L.toString());
            } else if (boxPapel.getSelectedItem().toString().equals("Leitor")) {
                Reader joao = null;
                joao = new Reader();
                joao.setName(txtNome.getText());
                joao.setEmail(txtEmail.getText());
                joao.setBirthDate(getSelectedDate(calDate));
                joao.setRole(role);
                joao.setCredential(cred1);
                joao.getCredential().setUser(joao);
                Long user_id = new ReaderDao().saveOrUpdate(joao);

                joao = new ReaderDao().findById(user_id);
                new ReaderDao().saveOrUpdate(joao);
                //instance.setAlwaysOnTop(false);
                System.out.println("Leitor Cadastrado!!");
                lblCadastro.setVisible(true);
                //                this.setVisible(false);
                //                TelaPrincipal.getInstance(TelaPrincipal.current_cred).setVisible(true);
                System.out.println(joao.toString());
            } else if (boxPapel.getSelectedItem().toString().equals("Administrador")) {
                Adm adm = null;
                adm = new Adm();
                adm.setName(txtNome.getText());
                adm.setEmail(txtEmail.getText());
                adm.setBirthDate(getSelectedDate(calDate));
                adm.setRole(role);
                adm.setCredential(cred1);
                adm.getCredential().setUser(adm);
                Long user_id = new AdmDao().saveOrUpdate(adm);

                adm = new AdmDao().findById(user_id);
                new AdmDao().saveOrUpdate(adm);
                //instance.setAlwaysOnTop(false);
                System.out.println("Administrador Cadastrado!!");
                lblCadastro.setVisible(true);
                //                this.setVisible(false);
                //                TelaPrincipal.getInstance(TelaPrincipal.current_cred).setVisible(true);
                System.out.println(adm.toString());
            }
            TelaPrincipal.current_cred=auxiliar;
            boxPapel.setSelectedIndex(0);
            txtUsuario.setText("");
            pwdSenha.setText("");
            chkAtivo.setSelected(false);
            txtNome.setText("");
            txtEmail.setText("");
            calDate.setDate(null);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            lblIncorreto.setVisible(true);
            lblCadastro.setVisible(false);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        instance = null;
    }//GEN-LAST:event_formInternalFrameClosing


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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxPapel;
    private javax.swing.JButton btnSalvar;
    private com.toedter.calendar.JDateChooser calDate;
    private javax.swing.JCheckBox chkAtivo;
    private javax.swing.JLabel lblAniversario;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIncorreto;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPapel;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField pwdSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
