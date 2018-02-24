
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


public class JanelaSessao extends javax.swing.JFrame
{   
    ArrayList<Usuario> users;
    ArrayList<Recurso> recs;
    ArrayList<Sessao> ses;
    ArrayList<SessaoUsuario> su;
    Sessao s;
    Usuario u;
    Recurso r;
    SessaoUsuario SeUs;
    DefaultTableModel modelo;

    public JanelaSessao(ArrayList<Usuario> users, ArrayList<Recurso> recs, ArrayList<Sessao> ses, ArrayList<SessaoUsuario> su)
    {
        initComponents();
        this.users = users;
        this.recs = recs;
        this.ses = ses;
        this.su = su;
        modelo = (DefaultTableModel) tbUsuarios.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        bIncluir = new javax.swing.JButton();
        bPesquisar = new javax.swing.JButton();
        bAlterar = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        pUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();
        bInserirUsuario = new javax.swing.JButton();
        bRemoverUsuario = new javax.swing.JButton();
        bConcluir = new javax.swing.JButton();
        cbUsuarios = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfCodSessao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfDataSessao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfHoraSessao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfQtd = new javax.swing.JTextField();
        cbFilmes = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();

        jTextField6.setText("jTextField6");

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

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

        pUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuários"));

        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Telefone", "Tipo"
            }
        ));
        tbUsuarios.setCellSelectionEnabled(true);
        tbUsuarios.setEnabled(false);
        jScrollPane1.setViewportView(tbUsuarios);

        bInserirUsuario.setText("Inserir");
        bInserirUsuario.setEnabled(false);
        bInserirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInserirUsuarioActionPerformed(evt);
            }
        });

        bRemoverUsuario.setText("Remover");
        bRemoverUsuario.setEnabled(false);
        bRemoverUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoverUsuarioActionPerformed(evt);
            }
        });

        bConcluir.setText("Concluir");
        bConcluir.setEnabled(false);
        bConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConcluirActionPerformed(evt);
            }
        });

        cbUsuarios.setEnabled(false);

        jLabel1.setText("Adicionar Usuários");

        javax.swing.GroupLayout pUsuariosLayout = new javax.swing.GroupLayout(pUsuarios);
        pUsuarios.setLayout(pUsuariosLayout);
        pUsuariosLayout.setHorizontalGroup(
            pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
            .addGroup(pUsuariosLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbUsuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bInserirUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRemoverUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bConcluir)
                .addContainerGap())
        );
        pUsuariosLayout.setVerticalGroup(
            pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUsuariosLayout.createSequentialGroup()
                .addGroup(pUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bInserirUsuario)
                    .addComponent(bRemoverUsuario)
                    .addComponent(bConcluir)
                    .addComponent(cbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setText("Código da sessão:");

        jLabel3.setText("Data:");

        jLabel4.setText("Hora:");

        jLabel5.setText("Quantidade:");

        cbFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFilmesActionPerformed(evt);
            }
        });

        jLabel7.setText("Seleção de filme:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(bIncluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bPesquisar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCancelar))
                            .addComponent(cbFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCodSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDataSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfHoraSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCodSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfDataSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfHoraSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tfQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bIncluir)
                    .addComponent(bPesquisar)
                    .addComponent(bAlterar)
                    .addComponent(bExcluir)
                    .addComponent(bCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bInserirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInserirUsuarioActionPerformed
        inserirUsuario();
    }//GEN-LAST:event_bInserirUsuarioActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        cbUsuarios.removeAllItems();
        for (Usuario u : users)
            cbUsuarios.addItem(u.getNome());
        
        cbFilmes.removeAllItems();
        for(Recurso r : recs)
        {
            if(r instanceof Filme)
            {
                cbFilmes.addItem(r.getNome() + " / " + r.getCodRecurso());
            }
        }
    }//GEN-LAST:event_formWindowActivated

    private void bIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIncluirActionPerformed
        incluirSessao();
    }//GEN-LAST:event_bIncluirActionPerformed

    private void bPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarActionPerformed
        pesquisarSessao();
    }//GEN-LAST:event_bPesquisarActionPerformed

    private void bAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarActionPerformed
        alterarSessao();
    }//GEN-LAST:event_bAlterarActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
        excluirSessao();
    }//GEN-LAST:event_bExcluirActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        limpar();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bRemoverUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoverUsuarioActionPerformed
        removerUsuario();
    }//GEN-LAST:event_bRemoverUsuarioActionPerformed

    private void bConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConcluirActionPerformed
        limpar();
    }//GEN-LAST:event_bConcluirActionPerformed

    private void cbFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFilmesActionPerformed

    }//GEN-LAST:event_cbFilmesActionPerformed
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
    
    public Sessao existeSessao(int cod)
    {
        for (Sessao s : ses)
        {
           if(s.getCodSessao() == cod)
           {
               return s;
           }
        }
        return null;
    }
    
    public void incluirSessao()
    {
        if (tfCodSessao.getText().equals("") || tfDataSessao.getText().equals("") || tfHoraSessao.getText().equals("") || tfQtd.getText().equals("")) 
            JOptionPane.showMessageDialog(null, "Todos os campos devem estar preenchidos!");
        else if(Integer.parseInt(tfQtd.getText()) > 100){
            JOptionPane.showMessageDialog(null, "A quantidade de usuários limite é 100");
        }    
        else
        {
            String[] rec = cbFilmes.getSelectedItem().toString().split(" / ");
            s = new Sessao(Integer.parseInt(tfCodSessao.getText()), tfDataSessao.getText(),tfHoraSessao.getText(), existeRecurso(Integer.parseInt(rec[1])), Integer.parseInt(tfQtd.getText()));
            ses.add(s); 
            
            bIncluir.setEnabled(false);
            bPesquisar.setEnabled(false);
            cbUsuarios.setEnabled(true);
            bInserirUsuario.setEnabled(true);        
            bRemoverUsuario.setEnabled(true);
            bConcluir.setEnabled(true);
            pUsuarios.setEnabled(true);
            tbUsuarios.setEnabled(true);
        }
    }
    
    public void pesquisarSessao()
    {
        if (tfCodSessao.getText().equals(""))
            JOptionPane.showMessageDialog(null, "O campo código da sessão deve estar preenchido!");
        else
        {        
                s = existeSessao(Integer.parseInt(tfCodSessao.getText()));
                if (s == null)
                    JOptionPane.showMessageDialog(null, "Sessão não cadastrada!");
                else
                {
                    tfDataSessao.setText(s.getDataSessao()+"");
                    tfHoraSessao.setText(s.getHora());
                    tfQtd.setText(s.getQtd()+"");
                    
                    for(SessaoUsuario SeUs : su)
                    {
                        if (s == SeUs.getSessao())
                        {
                            u = SeUs.getUsuario();
                            if(u instanceof Professor)
                            {
                                String[] linha = {u.getCodUsuario()+"", u.getNome(), u.getTelefone(), "Professor"};
                                modelo.addRow(linha);
                            }
                            else
                            {

                                String[] linha = {u.getCodUsuario()+"", u.getNome(), u.getTelefone(), "Aluno"};
                                modelo.addRow(linha);
                            }
                        }                                           
                    }
                    bIncluir.setEnabled(false);
                    bPesquisar.setEnabled(false);
                    bAlterar.setEnabled(true);
                    bExcluir.setEnabled(true);
                    cbUsuarios.setEnabled(true);
                    bInserirUsuario.setEnabled(true);
                    bRemoverUsuario.setEnabled(true);
                    bConcluir.setEnabled(true);
                    pUsuarios.setEnabled(true);             
                    tbUsuarios.setEnabled(true);
                }
            }
    }
    
    public void alterarSessao()
    {
        String[] rec = cbFilmes.getSelectedItem().toString().split(" / ");
        s = existeSessao(Integer.parseInt(tfCodSessao.getText()));
        s.setCodSessao(Integer.parseInt(tfCodSessao.getText()));
        s.setFilme(existeRecurso(Integer.parseInt(rec[1])));
        s.setHora(tfHoraSessao.getText());
        s.setQtd(Integer.parseInt(tfQtd.getText()));

        limpar();
    }
    
    public void excluirSessao()
    {
        for (int i=0; i < su.size();i++)
        {
            if (s == su.get(i).getSessao())
            {
                su.remove(i);
                i--;
            }
        }
        
        ses.remove(s);
        limpar();
    }
    
    public void inserirUsuario()
    {
        u = users.get(cbUsuarios.getSelectedIndex());
        su.add(new SessaoUsuario(u,s));

        if(u instanceof Professor)
        {
            String[] linha = {u.getCodUsuario()+"", u.getNome(), u.getTelefone(), "Professor"};
            modelo.addRow(linha);
        }
        else
        {
            String[] linha = {u.getCodUsuario()+"", u.getNome(), u.getTelefone(), "Aluno"};
            modelo.addRow(linha);
        }
    }
    
    public void removerUsuario()
    {
        int linha = tbUsuarios.getSelectedRow();
        
        String nomeUsuario = modelo.getValueAt(linha, 1).toString();
       
        modelo.removeRow(linha);

        for (SessaoUsuario SeUs : su)
        {
            if (SeUs.getSessao() == s  && SeUs.getUsuario().getNome().equals(nomeUsuario))
            {
                su.remove(SeUs);
                return;
            }
        }               
    }
    
    public void limpar()
    {
        tfCodSessao.setText("");
        tfDataSessao.setText("");
        tfQtd.setText("");
        tfHoraSessao.setText("");
        modelo.setRowCount(0);       
        bIncluir.setEnabled(true);
        bPesquisar.setEnabled(true);
        bAlterar.setEnabled(false);
        bExcluir.setEnabled(false);
        cbUsuarios.setEnabled(false);
        bInserirUsuario.setEnabled(false);
        bRemoverUsuario.setEnabled(false);
        bConcluir.setEnabled(false);
        pUsuarios.setEnabled(false);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlterar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bConcluir;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bIncluir;
    private javax.swing.JButton bInserirUsuario;
    private javax.swing.JButton bPesquisar;
    private javax.swing.JButton bRemoverUsuario;
    private javax.swing.JComboBox cbFilmes;
    private javax.swing.JComboBox cbUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel pUsuarios;
    private javax.swing.JTable tbUsuarios;
    private javax.swing.JTextField tfCodSessao;
    private javax.swing.JTextField tfDataSessao;
    private javax.swing.JTextField tfHoraSessao;
    private javax.swing.JTextField tfQtd;
    // End of variables declaration//GEN-END:variables
}
