
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JanelaEmprestimo extends javax.swing.JFrame {
    ArrayList<Usuario> users;
    ArrayList<Recurso> recs;
    ArrayList<Emprestimo> emps;
    ArrayList<itemRecurso> itens;
    Emprestimo e;
    Usuario u;
    Recurso r;
    DefaultTableModel modelo;

    public JanelaEmprestimo(ArrayList<Usuario> users, ArrayList<Recurso> recs, ArrayList<Emprestimo> emps) {
        initComponents();
        this.users = users;
        this.recs = recs;
        this.emps = emps;
        modelo = (DefaultTableModel) tbRecursos.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfCodigoEmp = new javax.swing.JTextField();
        tfDataEmp = new javax.swing.JTextField();
        pRecursos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbRecursos = new javax.swing.JTable();
        cbRecursos = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfQtdRec = new javax.swing.JTextPane();
        bInserirRecurso = new javax.swing.JButton();
        bRemoverRecurso = new javax.swing.JButton();
        bConcluirRecurso = new javax.swing.JButton();
        bIncluir = new javax.swing.JButton();
        bPesquisar = new javax.swing.JButton();
        bAlterar = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        cbUsuarios = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfDataLimite = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Código do empréstimo:");

        jLabel2.setText("Data do empréstimo:");

        pRecursos.setBorder(javax.swing.BorderFactory.createTitledBorder("Recursos"));

        tbRecursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Ano", "Quantidade"
            }
        ));
        tbRecursos.setEnabled(false);
        jScrollPane3.setViewportView(tbRecursos);

        cbRecursos.setEnabled(false);
        cbRecursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRecursosActionPerformed(evt);
            }
        });

        jLabel5.setText("Adicionar recurso:");

        jLabel3.setText("Quantidade:");

        tfQtdRec.setBorder(null);
        tfQtdRec.setEnabled(false);
        jScrollPane1.setViewportView(tfQtdRec);

        bInserirRecurso.setText("Inserir");
        bInserirRecurso.setEnabled(false);
        bInserirRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInserirRecursoActionPerformed(evt);
            }
        });

        bRemoverRecurso.setText("Remover");
        bRemoverRecurso.setEnabled(false);
        bRemoverRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoverRecursoActionPerformed(evt);
            }
        });

        bConcluirRecurso.setText("Concluir");
        bConcluirRecurso.setEnabled(false);
        bConcluirRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConcluirRecursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pRecursosLayout = new javax.swing.GroupLayout(pRecursos);
        pRecursos.setLayout(pRecursosLayout);
        pRecursosLayout.setHorizontalGroup(
            pRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRecursosLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bInserirRecurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRemoverRecurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bConcluirRecurso)
                .addGap(7, 10, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
            .addGroup(pRecursosLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pRecursosLayout.setVerticalGroup(
            pRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRecursosLayout.createSequentialGroup()
                .addGroup(pRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(pRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bInserirRecurso)
                        .addComponent(bRemoverRecurso)
                        .addComponent(bConcluirRecurso)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bIncluir.setText("Incluir");
        bIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIncluirActionPerformed(evt);
            }
        });

        bPesquisar.setText("Pesquisar");
        bPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarActionPerformed(evt);
            }
        });

        bAlterar.setText("Alterar");
        bAlterar.setEnabled(false);
        bAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarActionPerformed(evt);
            }
        });

        bExcluir.setText("Excluir");
        bExcluir.setEnabled(false);
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("Usuário:");

        jLabel4.setText("Data limite:");

        tfDataLimite.setAutoscrolls(false);
        tfDataLimite.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pRecursos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCodigoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDataEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDataLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfDataEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bIncluir)
                    .addComponent(bPesquisar)
                    .addComponent(bAlterar)
                    .addComponent(bExcluir)
                    .addComponent(bCancelar))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfDataLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbRecursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRecursosActionPerformed
                  
    }//GEN-LAST:event_cbRecursosActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        cbRecursos.removeAllItems();
        for (Recurso r : recs)
        {
            if(r instanceof Revista)
            {
                cbRecursos.addItem(r.getNome() + " / Revista"); 
            }
            else
            {
                cbRecursos.addItem(r.getNome() + " / Filme"); 
            }
        }
        
        cbUsuarios.removeAllItems();
        for(Usuario u : users)
            cbUsuarios.addItem(u.getNome() + " / " + u.getCodUsuario());
    }//GEN-LAST:event_formWindowActivated

    private void bIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIncluirActionPerformed
        incluirEmprestimo();
    }//GEN-LAST:event_bIncluirActionPerformed

    private void bPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarActionPerformed
        pesquisarEmprestimo();
    }//GEN-LAST:event_bPesquisarActionPerformed

    private void bAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarActionPerformed
        alterarEmprestimo();
    }//GEN-LAST:event_bAlterarActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
        excluirEmprestimo();
    }//GEN-LAST:event_bExcluirActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        limpar();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bInserirRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInserirRecursoActionPerformed
        inserirRecurso();
    }//GEN-LAST:event_bInserirRecursoActionPerformed

    private void bRemoverRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoverRecursoActionPerformed
        removerRecurso();
    }//GEN-LAST:event_bRemoverRecursoActionPerformed

    private void bConcluirRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConcluirRecursoActionPerformed
        limpar();
    }//GEN-LAST:event_bConcluirRecursoActionPerformed
    public Usuario existeUsuario(int cod)
    {
        for (Usuario u : users)
        {
           if(u.getCodUsuario() == cod)
           {
               return u;
           }
        }
        return null;
    }
    public Emprestimo existeEmprestimo(int cod)
    {
        for (Emprestimo e : emps)
        {
           if(e.getCodEmprestimo() == cod)
           {
               return e;
           }
        }
        return null;
    }
    
    public void incluirEmprestimo()
    {
        if (tfCodigoEmp.getText().equals("") || tfDataEmp.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Todos os campos devem estar preenchidos!");
        else
        {
            String[] usu = cbUsuarios.getSelectedItem().toString().split(" / ");
            e = new Emprestimo(Integer.parseInt(tfCodigoEmp.getText()), tfDataEmp.getText(), existeUsuario(Integer.parseInt(usu[1])));
            emps.add(e); 
            
            bIncluir.setEnabled(false);
            cbUsuarios.setEnabled(false);
            bPesquisar.setEnabled(false);
            cbRecursos.setEnabled(true);
            tfQtdRec.setEnabled(true);
            bInserirRecurso.setEnabled(true);        
            bRemoverRecurso.setEnabled(true);
            bConcluirRecurso.setEnabled(true);
            pRecursos.setEnabled(true);
            tbRecursos.setEnabled(true);
        }
    }
    
    public void pesquisarEmprestimo()
    {
        if (tfCodigoEmp.getText().equals(""))
            JOptionPane.showMessageDialog(null, "O campo código do empréstimo deve estar preenchido!");
        else
        {        
                e = existeEmprestimo(Integer.parseInt(tfCodigoEmp.getText()));
                if (e == null)
                    JOptionPane.showMessageDialog(null, "Empréstimo não cadastrado!");
                else
                {
                    tfDataLimite.setText(e.getDataLimite()+"");
                    tfDataEmp.setText(e.getDataEmprestimo()+"");
                    
                    itens = e.getItens();
                    for (itemRecurso i : itens)
                    { 
                        r = i.getR();
                        String[] linha = {r.getCodRecurso()+"", r.getNome(), r.getAno()+"", i.getQtRecurso()+""};
                        modelo.addRow(linha);                                                   
                    }
                    bIncluir.setEnabled(false);
                    cbUsuarios.setEnabled(true);
                    bPesquisar.setEnabled(false);
                    bAlterar.setEnabled(true);
                    bExcluir.setEnabled(true);
                    cbRecursos.setEnabled(true);
                    tfQtdRec.setEnabled(true);
                    bInserirRecurso.setEnabled(true);
                    bRemoverRecurso.setEnabled(true);
                    bConcluirRecurso.setEnabled(true);
                    pRecursos.setEnabled(true);             
                    tbRecursos.setEnabled(true);
                }
            }
    }
    
    public void alterarEmprestimo()
    {
        String[] usu = cbUsuarios.getSelectedItem().toString().split(" / ");
        e.setU(existeUsuario(Integer.parseInt(usu[1])));
        limpar();
    }
    
    public void excluirEmprestimo()
    {   
        emps.remove(e);
        limpar();
    }
    
    public void inserirRecurso()
    {
        e.insereItemRecurso(Integer.parseInt(tfQtdRec.getText()),recs.get(cbRecursos.getSelectedIndex()));
        r = recs.get(cbRecursos.getSelectedIndex());

        String[] linha = {r.getCodRecurso()+"", r.getNome(), r.getAno()+"", tfQtdRec.getText()};
        modelo.addRow(linha);
        
        tfQtdRec.setText("");
    }
    
    public void removerRecurso()
    {
        int linha = tbRecursos.getSelectedRow();
        
        String nomeRecurso = modelo.getValueAt(linha, 1).toString();
       
        modelo.removeRow(linha);

        for (itemRecurso i : itens)
        {
            if (i.getR().getNome().equals(nomeRecurso))
            {
                itens.remove(i);
                return;
            }
        }               
    }
    
    public void limpar()
    {
        cbUsuarios.setEnabled(true);
        tfCodigoEmp.setText("");
        tfDataEmp.setText("");
        tfQtdRec.setText("");
        modelo.setRowCount(0);       
        bIncluir.setEnabled(true);
        bPesquisar.setEnabled(true);
        bAlterar.setEnabled(false);
        bExcluir.setEnabled(false);
        cbRecursos.setEnabled(false);
        tfQtdRec.setEnabled(false);
        bInserirRecurso.setEnabled(false);
        bRemoverRecurso.setEnabled(false);
        bConcluirRecurso.setEnabled(false);
        pRecursos.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlterar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bConcluirRecurso;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bIncluir;
    private javax.swing.JButton bInserirRecurso;
    private javax.swing.JButton bPesquisar;
    private javax.swing.JButton bRemoverRecurso;
    private javax.swing.JComboBox cbRecursos;
    private javax.swing.JComboBox cbUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pRecursos;
    private javax.swing.JTable tbRecursos;
    private javax.swing.JTextField tfCodigoEmp;
    private javax.swing.JTextField tfDataEmp;
    private javax.swing.JTextField tfDataLimite;
    private javax.swing.JTextPane tfQtdRec;
    // End of variables declaration//GEN-END:variables
}
