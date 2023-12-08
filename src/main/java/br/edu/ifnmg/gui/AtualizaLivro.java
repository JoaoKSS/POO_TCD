/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifnmg.gui;

import br.edu.ifnmg.gui.*;
import br.edu.ifnmg.book.Book;
import br.edu.ifnmg.book.BookDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joaok
 */
public class AtualizaLivro extends javax.swing.JFrame {

    /**
     * Creates new form AtualizaLivro
     */
    private static AtualizaLivro instance;

    public AtualizaLivro() {
        initComponents();
        // Centralização da janela
        setLocationRelativeTo(null);
        lblAtualizado.setVisible(false);
        lblSelecione.setVisible(false);
        updateBookTable();
    }

    public static AtualizaLivro getInstance() {
        if (instance == null) {
            instance = new AtualizaLivro();
        }

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

        panelAtualiza = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLivro = new javax.swing.JTable();
        lblTdsLivros = new javax.swing.JLabel();
        lblSelecione = new javax.swing.JLabel();
        lblAtualizado = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblAutor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        lblPaginas = new javax.swing.JLabel();
        txtPaginas = new javax.swing.JTextField();
        lblAno = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        lblEdicao = new javax.swing.JLabel();
        txtEdicao = new javax.swing.JTextField();
        btnAtualiza = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Atualizar Livro");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
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
                "id", "Titulo", "Autor", "Páginas", "Ano", "Edição"
            }
        ));
        jScrollPane1.setViewportView(tableLivro);

        lblTdsLivros.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblTdsLivros.setText("Livros Cadrastrados");

        lblSelecione.setForeground(new java.awt.Color(240, 0, 0));
        lblSelecione.setText("Selecione um Livro");

        lblAtualizado.setForeground(new java.awt.Color(0, 0, 255));
        lblAtualizado.setText("Livro Atualizado Com Sucesso!!");

        lblTitulo.setText("Titulo:");

        lblAutor.setText("Autor:");

        lblPaginas.setText("Páginas:");

        lblAno.setText("Ano:");

        lblEdicao.setText("Edição:");

        btnAtualiza.setText("Atualizar");
        btnAtualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAtualizaLayout = new javax.swing.GroupLayout(panelAtualiza);
        panelAtualiza.setLayout(panelAtualizaLayout);
        panelAtualizaLayout.setHorizontalGroup(
            panelAtualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtualizaLayout.createSequentialGroup()
                .addGroup(panelAtualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAtualizaLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblTdsLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAtualizaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelAtualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAtualizaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panelAtualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAtualizaLayout.createSequentialGroup()
                                .addGroup(panelAtualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPaginas)
                                    .addComponent(lblAno))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelAtualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAtualizaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(panelAtualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAtualiza)
                                    .addGroup(panelAtualizaLayout.createSequentialGroup()
                                        .addGroup(panelAtualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panelAtualizaLayout.createSequentialGroup()
                                                .addComponent(lblTitulo)
                                                .addGap(5, 5, 5))
                                            .addComponent(lblAutor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelAtualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelAtualizaLayout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(lblSelecione))
                                            .addGroup(panelAtualizaLayout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addGroup(panelAtualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                    .addGroup(panelAtualizaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblEdicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAtualizaLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblAtualizado, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelAtualizaLayout.setVerticalGroup(
            panelAtualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtualizaLayout.createSequentialGroup()
                .addGroup(panelAtualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAtualizaLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(panelAtualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitulo)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelAtualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAutor))
                        .addGap(14, 14, 14)
                        .addGroup(panelAtualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPaginas)
                            .addComponent(txtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(panelAtualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAno)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelAtualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblAtualizado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtualiza))
                    .addGroup(panelAtualizaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelAtualizaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTdsLivros)
                            .addComponent(lblSelecione))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelAtualiza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAtualiza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        lblSelecione.setVisible(false);
        lblAtualizado.setVisible(false);

        this.setVisible(false);
        TelaPrincipal.getInstance(TelaPrincipal.current_cred).setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnAtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableLivro.getSelectedRow();
        if (selectedRow != -1) {
            Long selectedId = (Long) tableLivro.getValueAt(selectedRow, 0);
            updateBook(selectedId);

            txtTitulo.setText("");
            txtAutor.setText("");
            txtPaginas.setText("");
            txtAno.setText("");
            txtEdicao.setText("");
            lblSelecione.setVisible(false);
            updateBookTable();
        } else {
            System.out.println("Selecione um livro antes de atualizar.");
            lblSelecione.setVisible(true);
        }
    }//GEN-LAST:event_btnAtualizaActionPerformed

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
                    book.getEdition(),
                };
                model.addRow(rowData);
            }

            // Adiciona um listener para a tabela
            tableLivro.getSelectionModel().addListSelectionListener(e -> {
                int selectedRow = tableLivro.getSelectedRow();
                if (selectedRow != -1) {
                    // Obtém os dados da linha selecionada, incluindo o ID
                    Long selectedId = (Long) tableLivro.getValueAt(selectedRow, 0);
                    String selectedTitle = (String) tableLivro.getValueAt(selectedRow, 1);
                    String selectedAuthor = (String) tableLivro.getValueAt(selectedRow, 2);
                    String selectedPages = String.valueOf(tableLivro.getValueAt(selectedRow, 3));
                    String selectedYear = String.valueOf(tableLivro.getValueAt(selectedRow, 4));
                    String selectedEdition = String.valueOf(tableLivro.getValueAt(selectedRow, 5));
                   

                    // Define os dados nos campos de texto
                    txtTitulo.setText(selectedTitle);
                    txtAutor.setText(selectedAuthor);
                    txtPaginas.setText(selectedPages);
                    txtAno.setText(selectedYear);
                    txtEdicao.setText(selectedEdition);

                    lblSelecione.setVisible(false);
                    lblAtualizado.setVisible(false);
                }
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void updateBook(Long selectedId) {
        try {
            if (selectedId != null) {

                String novoTitulo = txtTitulo.getText();
                String novoAutor = txtAutor.getText();
                Short novasPaginas = Short.parseShort(txtPaginas.getText());
                Short novoAno = Short.parseShort(txtAno.getText());
                Byte novaEdicao = Byte.parseByte(txtEdicao.getText());
                // Recupera o livro pelo ID do banco de dados
                BookDao bookDao = new BookDao();
                Book livroAtualizar = bookDao.findById(selectedId);

                if (livroAtualizar != null) {
                    // Define os novos valores
                    livroAtualizar.setTitle(novoTitulo);
                    livroAtualizar.setAuthors(novoAutor);
                    livroAtualizar.setPages(novasPaginas);
                    livroAtualizar.setYear(novoAno);
                    livroAtualizar.setEdition(novaEdicao);

                    // Atualiza o livro no banco de dados
                    bookDao.saveOrUpdate(livroAtualizar);

                    // Atualiza a tabela na interface gráfica
                    updateBookTable();

                    // Exibe mensagem de sucesso
                    lblSelecione.setVisible(false);
                    lblAtualizado.setVisible(true);
                } else {
                    System.out.println("Livro não encontrado para atualização.");
                }
            } else {
                System.out.println("Selecione um livro antes de atualizar.");
                lblSelecione.setVisible(true);
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter valores: " + e.getMessage());
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
            java.util.logging.Logger.getLogger(AtualizaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizaLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualiza;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblAtualizado;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblEdicao;
    private javax.swing.JLabel lblPaginas;
    private javax.swing.JLabel lblSelecione;
    private javax.swing.JLabel lblTdsLivros;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelAtualiza;
    private javax.swing.JTable tableLivro;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEdicao;
    private javax.swing.JTextField txtPaginas;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}