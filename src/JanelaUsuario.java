
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class JanelaUsuario extends javax.swing.JFrame {
    ArrayList<Usuario> users;
    Usuario u;
  
    public JanelaUsuario(ArrayList<Usuario> users) 
    {
        initComponents();
        this.users = users;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfCodigo = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        tfDataNasc = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rbProfessor = new javax.swing.JRadioButton();
        rbAluno = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfCPF = new javax.swing.JTextField();
        tfNTurma = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        rbSim = new javax.swing.JRadioButton();
        rbNao = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfNomeMae = new javax.swing.JTextField();
        tfNomePai = new javax.swing.JTextField();
        bCadastrarProfessor = new javax.swing.JButton();
        bCadastrarAluno = new javax.swing.JButton();
        bPesquisarUsuario = new javax.swing.JButton();
        bAlterarUsuario = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        bExcluir = new javax.swing.JToggleButton();

        jLabel1.setText("Nome:");

        jLabel2.setText("Código:");

        jLabel3.setText("Telefone:");

        jLabel4.setText("Data de nascimento:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        buttonGroup1.add(rbProfessor);
        rbProfessor.setText("Professor");
        rbProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProfessorActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbAluno);
        rbAluno.setText("Aluno");
        rbAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rbProfessor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbAluno))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbProfessor)
                .addComponent(rbAluno))
        );

        jLabel5.setText("CPF:");

        jLabel6.setText("Turma:");

        jLabel7.setText("Participa de projeto:");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup2.add(rbSim);
        rbSim.setText("Sim");

        buttonGroup2.add(rbNao);
        rbNao.setText("Não");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rbSim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbNao)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSim)
                    .addComponent(rbNao)))
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setText("Nome da mãe:");

        jLabel9.setText("Nome do pai:");

        bCadastrarProfessor.setText("Cadastrar Professor");
        bCadastrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarProfessorActionPerformed(evt);
            }
        });

        bCadastrarAluno.setText("Cadastrar Aluno");
        bCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarAlunoActionPerformed(evt);
            }
        });

        bPesquisarUsuario.setText("Pesquisar");
        bPesquisarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarUsuarioActionPerformed(evt);
            }
        });

        bAlterarUsuario.setText("Alterar");
        bAlterarUsuario.setEnabled(false);
        bAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarUsuarioActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(141, 141, 141))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(bCadastrarProfessor)
                                            .addGap(26, 26, 26)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel7)
                                            .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfNomePai, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(tfNomeMae)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(bCadastrarAluno))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfNome))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(8, 8, 8)
                                                    .addComponent(jLabel3))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(94, 94, 94)
                                                    .addComponent(bExcluir)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(bCancelar)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(tfNTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(bPesquisarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAlterarUsuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfNTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPesquisarUsuario)
                    .addComponent(bAlterarUsuario)
                    .addComponent(bCancelar)
                    .addComponent(bExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(bCadastrarProfessor))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(bCadastrarAluno))))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCadastrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarProfessorActionPerformed
        cadastrarUsuário();
    }//GEN-LAST:event_bCadastrarProfessorActionPerformed

    private void bCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarAlunoActionPerformed
        cadastrarUsuário();
    }//GEN-LAST:event_bCadastrarAlunoActionPerformed

    private void rbProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProfessorActionPerformed
            tfCPF.setEnabled(true);
            rbSim.setEnabled(true);
            rbNao.setEnabled(true);
            bCadastrarProfessor.setEnabled(true);
            tfNomeMae.setEnabled(false);
            tfNomePai.setEnabled(false);
            bCadastrarAluno.setEnabled(false);
    }//GEN-LAST:event_rbProfessorActionPerformed

    private void rbAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlunoActionPerformed
            tfCPF.setEnabled(false);
            rbSim.setEnabled(false);
            rbNao.setEnabled(false);
            bCadastrarProfessor.setEnabled(false);
            tfNomeMae.setEnabled(true);
            tfNomePai.setEnabled(true);
            bCadastrarAluno.setEnabled(true);
    }//GEN-LAST:event_rbAlunoActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        limpar();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarUsuarioActionPerformed
        alterarUsuario();
    }//GEN-LAST:event_bAlterarUsuarioActionPerformed

    private void bPesquisarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarUsuarioActionPerformed
        pesquisarUsuario();
    }//GEN-LAST:event_bPesquisarUsuarioActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
        excluirUsuario();
    }//GEN-LAST:event_bExcluirActionPerformed

