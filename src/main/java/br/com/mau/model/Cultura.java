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
@Table(name="cultura")
public class Cultura implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    private String nome;    
    private String descricao;
    private String categoria;

    public Cultura() {
    }
    
    public Cultura(Long id, String nome, String descricao, String categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Cultura{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", categoria=" + categoria + '}';
    }
    
    
}
