package br.com.avaliacao2_lucas_siconeli.view;

import br.com.avaliacao2_lucas_siconeli.ctr.VendaCTR;
import br.com.avaliacao2_lucas_siconeli.dto.VendaDTO;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import br.com.avaliacao2_lucas_siconeli.dto.CursoDTO;   
import br.com.avaliacao2_lucas_siconeli.ctr.CursoCTR;   
import br.com.avaliacao2_lucas_siconeli.dto.AlunoDTO;   
import br.com.avaliacao2_lucas_siconeli.ctr.AlunoCTR;   
import java.util.Date;



public class VendaVIEW extends javax.swing.JInternalFrame {
    
    VendaCTR  vendaCTR  = new VendaCTR();
    VendaDTO  vendaDTO  = new VendaDTO();
    AlunoDTO  alunoDTO  = new AlunoDTO();
    AlunoCTR  alunoCTR  = new AlunoCTR();
    CursoCTR  cursoCTR  = new CursoCTR();   
    CursoDTO  cursoDTO  = new CursoDTO();

    ResultSet rs;
    DefaultTableModel modelo_jtl_consultar_alu;
    DefaultTableModel modelo_jtl_consultar_cur;
    DefaultTableModel modelo_jtl_consultar_cur_selecionado;
    
    
    public VendaVIEW() {
        initComponents();
        liberaCampos(false);
        liberaBotoes(true, false, false, true);
        modelo_jtl_consultar_alu = (DefaultTableModel) jtl_consultar_alu.getModel();
        modelo_jtl_consultar_cur = (DefaultTableModel) jtl_consultar_cur.getModel();
        modelo_jtl_consultar_cur_selecionado = (DefaultTableModel) jtl_consultar_cur_selecionado.getModel();
}
    
    public void setPosicao(){
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pesquisa_nome_alu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtl_consultar_alu = new javax.swing.JTable();
        btnPesquisarAlu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TotalVenda = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pesquisa_nome_cur = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtl_consultar_cur_selecionado = new javax.swing.JTable();
        btnProAdd = new javax.swing.JButton();
        btnProRem = new javax.swing.JButton();
        btnPesquisarPro = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtl_consultar_cur = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Dados");

        jLabel2.setText("Cliente:");

        jtl_consultar_alu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtl_consultar_alu);
        if (jtl_consultar_alu.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_alu.getColumnModel().getColumn(0).setResizable(false);
            jtl_consultar_alu.getColumnModel().getColumn(1).setResizable(false);
        }

        btnPesquisarAlu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao2_lucas_siconeli/view/imagens/pesquisar.png"))); // NOI18N
        btnPesquisarAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarAluActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Total Venda:");

        TotalVenda.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        TotalVenda.setForeground(new java.awt.Color(102, 255, 0));
        TotalVenda.setText("0.00");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Produtos");

        jLabel4.setText("Descrição:");

