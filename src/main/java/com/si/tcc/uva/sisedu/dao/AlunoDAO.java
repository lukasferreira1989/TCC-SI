package com.si.tcc.uva.sisedu.dao;
//import java.awt.HeadlessException;
import com.si.tcc.uva.sisedu.Aluno;
import java.io.IOException;
//import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import com.si.tcc.uva.sisedu.Aluno;
import com.si.tcc.uva.sisedu.Formulario;

public class AlunoDAO {
    BaseDAO acesso = new BaseDAO();
    
 
    public AlunoDAO() {

    }
    


    
    public boolean adicionaAluno(Aluno aluno) throws SQLException, IOException {
  
        if (acesso.conectar()) {
        
        String sql = "INSERT INTO alunos (matricula,nome,sexo,endereco,cidade,estado,nomemae,email,nomecurso,cpf,rg,cep,telefone,periodo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (
                 PreparedStatement stm = acesso.con.prepareStatement(sql) // entra com os valores de inserção
                ) {
            stm.setInt(1, aluno.getMatricula());
            stm.setString(2, aluno.getNome());
            stm.setString(3, aluno.getSexo());
            stm.setString(4, aluno.getEndereco());
            stm.setString(5, aluno.getCidade());
            stm.setString(6, aluno.getEstado());
            stm.setString(7, aluno.getNomemae());
            stm.setString(8, aluno.getEmail());
            stm.setString(9, aluno.getNomecurso());
            stm.setLong(10, aluno.getCpf());
            stm.setLong(11, aluno.getRg());
            stm.setLong(12, aluno.getCep());
            stm.setLong(13, aluno.getTelefone());
            stm.setInt(14, aluno.getPeriodo());
// executa
            stm.execute();
            Formulario form = new Formulario();
            form.criarForm(aluno);
            
            JOptionPane.showMessageDialog(null, "Aluno adicionado");
        }
    }  
     acesso.desconectar();
     return true;
}
    
        public void modificaAluno(Aluno aluno) throws SQLException {

        String sql = "UPDATE alunos SET matricula=?, nome=? WHERE cpf=?";
        try ( PreparedStatement stm = acesso.con.prepareStatement(sql)) {
            stm.setInt(1, aluno.getMatricula());
            stm.setString(2, aluno.getNome());
            stm.setLong(3, aluno.getCpf());
            stm.execute();
            JOptionPane.showMessageDialog(null, "Aluno modificado");
        }
    }