public void limpar()
    {
        tfNome.setText("");
        tfTelefone.setText("");
        tfNTurma.setText("");
        tfDataNasc.setText("");
        tfCodigo.setText("");
        tfNomeMae.setText("");
        tfNomePai.setText("");
        bPesquisarUsuario.setEnabled(true);
        bAlterarUsuario.setEnabled(false);
    }

public void cadastrarUsuário()
    {
        String nome = tfNome.getText();
        int codUsuario = Integer.parseInt(tfCodigo.getText());
        String telefone = tfTelefone.getText();
        String dataNasc = tfDataNasc.getText();
        int numTurma = Integer.parseInt(tfNTurma.getText()); 
        if(rbProfessor.isSelected())
        {
            String cpf = tfCPF.getText();
            boolean particip;
            if(rbSim.isSelected())
            {
                particip = true;
            }
            else
            {
                particip = false;
            }
            Usuario p = new Professor(nome, cpf, codUsuario, numTurma, telefone, dataNasc, particip);
            users.add(p);
        }
        else
        {  
            String nomeMae = tfNomeMae.getText();
            String nomePai = tfNomePai.getText();
            Usuario a = new Aluno(nome, codUsuario,numTurma, telefone, dataNasc, nomeMae, nomePai);
            users.add(a);
        }
        limpar();
    }

public void excluirUsuario(){
    users.remove(u);
    limpar();
}
     
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
     
public void pesquisarUsuario()
    {
       if(tfCodigo.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null, "O campo de código deve estar preenchido");
       }
       else
       {
           u = existeUsuario(Integer.parseInt(tfCodigo.getText()));
           if(u == null)
           {
               JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
           }
           else
           {
               if(u instanceof Aluno)
               {
                    tfNome.setText(u.getNome());
                    tfTelefone.setText(u.getTelefone());
                    tfNTurma.setText(u.getnTurma()+"");
                    tfDataNasc.setText(u.getDataNasc()+"");
                    tfNomeMae.setText(((Aluno)u).getNomeMae());
                    tfNomePai.setText(((Aluno)u).getNomePai()); 
               }
               else
               {
                    tfNome.setText(u.getNome());
                    tfTelefone.setText(u.getTelefone());
                    tfNTurma.setText(u.getnTurma()+"");
                    tfDataNasc.setText(u.getDataNasc()+"");
                    tfCPF.setText(((Professor)u).getCpf());
                    if(((Professor)u).EstahPartic())
                    {
                        rbSim.setSelected(true);
                    }
                    else
                    {
                        rbNao.setSelected(true);
                    }      
               }
           }
       }
       bAlterarUsuario.setEnabled(true);
       bCadastrarAluno.setEnabled(false);
       bCadastrarProfessor.setEnabled(false);       
    }

public void alterarUsuario()
{
    u = existeUsuario(Integer.parseInt(tfCodigo.getText()));
    u.setNome(tfNome.getText());
    u.setTelefone(tfTelefone.getText());
    u.setnTurma(Integer.parseInt(tfNTurma.getText()));
    if(u instanceof Aluno)
    {
        ((Aluno)u).setNomeMae(tfNomeMae.getText());
        ((Aluno)u).setNomePai(tfNomePai.getText());
    }
    else
    {
        ((Professor)u).setCpf(tfCPF.getText());
        if(rbSim.isSelected())
        {
            ((Professor)u).setEstahPartic(true);
        }
        else
        {
            ((Professor)u).setEstahPartic(false);
        }
    }
    
    limpar();    
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlterarUsuario;
    private javax.swing.JButton bCadastrarAluno;
    private javax.swing.JButton bCadastrarProfessor;
    private javax.swing.JButton bCancelar;
    private javax.swing.JToggleButton bExcluir;
    private javax.swing.JButton bPesquisarUsuario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rbAluno;
    private javax.swing.JRadioButton rbNao;
    private javax.swing.JRadioButton rbProfessor;
    private javax.swing.JRadioButton rbSim;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDataNasc;
    private javax.swing.JTextField tfNTurma;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNomeMae;
    private javax.swing.JTextField tfNomePai;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
