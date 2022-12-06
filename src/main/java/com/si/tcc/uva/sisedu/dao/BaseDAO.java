/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.si.tcc.uva.sisedu.dao;

import java.awt.HeadlessException;
//import java.io.File;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas.ferreira
 */
public class BaseDAO {

    Connection con;

    Properties prop = new Properties();


    public boolean conectar() throws IOException, SQLException {
        

        try {
           
         //   con = DriverManager.getConnection(
                 //"jdbc:mysql://127.0.0.1/TCC", "root", "#####");
                 
            //    System.out.println("Absolute Path: " + file.getAbsolutePath());
		//System.out.println("Canonical Path: " + file.getCanonicalPath());
		//System.out.println("Path: " + file.getPath());
            try ( InputStream input = this.getClass().getClassLoader().getResourceAsStream("application.properties")) {
                
                
  

                prop.load(input);
                //System.out.println(prop.getProperty("db.user"));
                //System.out.println(prop.getProperty("db.passwd"));
            }
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            con = DriverManager.getConnection(
                   prop.getProperty("db.url"), prop.getProperty("db.user"), prop.getProperty("db.passwd"));
        } catch (HeadlessException e) {
        	JOptionPane.showMessageDialog(null, "Erro!Verifique a conexão com o Banco de dados!");
            throw new RuntimeException(e);

        }
        return true;
    }

    public boolean desconectar() {
        con = null;
        return con == null;
    }

}
