package com.si.tcc.uva.sisedu.dao;

//import java.awt.HeadlessException;
import com.si.tcc.uva.sisedu.Curso;
import java.io.IOException;
//import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import com.si.tcc.uva.sisedu.Curso;

public class CursoDAO {
    BaseDAO acesso = new BaseDAO();
    
 
    public CursoDAO() {

    }
    

    public boolean adicionaCurso(Curso curso) throws SQLException, IOException {
  
        if (acesso.conectar()) {
            
        
        String sql = "INSERT INTO cursos (id,nome,id_prof) VALUES (?,?,?)";
        try (
                 PreparedStatement stm = acesso.con.prepareStatement(sql) // entra com os valores de inserção
                ) {
            stm.setInt(1, curso.getId());
            stm.setString(2, curso.getNome());
            stm.setInt(3, curso.getProf().getId());

// executa
            stm.execute();
            JOptionPane.showMessageDialog(null, "Curso adicionado");
        }
    }  
     acesso.desconectar();
     return true;
}
    
    public boolean excluir(Curso curso) throws IOException, SQLException {



        if (acesso.conectar()) {

            try {

                String consulta = "DELETE from cursos WHERE nome=" + "('" + curso.getNome() + "')";
 

                Statement st = acesso.con.createStatement();

                st.executeUpdate(consulta);
                String mensagem = "Curso Excluído!";
                JOptionPane.showMessageDialog(null, mensagem);
            } catch (SQLException e) {

                String mensagem = "Curso não Excluído!";
                JOptionPane.showMessageDialog(null, mensagem);
                return false;
            }
        }

        acesso.desconectar();

        return true;
    }
    public List<Curso> getListaCursos() throws SQLException, IOException {

        String sql = "SELECT * FROM cursos";
        List<Curso> cursos;
        acesso.conectar();
        try ( PreparedStatement stm = acesso.con.prepareStatement(sql);  ResultSet rs = stm.executeQuery()) {
            cursos = new ArrayList<>();
            while (rs.next()) {
// criando o objeto 
                Curso curso = new Curso();
                curso.setId(rs.getInt("id"));
                curso.setNome(rs.getString("nome"));

// adicionando o objeto à lista
                cursos.add(curso);
            }
        }
        return cursos;

    }
    
    

}