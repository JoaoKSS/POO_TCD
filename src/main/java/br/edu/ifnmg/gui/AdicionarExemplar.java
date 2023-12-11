/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifnmg.gui;

import br.edu.ifnmg.book.Book;
import br.edu.ifnmg.book.BookDao;
import br.edu.ifnmg.copy.Copy;
import br.edu.ifnmg.copy.CopyDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joaok
 */
public class AdicionarExemplar extends javax.swing.JFrame {

    /**
     * Creates new form DeleteLivro
     */
    private static AdicionarExemplar instance;

    public AdicionarExemplar() {
        initComponents();
        // Centralização da janela
        setLocationRelativeTo(null);
        lblAdd.setVisible(false);
        lblSelecione.setVisible(false);
        lblNenhum.setVisible(false);
        updateBookTable();
        updateCopyTable();
    }

    public static AdicionarExemplar getInstance() {
        if (instance == null) {
            instance = new AdicionarExemplar();
        }
        instance.setAlwaysOnTop(true);
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTdsExemp = new javax.swing.JLabel();
        lblTdsLivros1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableLivro = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableExemplar = new javax.swing.JTable();
        btnAddExemp = new javax.swing.JButton();
        jSpinner = new javax.swing.JSpinner(new javax.swing.SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1));
        lblAdd = new javax.swing.JLabel();
        lblSelecione = new javax.swing.JLabel();
        lblNenhum = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criar Exemplares");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblTdsExemp.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblTdsExemp.setText("Exemplares");

        lblTdsLivros1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblTdsLivros1.setText("Livros Cadrastrados");

        tableLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Titulo", "Autor", "Páginas", "Ano", "Edição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(tableLivro);
        tableLivro.getAccessibleContext().setAccessibleName("Adicionar Exemplar");

        tableExemplar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Livro", "Edição", "Disponível"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableExemplar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tableExemplar);

        btnAddExemp.setText("Adicionar Exemplares");
        btnAddExemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddExempActionPerformed(evt);
            }
        });

        lblAdd.setForeground(new java.awt.Color(0, 0, 255));
        lblAdd.setText("Exemplar Adicionado Com Sucesso!!");

        lblSelecione.setForeground(new java.awt.Color(240, 0, 0));
        lblSelecione.setText("Selecione um Livro");

        lblNenhum.setForeground(new java.awt.Color(240, 0, 0));
        lblNenhum.setText("Nenhum exemplar!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnAddExemp)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(lblTdsLivros1))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 45, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTdsExemp)
                                .addGap(117, 117, 117))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNenhum, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSelecione)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTdsExemp)
                    .addComponent(lblTdsLivros1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddExemp)
                    .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNenhum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSelecione)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        lblSelecione.setVisible(false);
        lblAdd.setVisible(false);
        this.setAlwaysOnTop(false);
        this.setVisible(false);
        //TelaPrincipal.getInstance(TelaPrincipal.current_cred).setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnAddExempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddExempActionPerformed
        // TODO add your handling code here:
        int selectedBookRow = tableLivro.getSelectedRow();
        if (selectedBookRow == -1) {
            lblSelecione.setVisible(true);
            lblNenhum.setVisible(false);
            lblAdd.setVisible(false);
            return;
        }

        Long selectedBookId = (Long) tableLivro.getValueAt(selectedBookRow, 0);

        int quantity = (int) jSpinner.getValue();

        if (quantity == 0) {
            System.out.println("Nenhum exemplar adicionado.");
            lblSelecione.setVisible(false);
            lblNenhum.setVisible(true);
            return;
        }

        try {
            CopyDao copyDao = new CopyDao();
            BookDao bookDao = new BookDao();

            Book selectedBook = bookDao.findById(selectedBookId);

            for (int i = 0; i < quantity; i++) {
                Copy copy = new Copy();
                copy.setBook(selectedBook);
                copy.setDisponivel(true);

                copyDao.saveOrUpdate(copy);
            }

            updateCopyTable();

            lblSelecione.setVisible(false);
            lblNenhum.setVisible(false);
            lblAdd.setVisible(true);

            tableLivro.clearSelection();

            System.out.println("Exemplares cadastrados com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnAddExempActionPerformed

    private void updateBookTable() {
        try {
            BookDao bookDao = new BookDao();
            List<Book> books = bookDao.findAll();

            DefaultTableModel model = (DefaultTableModel) tableLivro.getModel();
            model.setRowCount(0);

            for (Book book : books) {
                Object[] rowData = {
                    book.getId(),
                    book.getTitle(),
                    book.getAuthors(),
                    book.getPages(),
                    book.getYear(),
                    book.getEdition(),};
                model.addRow(rowData);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void updateCopyTable() {
        try {
            CopyDao copyDao = new CopyDao();
            List<Copy> copies = copyDao.findAll();

            DefaultTableModel model = (DefaultTableModel) tableExemplar.getModel();
            model.setRowCount(0);

            for (Copy copy : copies) {
                Object[] rowData = {
                    copy.getBook().getTitle(),
                    copy.getBook().getEdition(),
                    copy.isDisponivel()
                };
                model.addRow(rowData);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(AdicionarExemplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarExemplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarExemplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarExemplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarExemplar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddExemp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblNenhum;
    private javax.swing.JLabel lblSelecione;
    private javax.swing.JLabel lblTdsExemp;
    private javax.swing.JLabel lblTdsLivros1;
    private javax.swing.JTable tableExemplar;
    private javax.swing.JTable tableLivro;
    // End of variables declaration//GEN-END:variables
}
