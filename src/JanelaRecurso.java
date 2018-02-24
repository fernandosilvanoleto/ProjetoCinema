import java.util.ArrayList;
import javax.swing.JOptionPane;

public class JanelaRecurso extends javax.swing.JFrame {

    ArrayList<Recurso> recs;
    Recurso r;
    
    public JanelaRecurso(ArrayList<Recurso> recs) {
        initComponents();
        this.recs = recs;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfCodigo = new javax.swing.JTextField();
        tfAno = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rbFilme = new javax.swing.JRadioButton();
        rbRevista = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        tfGenero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfClassificacao = new javax.swing.JTextField();
        bCadastrarFilme = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfMes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfEdicao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfCategoria = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfEditora = new javax.swing.JTextField();
        bCadastrarRevista = new javax.swing.JButton();
        bPesquisarRecurso = new javax.swing.JButton();
        bAlterarRecurso = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();

        jLabel1.setText("Nome:");

        jLabel2.setText("Código:");

        jLabel3.setText("Ano:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        buttonGroup1.add(rbFilme);
        rbFilme.setText("Filme");
        rbFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFilmeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbRevista);
        rbRevista.setText("Revista");
        rbRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRevistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(rbFilme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbRevista)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFilme)
                    .addComponent(rbRevista))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setText("Gênero:");

        jLabel5.setText("Classificação:");

        bCadastrarFilme.setText("Cadastrar Filme");
        bCadastrarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarFilmeActionPerformed(evt);
            }
        });

        jLabel6.setText("Mês:");

        jLabel7.setText("Edição:");

        jLabel8.setText("Categoria:");

        jLabel9.setText("Editora:");

        bCadastrarRevista.setText("Cadastrar Revista");
        bCadastrarRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarRevistaActionPerformed(evt);
            }
        });

        bPesquisarRecurso.setText("Pesquisar");
        bPesquisarRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarRecursoActionPerformed(evt);
            }
        });

        bAlterarRecurso.setText("Alterar");
        bAlterarRecurso.setEnabled(false);
        bAlterarRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarRecursoActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bExcluir.setText("Excluir");
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(tfGenero)
                                .addComponent(jLabel5)
                                .addComponent(tfClassificacao, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(bCadastrarFilme)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfMes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfCategoria)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(tfEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(bCadastrarRevista)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bPesquisarRecurso)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(bAlterarRecurso)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bExcluir)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bCancelar)
                                    .addGap(11, 11, 11))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPesquisarRecurso)
                    .addComponent(bAlterarRecurso)
                    .addComponent(bCancelar)
                    .addComponent(bExcluir))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(bCadastrarFilme))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bCadastrarRevista)))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCadastrarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarFilmeActionPerformed
        cadastraRecurso();
    }//GEN-LAST:event_bCadastrarFilmeActionPerformed

    private void bCadastrarRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarRevistaActionPerformed
        cadastraRecurso();
    }//GEN-LAST:event_bCadastrarRevistaActionPerformed

    private void rbFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFilmeActionPerformed
            tfMes.setEnabled(false);
            tfEdicao.setEnabled(false);
            tfCategoria.setEnabled(false);
            tfEditora.setEnabled(false);
            bCadastrarRevista.setEnabled(false);
            tfGenero.setEnabled(true);
            tfClassificacao.setEnabled(true);
            bCadastrarFilme.setEnabled(true);
    }//GEN-LAST:event_rbFilmeActionPerformed

    private void rbRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRevistaActionPerformed
            tfGenero.setEnabled(false);
            tfClassificacao.setEnabled(false);
            bCadastrarFilme.setEnabled(false);
            tfMes.setEnabled(true);
            tfEdicao.setEnabled(true);
            tfCategoria.setEnabled(true);
            tfEditora.setEnabled(true);
            bCadastrarRevista.setEnabled(true);
    }//GEN-LAST:event_rbRevistaActionPerformed

    private void bPesquisarRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarRecursoActionPerformed
        pesquisarRecurso();
    }//GEN-LAST:event_bPesquisarRecursoActionPerformed

    private void bAlterarRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarRecursoActionPerformed
        alterarRecurso();
    }//GEN-LAST:event_bAlterarRecursoActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        limpar();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
        excluirRecurso();
    }//GEN-LAST:event_bExcluirActionPerformed

    public void cadastraRecurso()
    {
        String nome = tfNome.getText();
        int codRecurso = Integer.parseInt(tfCodigo.getText());
        int ano = Integer.parseInt(tfAno.getText());
        if(rbFilme.isSelected())
        {
            String genero = tfGenero.getText();
            String classificacao = tfClassificacao.getText();
            Recurso f = new Filme(nome, codRecurso, ano, genero, classificacao);
            recs.add(f); 
        }
        else
        {
            String mes = tfMes.getText();
            int edicao = Integer.parseInt(tfEdicao.getText());
            String editora = tfEditora.getText();
            String categoria = tfCategoria.getText();
            Recurso r = new Revista(nome, codRecurso, ano, mes, categoria, editora, edicao);
            recs.add(r); 
        }   
        limpar();
    }
    
    public Recurso existeRecurso(int cod)
    {
        for (Recurso r : recs)
        {
           if(r.getCodRecurso() == cod)
           {
               return r;
           }
        }
        return null;
    }
    
    public void excluirRecurso(){
        recs.remove(r);
        limpar();
    }
    
    public void limpar()
    {
        tfNome.setText("");
        tfCodigo.setText("");
        tfAno.setText("");
        tfGenero.setText("");
        tfClassificacao.setText("");
        tfMes.setText("");
        tfEdicao.setText("");
        tfCategoria.setText("");
        tfEditora.setText("");
        bPesquisarRecurso.setEnabled(true);
        bAlterarRecurso.setEnabled(false);
    }
    
    public void pesquisarRecurso()
    {
       if(tfCodigo.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null, "O campo de código deve estar preenchido");
       }
       else
       {
           r = existeRecurso(Integer.parseInt(tfCodigo.getText()));
           if(r == null)
           {
               JOptionPane.showMessageDialog(null, "Recurso não cadastrado");
           }
           else
           {
               if(r instanceof Filme)
               {
                    tfNome.setText(r.getNome());
                    tfAno.setText(r.getAno()+"");
                    tfGenero.setText(((Filme)r).getGenero());
                    tfClassificacao.setText(((Filme)r).getClassific()); 
               }
               else
               {
                    tfNome.setText(r.getNome());
                    tfAno.setText(r.getAno()+"");
                    tfMes.setText(((Revista)r).getMes());
                    tfEdicao.setText(((Revista)r).getNumEdicao()+"");
                    tfCategoria.setText(((Revista)r).getCategoria()); 
                    tfEditora.setText(((Revista)r).getEditora());
               }
           }
       }
       bAlterarRecurso.setEnabled(true);
       bCadastrarFilme.setEnabled(false);
       bCadastrarRevista.setEnabled(false);
    }
    
    public void alterarRecurso()
{
    r = existeRecurso(Integer.parseInt(tfCodigo.getText()));
    r.setNome(tfNome.getText());
    r.setAno(Integer.parseInt(tfAno.getText()));
    if(r instanceof Filme)
    {
        ((Filme)r).setGenero(tfGenero.getText());
        ((Filme)r).setClassific(tfClassificacao.getText());
    }
    else
    {
        ((Revista)r).setMes(tfMes.getText());
        ((Revista)r).setNumEdicao(Integer.parseInt(tfEdicao.getText()));
        ((Revista)r).setCategoria(tfCategoria.getText());
        ((Revista)r).setEditora(tfEditora.getText());   
    }
    
    limpar();    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlterarRecurso;
    private javax.swing.JButton bCadastrarFilme;
    private javax.swing.JButton bCadastrarRevista;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bPesquisarRecurso;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rbFilme;
    private javax.swing.JRadioButton rbRevista;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfCategoria;
    private javax.swing.JTextField tfClassificacao;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfEdicao;
    private javax.swing.JTextField tfEditora;
    private javax.swing.JTextField tfGenero;
    private javax.swing.JTextField tfMes;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
