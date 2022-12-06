/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.si.tcc.uva.sisedu;

/**
 *
 * @author lferreira
 */
public class Professor {
   private int id;
   private String nome;
   private long cpf;

    public Professor(int id) {
        this.id = id;
    }

    public Professor(long cpf) {
        this.cpf = cpf;
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Professor(int id, String nome, long cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }
    

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Professor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
        @Override
    public String toString() {
        return getId() + " | " + getNome();
    }
    
}
