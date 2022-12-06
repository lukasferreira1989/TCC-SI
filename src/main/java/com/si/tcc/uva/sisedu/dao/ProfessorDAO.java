package com.si.tcc.uva.sisedu.dao;

import com.si.tcc.uva.sisedu.Professor;
import java.io.IOException;
//import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import com.si.tcc.uva.sisedu.Professor;

public class ProfessorDAO {

    BaseDAO acesso = new BaseDAO();

    public ProfessorDAO() {
    }

    public boolean adicionaProfessor(Professor professor) throws SQLException, IOException {

        if (acesso.conectar()) {

            String sql = "INSERT INTO professores (id,nome,cpf) VALUES (?,?,?)";
            try (
                     PreparedStatement stm = acesso.con.prepareStatement(sql) // entra com os valores de inserção
                    ) {
                stm.setInt(1, professor.getId());
                stm.setString(2, professor.getNome());
                stm.setLong(3, professor.getCpf());

                stm.execute();
                JOptionPane.showMessageDialog(null, "Professor adicionado");
            }
        }
        acesso.desconectar();
        return true;
    }

    public List<Professor> getListaProfessores() throws SQLException, IOException {

        String sql = "SELECT * FROM professores";
        List<Professor> professores;
        acesso.conectar();
        try ( PreparedStatement stm = acesso.con.prepareStatement(sql);  ResultSet rs = stm.executeQuery()) {
            professores = new ArrayList<>();
            while (rs.next()) {
// criando o objeto 
                Professor professor = new Professor();
                professor.setId(rs.getInt("id"));
                professor.setNome(rs.getString("nome"));
                professor.setCpf(rs.getLong("cpf"));

// adicionando o objeto à lista
                professores.add(professor);
            }
        }
        return professores;

    }

    public Professor buscaProfessor(Professor professor) {

        try {
            String sql = "select * from professores where lower(id) like ?";
            PreparedStatement stm = acesso.con.prepareStatement(sql);
            stm.setInt(1, professor.getId());
            ResultSet rs = stm.executeQuery();

            rs.next();
            professor.setId((rs.getInt("id")));
            professor.setNome((rs.getString("nome")));
            professor.setCpf((rs.getInt("cpf")));
            //JOptionPane.showMessageDialog(null, "Matricula: " + aluno.getMatricula() + ", Nome: " + aluno.getNome() + ", ID: " + aluno.getIdaluno() + "");
            rs.close();
            stm.close();
            return professor;

        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "ID nao encontrada");
            return null;
        }


}
    public boolean excluir(Professor professor) throws IOException, SQLException {



        if (acesso.conectar()) {

            try {

                String consulta = "DELETE from professores WHERE nome=" + "('" + professor.getNome() + "')";
 

                Statement st = acesso.con.createStatement();

                st.executeUpdate(consulta);
                String mensagem = "Professor Excluído!";
                JOptionPane.showMessageDialog(null, mensagem);
            } catch (SQLException e) {

                String mensagem = "Professor não Excluído! Verifique se o Professor está associado em algum Curso!!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }

        acesso.desconectar();

        return true;
    }
}