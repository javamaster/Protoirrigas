/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Mauricio
 */
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    private String nome;
    
    private String login;
    
    private String senha;
    
    private String foto;
    
    private Boolean status;

    public Usuario() {
    }

    public Usuario(Long id, String nome, String login, String senha, String foto, Boolean status) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.foto = foto;
        this.status = status;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
    
    
}
