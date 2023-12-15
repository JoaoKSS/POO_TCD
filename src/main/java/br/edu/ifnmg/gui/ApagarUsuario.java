/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.edu.ifnmg.gui;

import br.edu.ifnmg.credential.Credential;
import br.edu.ifnmg.credential.CredentialDao;
import br.edu.ifnmg.role.RoleDao;
import br.edu.ifnmg.user.UserDao;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author joaok
 */
public class ApagarUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form AtualizaUsuario
     */
    private static ApagarUsuario instance;
    public static Credential cred = null;

    public ApagarUsuario() {
        initComponents();
        // Centralização da janela
        //setLocationRelativeTo(null);
        lblSelecione.setVisible(false);
        lblApagado.setVisible(false);
        DeleteUsuarioTable();
        ocultarColunaId();
    }

    public static ApagarUsuario getInstance() {
        if (instance == null) {
            instance = new ApagarUsuario();
        }
        instance.DeleteUsuarioTable();
        TelaPrincipal.getInstance(TelaPrincipal.current_cred).jDesktop.add(instance);
        return instance;
    }

    private void ocultarColunaId() {
        int columnIndex = 0;
        TableColumn colunaId = tableUsuario.getColumnModel().getColumn(columnIndex);
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsuario = new javax.swing.JTable();
        lblTdsUsuario = new javax.swing.JLabel();
        btnDelUser = new javax.swing.JButton();
        lblSelecione = new javax.swing.JLabel();
        lblApagado = new javax.swing.JLabel();

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

        tableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Email", "Aniversário", "Papel"
            }
        ));
        jScrollPane1.setViewportView(tableUsuario);

        lblTdsUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblTdsUsuario.setText("Usuários Cadrastrados");

        btnDelUser.setText("Apagar ");
        btnDelUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelUserActionPerformed(evt);
            }
        });

        lblSelecione.setForeground(new java.awt.Color(240, 0, 0));
        lblSelecione.setText("Selecione um Usuário!!");

        lblApagado.setForeground(new java.awt.Color(0, 0, 255));
        lblApagado.setText("Comentário Apagado Com Sucesso!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblApagado, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelUser)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(lblTdsUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(lblSelecione)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTdsUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSelecione)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApagado)
                    .addComponent(btnDelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDelUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelUserActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableUsuario.getSelectedRow();
        if (selectedRow != -1) {
            Long selectedId = (Long) tableUsuario.getValueAt(selectedRow, 0);
            DeleteUsuario(selectedId);
            DeleteUsuarioTable();
            lblSelecione.setVisible(false);
            lblApagado.setVisible(true);
            return;
        } else {
            System.out.println("Selecione um exemplar antes de deletar.");
            lblSelecione.setVisible(true);
            lblApagado.setVisible(false);
        }

    }//GEN-LAST:event_btnDelUserActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        instance = null;
    }//GEN-LAST:event_formInternalFrameClosing

    private void DeleteUsuarioTable() {
        try {
            ArrayList<Credential> credentialList = new CredentialDao().findAll();
            DefaultTableModel model = (DefaultTableModel) tableUsuario.getModel();
            model.setRowCount(0);
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            for (Credential credential : credentialList) {
                Long CredId = cred.getUser().getId();
                if (!credential.getId().equals(CredId)) {
                    String formattedDate = credential.getUser().getBirthDate().format(dateFormatter);
                    Object[] rowData = {
                        credential.getId(),
                        credential.getUser().getName(),
                        credential.getUser().getEmail(),
                        formattedDate,
                        credential.getUser().getRole().getName()
                    };
                    model.addRow(rowData);
                    tableUsuario.getSelectionModel().addListSelectionListener(e -> {
                        int selectedRow = tableUsuario.getSelectedRow();
                        if (selectedRow != -1) {

                            lblSelecione.setVisible(false);
                            lblApagado.setVisible(false);
                        }
                    });
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void DeleteUsuario(Long selectedId) {
        try {
            CredentialDao credentialDao = new CredentialDao();
            Credential credential = credentialDao.findById(selectedId);
            credentialDao.delete(selectedId);

            UserDao userDao = new UserDao();
            userDao.delete(credential.getUser().getId());

            RoleDao roleDao = new RoleDao();
            roleDao.delete(credential.getUser().getRole().getId());
            
            DeleteUsuarioTable();
        } catch (Exception e) {
            System.out.println("Erro ao excluir usuário: " + e.getMessage());
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
            java.util.logging.Logger.getLogger(ApagarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApagarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApagarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApagarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApagarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApagado;
    private javax.swing.JLabel lblSelecione;
    private javax.swing.JLabel lblTdsUsuario;
    private javax.swing.JTable tableUsuario;
    // End of variables declaration//GEN-END:variables
}
