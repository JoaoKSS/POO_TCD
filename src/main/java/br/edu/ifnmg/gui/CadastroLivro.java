/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifnmg.gui;

import br.edu.ifnmg.book.Book;
import br.edu.ifnmg.book.BookDao;

/**
 *
 * @author joaok
 */
public class CadastroLivro extends javax.swing.JFrame {

    /**
     * Creates new form CadrastroUsuario
     */
    private static CadastroLivro instance;

    public CadastroLivro() {
        initComponents();
        lblIncorreto.setVisible(false);
        lblCadastrado.setVisible(false);
        // Centralização da janela  
        setLocationRelativeTo(null);
    }

    public static CadastroLivro getInstance() {
        if (instance == null) {
            instance = new CadastroLivro();
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        PanelCadrastroLivro = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblPage = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblEdition = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtPaginas = new javax.swing.JTextField();
        txtEdition = new javax.swing.JTextField();
        lblIncorreto = new javax.swing.JLabel();
        lblCadastrado = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        jMenuItem3.setText("jMenuItem3");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadrastro Livro");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblUsuario.setText("Titulo:");

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        lblSenha.setText("Autor:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblPage.setText("Paginas:");

        lblYear.setText("Ano de lançamento:");

        lblEdition.setText("Edição:");

        lblIncorreto.setForeground(new java.awt.Color(240, 0, 0));
        lblIncorreto.setText("Campos Indefinidos ou 0 Troque-os");

        lblCadastrado.setForeground(new java.awt.Color(0, 0, 255));
        lblCadastrado.setText("Livros Cadastrado com Sucesso!!");

        javax.swing.GroupLayout PanelCadrastroLivroLayout = new javax.swing.GroupLayout(PanelCadrastroLivro);
        PanelCadrastroLivro.setLayout(PanelCadrastroLivroLayout);
        PanelCadrastroLivroLayout.setHorizontalGroup(
            PanelCadrastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCadrastroLivroLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PanelCadrastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCadrastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelCadrastroLivroLayout.createSequentialGroup()
                            .addComponent(lblYear)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtYear, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                        .addGroup(PanelCadrastroLivroLayout.createSequentialGroup()
                            .addGroup(PanelCadrastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblUsuario)
                                .addComponent(lblPage)
                                .addComponent(lblSenha)
                                .addComponent(lblEdition))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(PanelCadrastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPaginas, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAutor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEdition, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))))
                    .addGroup(PanelCadrastroLivroLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(PanelCadrastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIncorreto)
                            .addComponent(lblCadastrado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(btnSalvar)))
                .addContainerGap())
        );
        PanelCadrastroLivroLayout.setVerticalGroup(
            PanelCadrastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCadrastroLivroLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelCadrastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCadrastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(PanelCadrastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPage)
                    .addComponent(txtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCadrastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYear)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(PanelCadrastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdition)
                    .addComponent(txtEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelCadrastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCadrastroLivroLayout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelCadrastroLivroLayout.createSequentialGroup()
                        .addComponent(lblIncorreto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCadastrado))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCadrastroLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCadrastroLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
//         TODO add your handling code here:
        Long book1Id = null;

        try {
            Book livro = new Book();
            livro.setId(null);
            livro.setTitle(txtTitulo.getText());
            livro.setAuthors(txtAutor.getText());
            livro.setPages(Short.valueOf(txtPaginas.getText()));
            livro.setYear(Short.valueOf(txtYear.getText()));
            livro.setEdition(Byte.valueOf(txtEdition.getText()));

            book1Id = new BookDao().saveOrUpdate(livro);
            livro.setId(book1Id);
            instance.setAlwaysOnTop(false);
            //JOptionPane.showMessageDialog(null, "Livro Cadastrado!!");
            System.out.println("Livro Cadastrado!!");
            System.out.println(livro.toString());
            lblIncorreto.setVisible(false);
            lblCadastrado.setVisible(true);
            this.setVisible(false);
            //TelaPrincipal.getInstance(TelaPrincipal.current_cred).setVisible(true);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            lblIncorreto.setVisible(true);
            lblCadastrado.setVisible(false);
        }   
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        txtTitulo.setText("");
        txtAutor.setText("");
        txtPaginas.setText("");
        txtYear.setText("");
        txtEdition.setText("");
        this.setVisible(false);
        //TelaPrincipal.getInstance(TelaPrincipal.current_cred).setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCadrastroLivro;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblCadastrado;
    private javax.swing.JLabel lblEdition;
    private javax.swing.JLabel lblIncorreto;
    private javax.swing.JLabel lblPage;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEdition;
    private javax.swing.JTextField txtPaginas;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