        jtl_consultar_cur_selecionado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Valor", "QTD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtl_consultar_cur_selecionado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtl_consultar_cur_selecionadoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jtl_consultar_cur_selecionado);
        if (jtl_consultar_cur_selecionado.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_cur_selecionado.getColumnModel().getColumn(0).setResizable(false);
            jtl_consultar_cur_selecionado.getColumnModel().getColumn(1).setResizable(false);
            jtl_consultar_cur_selecionado.getColumnModel().getColumn(2).setResizable(false);
        }

        btnProAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao2_lucas_siconeli/view/imagens/prod_add.png"))); // NOI18N
        btnProAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProAddActionPerformed(evt);
            }
        });

        btnProRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao2_lucas_siconeli/view/imagens/prod_rem.png"))); // NOI18N
        btnProRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProRemActionPerformed(evt);
            }
        });

        btnPesquisarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao2_lucas_siconeli/view/imagens/pesquisar.png"))); // NOI18N
        btnPesquisarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarProActionPerformed(evt);
            }
        });

        jtl_consultar_cur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jtl_consultar_cur);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pesquisa_nome_cur)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarPro))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(btnProAdd)
                        .addGap(63, 63, 63)
                        .addComponent(btnProRem))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(pesquisa_nome_cur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisarPro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnProRem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnProAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao2_lucas_siconeli/view/imagens/novo.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao2_lucas_siconeli/view/imagens/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao2_lucas_siconeli/view/imagens/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao2_lucas_siconeli/view/imagens/sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pesquisa_nome_alu)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnPesquisarAlu))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TotalVenda))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addGap(59, 59, 59)
                        .addComponent(btnSalvar)
                        .addGap(45, 45, 45)
                        .addComponent(btnCancelar)
                        .addGap(47, 47, 47)
                        .addComponent(btnSair)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(pesquisa_nome_alu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisarAlu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TotalVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 56, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Vendas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(506, 506, 506)
                .addComponent(jLabel6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarAluActionPerformed
        preencheTabelaAluno(pesquisa_nome_alu.getText());
    }//GEN-LAST:event_btnPesquisarAluActionPerformed

    private void btnPesquisarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarProActionPerformed
    preencheTabelaCurso(pesquisa_nome_cur.getText());
    }//GEN-LAST:event_btnPesquisarProActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        liberaCampos(true);
        liberaBotoes(false, true, true, true);       
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        if(verificaPreenchimento()){
            gravar();
            limpaCampos();
            liberaCampos(false);
            liberaBotoes(true, false, false, true);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaCampos();
        liberaCampos(false);
        modelo_jtl_consultar_alu.setNumRows(0);
        modelo_jtl_consultar_cur.setNumRows(0);
        liberaBotoes(true, false, false, true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnProAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProAddActionPerformed

        adicionaCursoSelecionado(
    Integer.parseInt(String.valueOf(jtl_consultar_cur.getValueAt(jtl_consultar_cur.getSelectedRow(), 0))),
    String.valueOf(jtl_consultar_cur.getValueAt(jtl_consultar_cur.getSelectedRow(), 1)),
    Double.parseDouble(String.valueOf(jtl_consultar_cur.getValueAt(jtl_consultar_cur.getSelectedRow(), 2)))
);


    }//GEN-LAST:event_btnProAddActionPerformed

    private void btnProRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProRemActionPerformed
        removeCursoSelecionado(jtl_consultar_cur_selecionado.getSelectedRow());
    }//GEN-LAST:event_btnProRemActionPerformed

    private void jtl_consultar_cur_selecionadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtl_consultar_cur_selecionadoKeyReleased
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            calculaTotalVenda();
        }
    }//GEN-LAST:event_jtl_consultar_cur_selecionadoKeyReleased

    /* -------- GRAVAR -------- */
private void gravar() {
    vendaDTO.setDat_vend(new Date());
    vendaDTO.setVal_vend(Double.parseDouble(TotalVenda.getText()));
    alunoDTO.setId_alu(Integer.parseInt(String.valueOf(
        jtl_consultar_alu.getValueAt(jtl_consultar_alu.getSelectedRow(), 0))));
    
    JOptionPane.showMessageDialog(null,
        vendaCTR.inserirVenda(vendaDTO, alunoDTO, jtl_consultar_cur_selecionado)
    );
}