//matricula='" + aluno.getMatricula()


    public boolean alterarAluno(Aluno aluno) throws IOException, SQLException {

        if (acesso.conectar()) {
            try {
                String consulta = "UPDATE alunos SET nome='" + aluno.getNome() + "', endereco='" + aluno.getEndereco() + "', cidade='" + aluno.getCidade()+ "', estado='" + aluno.getEstado()
                        + "', nomemae='" + aluno.getNomemae() + "', email='" + aluno.getEmail() + "', nomecurso='" + aluno.getNomecurso() + "', cpf='" + aluno.getCpf() + "', rg='" + aluno.getRg() 
                        + "', cep='" + aluno.getCep() + "', telefone='" + aluno.getTelefone() + "', periodo='" + aluno.getPeriodo() + "' WHERE matricula=('" + aluno.getMatricula() + "')";
                //System.out.println(consulta);
                Statement st = acesso.con.createStatement();
                st.executeUpdate(consulta);
                Formulario form = new Formulario();
                form.criarForm(aluno);
                String mensagem = "Aluno Alterado!";
                JOptionPane.showMessageDialog(null, mensagem);
            } catch (SQLException e) {
                String mensagem = "Aluno não Alterado!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }

        acesso.desconectar();

        return true;
    }

    public boolean excluirAluno(Aluno aluno) throws IOException, SQLException {



        if (acesso.conectar()) {

            try {

                String consulta = "DELETE from alunos WHERE matricula=" + "('" + aluno.getMatricula() + "')";
                //System.out.println(consulta);
                //System.out.println(carro.getPlaca());

                Statement st = acesso.con.createStatement();

                st.executeUpdate(consulta);
                String mensagem = "Aluno Excluído!";
                JOptionPane.showMessageDialog(null, mensagem);
            } catch (SQLException e) {

                String mensagem = "Aluno não Excluído!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }

        acesso.desconectar();

        return true;
    }
    


    
    public List<Aluno> getListaAlunos() throws SQLException, IOException {

        String sql = "SELECT * FROM alunos";
        List<Aluno> alunos;
        acesso.conectar();
        try ( PreparedStatement stm = acesso.con.prepareStatement(sql);  ResultSet rs = stm.executeQuery()) {
            alunos = new ArrayList<>();
            while (rs.next()) {
// criando o objeto Aluno
                Aluno aluno = new Aluno();
                aluno.setMatricula(rs.getInt("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEmail(rs.getString("email"));
                aluno.setCpf(rs.getLong("cpf"));
                aluno.setRg(rs.getLong("rg"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setCidade(rs.getString("cidade"));
                aluno.setEstado(rs.getString("estado"));
                aluno.setNomecurso(rs.getString("nomecurso"));
                aluno.setPeriodo(rs.getInt("periodo"));
                aluno.setNomemae(rs.getString("nomemae"));
                aluno.setTelefone(rs.getLong("telefone"));
                aluno.setCep(rs.getLong("cep"));

// adicionando o objeto à lista
                alunos.add(aluno);
            }
        }
        return alunos;
    }
    
    
    public List<Aluno> buscaAluno(Aluno aluno) throws IOException {
        
        //Aluno aluno = new Aluno();
        // Connection conn = null;
        // PreparedStatement stmt = this.conexao.prepareStatement(sql);

        //conn = this.conexao;
        
        try {
            acesso.conectar();
            String sql= null;
           // Long Cpf = aluno.getCpf();
           // String Nome = aluno.getNome();
           // Integer Mat = aluno.getMatricula();
            PreparedStatement stm = null;
            

            




             if(aluno.getMatricula() != 0) {
            	 System.out.println(aluno.getMatricula());
            	 System.out.println("teste");
            	sql = "select * from alunos where lower(matricula) like ?";	
                stm = acesso.con.prepareStatement(sql);
            	stm.setInt(1, aluno.getMatricula());

            	
            	
            	
            }
             else if(aluno.getCpf() != 0) {
            	// System.out.println(aluno.getCpf());
            	 System.out.println("teste1");
            	sql = "select * from alunos where lower(cpf) like ?";
            	stm = acesso.con.prepareStatement(sql);
            	stm.setLong(1, aluno.getCpf());
            	
            	
            } 
             else if(aluno.getNome() != null) {
	         	sql = "select * from alunos where lower(nome) like ?";
	         	System.out.println("teste2");
	         	stm = acesso.con.prepareStatement(sql);
	         	System.out.println(aluno.getNome());
	         	stm.setString(1, "%" + aluno.getNome() + "%");
	         	
	
	         	
	             
	         }
             
             


            List<Aluno> alunos;
            alunos = new ArrayList<>();
            
            
            
           // 
        	//stm.setString(2, aluno.getNome());
        	//stm.setString(2, aluno.getNome());
        	//stm.setLong(3, aluno.getCpf());
            ResultSet rs = stm.executeQuery();

            while(rs.next()) {
            aluno.setMatricula((rs.getInt("matricula")));
            aluno.setNome(rs.getString("nome"));
                aluno.setEmail(rs.getString("email"));
                aluno.setCpf(rs.getLong("cpf"));
                aluno.setRg(rs.getLong("rg"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setCidade(rs.getString("cidade"));
                aluno.setEstado(rs.getString("estado"));
                aluno.setNomecurso(rs.getString("nomecurso"));
                aluno.setPeriodo(rs.getInt("periodo"));
                aluno.setNomemae(rs.getString("nomemae"));
                aluno.setTelefone(rs.getLong("telefone"));
                aluno.setCep(rs.getLong("cep"));
                alunos.add(aluno);
            }
           // JOptionPane.showMessageDialog(null, "Matricula: " + aluno.getMatricula() + ", Nome: " + aluno.getNome()  + "");
            rs.close();
            stm.close();
            return alunos;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao procurar o aluno!");
            return null;
        }

        /*    if (rs.next() == false) {
            JOptionPane.showMessageDialog(null, "Matricula nao encontrada");
            //System.out.println("Matricula nao encontrada!");
          //  return null;

        } else {
           // System.out.println("teste");
            
               // System.out.println("teste");
                aluno.setMatricula((rs.getInt("matricula")));
                aluno.setNome((rs.getString("nome")));
                aluno.setIdaluno((rs.getInt("id")));
                //matricula = rs.getInt("matricula");
                // String nom = rs.getString("nome");
                //String id = rs.getString("id");

               // JOptionPane.showMessageDialog(null, "Names for matricula " + aluno.getMatricula() + " are nome: " + aluno.getNome() + " and id:" + aluno.getIdaluno() + "");
                //System.out.println("Names for matricula " + aluno.getMatricula() + " are nome: " + aluno.getNome() + " and id:" + aluno.getIdaluno() + "");

            } */
        
    }
    }