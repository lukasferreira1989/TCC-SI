/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.si.tcc.uva.sisedu.telas;

//import java.awt.Dimension;
import com.si.tcc.uva.sisedu.Aluno;
import com.si.tcc.uva.sisedu.Curso;
import com.si.tcc.uva.sisedu.dao.AlunoDAO;
import com.si.tcc.uva.sisedu.dao.CursoDAO;
import com.si.tcc.uva.sisedu.telas.Principal.UpdateTable;
import com.si.tcc.uva.sisedu.telas.validadores.Validar;
import java.awt.event.WindowEvent;
import java.io.IOException;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import javax.swing.DefaultListModel;
//import javax.swing.JComboBox;
//import javax.swing.JFormattedTextField;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class AlterarAluno extends javax.swing.JFrame {




    public AlterarAluno(Aluno aluno) {
		initComponents();
		setLocationRelativeTo(null);

		this.setDefaultCloseOperation(AlterarAluno.DISPOSE_ON_CLOSE);

		textMatricula.setText(Integer.toString(aluno.getMatricula()));
		textNome.setText(aluno.getNome());
		textMae.setText(aluno.getNomemae());
		textCpf.setText(Long.toString(aluno.getCpf()));
		textRg.setText(Long.toString(aluno.getRg()));
		textCep.setText(Long.toString(aluno.getCep()));
		textTelefone.setText(Long.toString(aluno.getTelefone()));
		textCidade.setText(aluno.getCidade());
		jComboEstado.setSelectedItem(aluno.getEstado());
		textEmail.setText(aluno.getEmail());
		textEndereco.setText(aluno.getEndereco());
		try {

			CursoDAO dao = new CursoDAO();

			for (Curso p : dao.getListaCursos()) {
				// System.out.println(lista);

				jComboCurso.addItem(p.getNome());
			}

		} catch (IOException | SQLException ex) {
			Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
		}
		jComboCurso.setSelectedItem(aluno.getNomecurso());
		jComboPeriodo.setSelectedItem(Integer.toString(aluno.getPeriodo()));

	}


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btConfirmar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textMae = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textCidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textCep = new javax.swing.JFormattedTextField();
        textCpf = new javax.swing.JFormattedTextField();
        textRg = new javax.swing.JFormattedTextField();
        jComboEstado = new javax.swing.JComboBox<>();
        jComboPeriodo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jComboCurso = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        textMatricula = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jLabel3.setText("SISEDU - Sistema de Matrícula");

        textNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textNome.setToolTipText("");
        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        btConfirmar.setText("Alterar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        jLabel4.setText("RG");

        jLabel5.setText("Período");

        textMae.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textMae.setToolTipText("");
        textMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMaeActionPerformed(evt);
            }
        });

        jLabel6.setText("Mãe");

        textTelefone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textTelefone.setToolTipText("");

        jLabel7.setText("Telefone");

        textEndereco.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textEndereco.setToolTipText("");
        textEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEnderecoActionPerformed(evt);
            }
        });

        jLabel8.setText("Endereço");

        textEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textEmail.setToolTipText("");

        jLabel9.setText("Email");

        jLabel10.setText("Estado");

        textCidade.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textCidade.setToolTipText("");
        textCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCidadeActionPerformed(evt);
            }
        });

        jLabel11.setText("Cidade");

        jLabel12.setText("CEP");

        jLabel13.setText("CPF");

        try {
            textCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCepActionPerformed(evt);
            }
        });

        try {
            textCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCpfActionPerformed(evt);
            }
        });

        try {
            textRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jComboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboEstadoActionPerformed(evt);
            }
        });

        jComboPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        jComboPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPeriodoActionPerformed(evt);
            }
        });

        jLabel14.setText("Curso");

        jComboCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCursoActionPerformed(evt);
            }
        });

        jLabel15.setText("Matricula");

        textMatricula.setEditable(false);
        textMatricula.setBackground(new java.awt.Color(204, 204, 204));
        try {
            textMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textMatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMatriculaActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        btMenuSair.setText("Sair");
        btMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuSairActionPerformed(evt);
            }
        });
        jMenu1.add(btMenuSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addComponent(textMae, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel14)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jComboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(22, 22, 22)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(18, 18, 18)
                                            .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(textCep, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btConfirmar)
                                        .addComponent(jComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(283, 283, 283)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textRg, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21)))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(textMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13)
                    .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jComboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(textRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(textCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(textCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btConfirmar)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
		try {
			Aluno aluno = new Aluno();
			AlunoDAO dao = new AlunoDAO();
			String mensagem = null;

			// aluno.setIdaluno(3);
			aluno.setNome(textNome.getText());

			String textCpfSemMasc = textCpf.getText().replaceAll("\\D", "");
			aluno.setCpf(Long.parseLong(textCpfSemMasc));
			String textRgSemMasc = textRg.getText().replaceAll("\\D", "");
			aluno.setRg(Long.parseLong(textRgSemMasc));
			aluno.setPeriodo(Integer.parseInt(jComboPeriodo.getSelectedItem().toString()));
			aluno.setNomemae(textMae.getText());
			aluno.setNomecurso(jComboCurso.getSelectedItem().toString());
			aluno.setTelefone(Long.parseLong(textTelefone.getText()));
			aluno.setEndereco(textEndereco.getText());
			aluno.setEmail(textEmail.getText());
			aluno.setCidade(textCidade.getText());
			aluno.setEstado(jComboEstado.getSelectedItem().toString());
			String textCepSemMasc = textCep.getText().replaceAll("\\D", "");
			aluno.setCep(Long.parseLong(textCepSemMasc));
			aluno.setMatricula(Integer.parseInt(textMatricula.getText()));
			try {

				Validar validar = new Validar();
				if (!validar.isValidCPF(Long.toString(aluno.getCpf()))) {
					mensagem = "Informe um CPF Válido!";
					JOptionPane.showMessageDialog(null, mensagem);

				} else if (!validar.isValidEmailAddress(aluno.getEmail())) {

					mensagem = "Informe um Email Válido!";
					JOptionPane.showMessageDialog(null, mensagem);
				} else if (!validar.isValidPhoneNumber(Long.toString(aluno.getTelefone()))) {

					mensagem = "Informe um Telefone Válido!";
					JOptionPane.showMessageDialog(null, mensagem);
				} else {
					dao.alterarAluno(aluno);

				}

			} catch (SQLException ex) {
				Logger.getLogger(AlterarAluno.class.getName()).log(Level.SEVERE, null, ex);
			}

		} catch (Exception ex) {
			Logger.getLogger(AlterarAluno.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void textMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMaeActionPerformed

    private void textEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEnderecoActionPerformed

    private void textCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCidadeActionPerformed

    private void textCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCepActionPerformed

    private void textCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCpfActionPerformed

    private void jComboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboEstadoActionPerformed

    private void jComboPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboPeriodoActionPerformed

    private void jComboCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboCursoActionPerformed

    private void textMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMatriculaActionPerformed

    private void btMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuSairActionPerformed

        this.dispose();

    }//GEN-LAST:event_btMenuSairActionPerformed

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                // new AlterarAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConfirmar;
    private javax.swing.JMenuItem btMenuSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<Object> jComboCurso;
    private javax.swing.JComboBox<String> jComboEstado;
    private javax.swing.JComboBox<String> jComboPeriodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JFormattedTextField textCep;
    private javax.swing.JTextField textCidade;
    private javax.swing.JFormattedTextField textCpf;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textEndereco;
    private javax.swing.JTextField textMae;
    private javax.swing.JFormattedTextField textMatricula;
    private javax.swing.JTextField textNome;
    private javax.swing.JFormattedTextField textRg;
    private javax.swing.JTextField textTelefone;
    // End of variables declaration//GEN-END:variables


}
