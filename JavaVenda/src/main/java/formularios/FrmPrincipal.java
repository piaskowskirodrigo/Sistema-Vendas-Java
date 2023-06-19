
package formularios;

import classes.Dados;

public class FrmPrincipal extends javax.swing.JFrame {
private Dados msDados;
    
    public void setDados(Dados msdDados){
        this.msDados = msdDados;
    }


    public FrmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnDesk = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mnuArquivoClientes = new javax.swing.JMenuItem();
        mnuArquivoProdutos = new javax.swing.JMenuItem();
        mnuArquivoUsuario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuArquivotSenha = new javax.swing.JMenuItem();
        mnuArquivotUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuArquivoSair = new javax.swing.JMenuItem();
        mnuMovimentos = new javax.swing.JMenu();
        mnuMovimentosNovaVenda = new javax.swing.JMenuItem();
        mnuMovimentosRelatoriovenda = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        mnuAjudaSobre = new javax.swing.JMenuItem();
        mnuAjudaAjuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema:");

        dpnDesk.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout dpnDeskLayout = new javax.swing.GroupLayout(dpnDesk);
        dpnDesk.setLayout(dpnDeskLayout);
        dpnDeskLayout.setHorizontalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );
        dpnDeskLayout.setVerticalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );

        mnuArquivo.setText("Arquivo");

        mnuArquivoClientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuArquivoClientes.setText("Clientes");
        mnuArquivo.add(mnuArquivoClientes);

        mnuArquivoProdutos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuArquivoProdutos.setText("Produtos");
        mnuArquivo.add(mnuArquivoProdutos);

        mnuArquivoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuArquivoUsuario.setText("Usuarios");
        mnuArquivoUsuario.setToolTipText("");
        mnuArquivoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoUsuarioActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoUsuario);
        mnuArquivo.add(jSeparator1);

        mnuArquivotSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuArquivotSenha.setText("Trocar Senha");
        mnuArquivo.add(mnuArquivotSenha);

        mnuArquivotUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuArquivotUsuario.setText("Trocar Usuario");
        mnuArquivo.add(mnuArquivotUsuario);
        mnuArquivo.add(jSeparator2);

        mnuArquivoSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuArquivoSair.setText("Sair");
        mnuArquivo.add(mnuArquivoSair);

        jMenuBar1.add(mnuArquivo);

        mnuMovimentos.setText("Movimentos");

        mnuMovimentosNovaVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuMovimentosNovaVenda.setText("Nova Venda");
        mnuMovimentos.add(mnuMovimentosNovaVenda);

        mnuMovimentosRelatoriovenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuMovimentosRelatoriovenda.setText("Relatorio Venda");
        mnuMovimentos.add(mnuMovimentosRelatoriovenda);

        jMenuBar1.add(mnuMovimentos);

        mnuAjuda.setText("Ajuda");

        mnuAjudaSobre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuAjudaSobre.setText("Sobre");
        mnuAjuda.add(mnuAjudaSobre);

        mnuAjudaAjuda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuAjudaAjuda.setText("Ajuda");
        mnuAjuda.add(mnuAjudaAjuda);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArquivoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoUsuarioActionPerformed
        frmUsuarios mUsuarios = new frmUsuarios();
        mUsuarios.setDados(msDados);
        dpnDesk.add(mUsuarios);
        mUsuarios.show();
  
    }//GEN-LAST:event_mnuArquivoUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnDesk;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenuItem mnuAjudaAjuda;
    private javax.swing.JMenuItem mnuAjudaSobre;
    private javax.swing.JMenu mnuArquivo;
    private javax.swing.JMenuItem mnuArquivoClientes;
    private javax.swing.JMenuItem mnuArquivoProdutos;
    private javax.swing.JMenuItem mnuArquivoSair;
    private javax.swing.JMenuItem mnuArquivoUsuario;
    private javax.swing.JMenuItem mnuArquivotSenha;
    private javax.swing.JMenuItem mnuArquivotUsuario;
    private javax.swing.JMenu mnuMovimentos;
    private javax.swing.JMenuItem mnuMovimentosNovaVenda;
    private javax.swing.JMenuItem mnuMovimentosRelatoriovenda;
    // End of variables declaration//GEN-END:variables
}
