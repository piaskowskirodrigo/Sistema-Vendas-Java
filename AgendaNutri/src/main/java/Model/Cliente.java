/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author piask
 */
public class Cliente {
    
    private int Id;
    private String nome;
    private char sexo;
    private Date dataNascimento;
    private String telefone;
    private String email;
    private String rg;
    private String enereco;
    private String cep;

    public Cliente(int Id, String nome, char sexo, Date dataNascimento, String telefone, String email, String rg, String enereco, String cep) {
        this.Id = Id;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
        this.enereco = enereco;
        this.cep = cep;
    }

    public Cliente(int Id, String nome, char sexo, String telefone, String enereco) {
        this.Id = Id;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.enereco = enereco;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEnereco() {
        return enereco;
    }

    public void setEnereco(String enereco) {
        this.enereco = enereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
    
}
