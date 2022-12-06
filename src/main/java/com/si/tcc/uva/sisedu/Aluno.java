/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.si.tcc.uva.sisedu;

/**
 *
 * @author lucas.ferreira
 */
public class Aluno {
    private String nome, sexo, endereco, cidade, estado,nomemae, email, nomecurso;
    private int periodo, matricula;
    private long cpf, rg, cep, telefone;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Aluno() {
    }

    public Aluno(String nome, String sexo, String endereco, String cidade, String estado, String nomemae, String email, String nomecurso, int cpf, int rg, long cep, long telefone, int periodo, int matricula) {
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.nomemae = nomemae;
        this.email = email;
        this.nomecurso = nomecurso;
        this.cpf = cpf;
        this.rg = rg;
        this.cep = cep;
        this.telefone = telefone;
        this.periodo = periodo;
        this.matricula = matricula;
    }



    public Aluno(String nome, String sexo, String endereco, String cidade, String estado, String nomemae, String email, String nomecurso) {
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.nomemae = nomemae;
        this.email = email;
        this.nomecurso = nomecurso;
    }

    public Aluno(long cpf, long rg, long cep, long telefone, int periodo, int matricula) {
        this.cpf = cpf;
        this.rg = rg;
        this.cep = cep;
        this.telefone = telefone;
        this.periodo = periodo;
        this.matricula = matricula;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNomemae() {
        return nomemae;
    }

    public void setNomemae(String nomemae) {
        this.nomemae = nomemae;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    

    @Override
    public String toString() {
        return "matricula=" + matricula + "nome=" + nome + ", email=" + email + ", nomecurso=" + nomecurso + ", cpf=" + cpf ;
    }
    
}
