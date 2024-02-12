/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.Usuario;

/**
 *
 * @author Guilherme
 */
public class TelaPrincipalUsuarios extends javax.swing.JFrame {
    private Usuario usuario;
    /**
     * Creates new form TelaPrincipalUsuarios
     */
    public TelaPrincipalUsuarios(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelUsuariosMenu = new javax.swing.JPanel();
        jLabelUsuariosMenu = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuUsuariosLivraria = new javax.swing.JMenu();
        jMenuItemUsuariosVizualizarLivros = new javax.swing.JMenuItem();
        jMenuUsuariosCadastrar = new javax.swing.JMenu();
        jMenuItemUsuariosCadastrarLivros = new javax.swing.JMenuItem();
        jMenuUsuariosSair = new javax.swing.JMenu();
        jMenuItemSairUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Livraria");
        setResizable(false);

        jPanelUsuariosMenu.setBackground(new java.awt.Color(102, 102, 102));
        jPanelUsuariosMenu.setPreferredSize(new java.awt.Dimension(780, 400));

        javax.swing.GroupLayout jPanelUsuariosMenuLayout = new javax.swing.GroupLayout(jPanelUsuariosMenu);
        jPanelUsuariosMenu.setLayout(jPanelUsuariosMenuLayout);
        jPanelUsuariosMenuLayout.setHorizontalGroup(
            jPanelUsuariosMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanelUsuariosMenuLayout.setVerticalGroup(
            jPanelUsuariosMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );

        jLabelUsuariosMenu.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabelUsuariosMenu.setText("Menu Usuário");

        jMenuUsuariosLivraria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-livros-64.png"))); // NOI18N
        jMenuUsuariosLivraria.setText("Livraria");
        jMenuUsuariosLivraria.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItemUsuariosVizualizarLivros.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemUsuariosVizualizarLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha.png"))); // NOI18N
        jMenuItemUsuariosVizualizarLivros.setText("Visualizar Livros");
        jMenuItemUsuariosVizualizarLivros.setToolTipText("");
        jMenuItemUsuariosVizualizarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosVizualizarLivrosActionPerformed(evt);
            }
        });
        jMenuUsuariosLivraria.add(jMenuItemUsuariosVizualizarLivros);

        jMenuBar1.add(jMenuUsuariosLivraria);

        jMenuUsuariosCadastrar.setText("Cadastrar");
        jMenuUsuariosCadastrar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItemUsuariosCadastrarLivros.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemUsuariosCadastrarLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha.png"))); // NOI18N
        jMenuItemUsuariosCadastrarLivros.setText("Livros");
        jMenuItemUsuariosCadastrarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosCadastrarLivrosActionPerformed(evt);
            }
        });
        jMenuUsuariosCadastrar.add(jMenuItemUsuariosCadastrarLivros);

        jMenuBar1.add(jMenuUsuariosCadastrar);

        jMenuUsuariosSair.setText("Sair");
        jMenuUsuariosSair.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jMenuItemSairUsuario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItemSairUsuario.setText("Sair");
        jMenuItemSairUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairUsuarioActionPerformed(evt);
            }
        });
        jMenuUsuariosSair.add(jMenuItemSairUsuario);

        jMenuBar1.add(jMenuUsuariosSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabelUsuariosMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jPanelUsuariosMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelUsuariosMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelUsuariosMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemUsuariosCadastrarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosCadastrarLivrosActionPerformed

    dispose();
    TelaCadastroLivros telaCadastroLivros = new TelaCadastroLivros(usuario);

    telaCadastroLivros.setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuariosCadastrarLivrosActionPerformed

    private void jMenuItemSairUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairUsuarioActionPerformed
        
    dispose();
    Login login = new Login();

    login.setVisible(true);
    }//GEN-LAST:event_jMenuItemSairUsuarioActionPerformed

    private void jMenuItemUsuariosVizualizarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosVizualizarLivrosActionPerformed
        // TODO add your handling code here:
        TelaVisualizadorDeLivros telaVisualizadorDeLivros = new TelaVisualizadorDeLivros();
        telaVisualizadorDeLivros.setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuariosVizualizarLivrosActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TelaPrincipalUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaPrincipalUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaPrincipalUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaPrincipalUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TelaPrincipalUsuarios().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelUsuariosMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemSairUsuario;
    private javax.swing.JMenuItem jMenuItemUsuariosCadastrarLivros;
    private javax.swing.JMenuItem jMenuItemUsuariosVizualizarLivros;
    private javax.swing.JMenu jMenuUsuariosCadastrar;
    private javax.swing.JMenu jMenuUsuariosLivraria;
    private javax.swing.JMenu jMenuUsuariosSair;
    private javax.swing.JPanel jPanelUsuariosMenu;
    // End of variables declaration//GEN-END:variables
}