private void preencheTabelaAluno(String nome_alu){
    try{
        modelo_jtl_consultar_alu.setNumRows(0);
        
        alunoDTO.setNome_alu(nome_alu);
        rs = alunoCTR.consultarAluno(alunoDTO, 1);
        
        while(rs.next()){
            modelo_jtl_consultar_alu.addRow(new Object[]{
                rs.getString("id_alu"),
                rs.getString("nome_alu")
            });
        }
    }
    catch(Exception erTab){
        System.out.println("Erro SQL: "+erTab);
    }
}
    
    private void preencheTabelaCurso(String nome_cur){
    try{
        modelo_jtl_consultar_cur.setNumRows(0);
        cursoDTO.setNome_cur(nome_cur);
        rs = cursoCTR.consultarCurso(cursoDTO, 1);
        
        while(rs.next()){
            modelo_jtl_consultar_cur.addRow(new Object[]{
                rs.getString("id_cur"),
                rs.getString("nome_cur"),
            });
        }
    }
    catch(Exception erTab){
        System.out.println("Erro SQL: "+ erTab);
    }
}   
    
   private void calculaTotalVenda() {
    try {
        double total = 0;
        for (int cont = 0; cont < jtl_consultar_cur_selecionado.getRowCount(); cont++) {
            total += (Double.parseDouble(String.valueOf(
                         jtl_consultar_cur_selecionado.getValueAt(cont, 2))) *
                      Integer.parseInt(String.valueOf(
                         jtl_consultar_cur_selecionado.getValueAt(cont, 3))));
        }
        TotalVenda.setText(String.valueOf(total));
    } catch (Exception erTab) {
        System.out.println("Erro SQL: " + erTab);
    }
}
    
    private void adicionaCursoSelecionado(int id_cur, String nome_cur, double p_custo_cur){
   try{
       modelo_jtl_consultar_cur_selecionado.addRow(new Object[]{
        id_cur,
        nome_cur,
        p_custo_cur
    });
   }
   catch(Exception erTab){
       System.out.println("Erro SQL: "+erTab);
   }
}
    
    private void removeCursoSelecionado(int linha_selecionada){
   try{
       if(linha_selecionada >= 0){
           modelo_jtl_consultar_cur_selecionado.removeRow(linha_selecionada);
           calculaTotalVenda();
       }
   }
   catch(Exception erTab){
       System.out.println("Erro SQL: "+erTab);
   }
}
    private void liberaCampos(boolean a){
        pesquisa_nome_alu.setEnabled(a);
        btnPesquisarAlu.setEnabled(a);
        jtl_consultar_alu.setEnabled(a);
        pesquisa_nome_cur.setEnabled(a);
        btnPesquisarPro.setEnabled(a);
        jtl_consultar_cur.setEnabled(a);
        btnProAdd.setEnabled(a);
        btnProRem.setEnabled(a);
        jtl_consultar_cur_selecionado.setEnabled(a);
        TotalVenda.setText("0.00");
}
    
   private void limpaCampos(){
        pesquisa_nome_alu.setText("");
        modelo_jtl_consultar_alu.setNumRows(0);
        pesquisa_nome_cur.setText("");
        modelo_jtl_consultar_cur.setNumRows(0);
        modelo_jtl_consultar_cur_selecionado.setNumRows(0);
}
   
   private void liberaBotoes(boolean a, boolean b, boolean c, boolean d){
        btnNovo.setEnabled(a);
        btnSalvar.setEnabled(b);
        btnCancelar.setEnabled(c);
        btnSair.setEnabled(d);
}
   
   private boolean verificaPreenchimento() {
    if(jtl_consultar_alu.getSelectedRowCount() <= 0){
        JOptionPane.showMessageDialog(null, "Deve ser selecionado um aluno");
        jtl_consultar_alu.requestFocus();
        return false;
    }
    else{
        if(jtl_consultar_cur_selecionado.getRowCount() <= 0){
            JOptionPane.showMessageDialog(null, "É necessário adicionar pelo menos um curso no pedido");
            jtl_consultar_cur_selecionado.requestFocus();
            return false;
        }
        else{
            int verifica=0;
            for(int cont=0; cont<jtl_consultar_cur_selecionado.getRowCount(); cont++){
                if(String.valueOf(jtl_consultar_cur_selecionado.getValueAt(
                    cont, 3)).equalsIgnoreCase("null")){
                    verifica++;
                }
            }
            if(verifica > 0){
                JOptionPane.showMessageDialog(null,
                    "A quantidade de cada curso vendido deve ser informado");
                jtl_consultar_cur_selecionado.requestFocus();
                return false;
            }
            else{
                return true;
            }
        }
    }
}
     

     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TotalVenda;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisarAlu;
    private javax.swing.JButton btnPesquisarPro;
    private javax.swing.JButton btnProAdd;
    private javax.swing.JButton btnProRem;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jtl_consultar_alu;
    private javax.swing.JTable jtl_consultar_cur;
    private javax.swing.JTable jtl_consultar_cur_selecionado;
    private javax.swing.JTextField pesquisa_nome_alu;
    private javax.swing.JTextField pesquisa_nome_cur;
    // End of variables declaration//GEN-END:variables
}
