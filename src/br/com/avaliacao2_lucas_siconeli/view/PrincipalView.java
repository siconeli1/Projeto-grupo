package br.com.avaliacao2_lucas_siconeli.view;

import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import br.com.avaliacao2_lucas_siconeli.dto.FuncionarioDTO;

public class PrincipalView extends javax.swing.JFrame {

    
    
    public PrincipalView(FuncionarioDTO funcionarioDTO) {
        initComponents();
        this.setLocationRelativeTo(null);
        if(funcionarioDTO.getTipo_fun().equalsIgnoreCase("Comum")){
            itemMenuFuncionario.setVisible(false);
        }
    }

//    public PrincipalView() {
//        initComponents();
//        this.setLocationRelativeTo(null);
//    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon imageicon = new ImageIcon(getClass().getResource("imagens/tela_inicial.jpg"));
        Image image = imageicon.getImage();
        desktopPane = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics graphics){
                graphics.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        menuBar = new javax.swing.JMenuBar();
        menuCadastrar = new javax.swing.JMenu();
        itemMenuProfessor = new javax.swing.JMenuItem();
        itemMenuCurso = new javax.swing.JMenuItem();
        itemMenuAluno = new javax.swing.JMenuItem();
        itemMenuVenda = new javax.swing.JMenuItem();
        itemMenuFuncionario = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuCadastrar.setMnemonic('f');
        menuCadastrar.setText("Cadastrar");
        menuCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarActionPerformed(evt);
            }
        });

        itemMenuProfessor.setMnemonic('o');
        itemMenuProfessor.setText("Professor");
        itemMenuProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuProfessorActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemMenuProfessor);

        itemMenuCurso.setMnemonic('x');
        itemMenuCurso.setText("Curso");
        itemMenuCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCursoActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemMenuCurso);

        itemMenuAluno.setText("Aluno");
        itemMenuAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuAlunoActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemMenuAluno);

        itemMenuVenda.setText("Venda");
        itemMenuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVendaActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemMenuVenda);

        itemMenuFuncionario.setText("Funcionário");
        itemMenuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuFuncionarioActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemMenuFuncionario);

        menuBar.add(menuCadastrar);

        menuSair.setMnemonic('h');
        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        menuBar.add(menuSair);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1233, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCursoActionPerformed
        abreCursoVIEW();        
    }//GEN-LAST:event_itemMenuCursoActionPerformed

    private void itemMenuProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuProfessorActionPerformed
        abreProfessorVIEW();
    }//GEN-LAST:event_itemMenuProfessorActionPerformed

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        sair();        // TODO add your handling code here:
    }//GEN-LAST:event_menuSairMouseClicked

    private void menuCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadastrarActionPerformed

    private void itemMenuAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuAlunoActionPerformed
        abreAlunoVIEW();
        // TODO add your handling code here:
    }//GEN-LAST:event_itemMenuAlunoActionPerformed

    private void itemMenuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVendaActionPerformed
        abreVendaVIEW();
    }//GEN-LAST:event_itemMenuVendaActionPerformed

    private void itemMenuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuFuncionarioActionPerformed
        abreFuncionarioVIEW();
    }//GEN-LAST:event_itemMenuFuncionarioActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
////        <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
////        </editor-fold>
////        </editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PrincipalView().setVisible(true);
//            }
//        });
//    }
//    

private void abreCursoVIEW() {
        CursoVIEW view = new CursoVIEW();
        desktopPane.add(view);
        view.setVisible(true);
        view.setPosicao(); // Método para centralizar o JInternalFrame
    }

    private void abreAlunoVIEW() {
        AlunoVIEW view = new AlunoVIEW();
        desktopPane.add(view);
        view.setVisible(true);
        view.setPosicao();
    }

    private void abreFuncionarioVIEW(){
    FuncionarioVIEW funcionarioVIEW = new FuncionarioVIEW();
    this.desktopPane.add(funcionarioVIEW);
    funcionarioVIEW.setVisible(true);
    funcionarioVIEW.setPosicao();
}

    private void sair() {
        Object[] options = {"Sair", "Cancelar"};
        if (JOptionPane.showOptionDialog(null, "Deseja sair do sistema?", "Sair",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]) == 0) {
            System.exit(0);
        }
    }
    
    private void abreVendaVIEW(){
   VendaVIEW vendaVIEW = new VendaVIEW();
   this.desktopPane.add(vendaVIEW);
   vendaVIEW.setVisible(true);
   vendaVIEW.setPosicao();
}
    private void abreProfessorVIEW(){
    ProfessorVIEW professorVIEW = new ProfessorVIEW();
    this.desktopPane.add(professorVIEW);
    professorVIEW.setVisible(true);
    professorVIEW.setPosicao();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem itemMenuAluno;
    private javax.swing.JMenuItem itemMenuCurso;
    private javax.swing.JMenuItem itemMenuFuncionario;
    private javax.swing.JMenuItem itemMenuProfessor;
    private javax.swing.JMenuItem itemMenuVenda;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables

}
