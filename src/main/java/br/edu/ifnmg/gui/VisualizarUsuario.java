/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.edu.ifnmg.gui;

import br.edu.ifnmg.gui.*;
import br.edu.ifnmg.credential.Credential;
import br.edu.ifnmg.credential.CredentialDao;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author joaok
 */
public class VisualizarUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form AtualizaUsuario
     */
    private static VisualizarUsuario instance;
    public static Credential cred = null;

    public VisualizarUsuario() {
        initComponents();
        // Centralização da janela
        //setLocationRelativeTo(null);
        updateUsuarioTable();
        ocultarColunaId();
    }

    public static VisualizarUsuario getInstance() {
        if (instance == null) {
            instance = new VisualizarUsuario();
        }
        instance.updateUsuarioTable();
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

        setClosable(true);

        tableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Email", "Aniversário", "Papel", "Usuário"
            }
        ));
        jScrollPane1.setViewportView(tableUsuario);

        lblTdsUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblTdsUsuario.setText("Usuário ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTdsUsuario)
                .addGap(210, 210, 210))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTdsUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateUsuarioTable() {
        try {
            ArrayList<Credential> credentialList = new CredentialDao().findAll();
            DefaultTableModel model = (DefaultTableModel) tableUsuario.getModel();
            model.setRowCount(0);
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            for (Credential credential : credentialList) {
                Long CredId = cred.getUser().getId();
                if (credential.getId().equals(CredId)) {
                    String formattedDate = credential.getUser().getBirthDate().format(dateFormatter);
                    Object[] rowData = {
                        credential.getId(),
                        credential.getUser().getName(),
                        credential.getUser().getEmail(),
                        formattedDate,
                        credential.getUser().getRole().getName(),
                        credential.getUsername()
                    };
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
            java.util.logging.Logger.getLogger(VisualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTdsUsuario;
    private javax.swing.JTable tableUsuario;
    // End of variables declaration//GEN-END:variables
}
