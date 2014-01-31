package br.com.mau.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Mauricio
 */
@Entity
@Table(name="agenda")
public class Agenda implements Serializable {

    
    
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    private String nome;
    
    private String descricao;
    
    private boolean[] agenda;
    
    public Agenda() {
    }

    public Agenda(Long id, String nome, String decricao, boolean[] agenda, 
                  Calendar hora_inicio, Calendar hora_fim) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.agenda = agenda;
        this.hora_inicio = hora_inicio;
        this.hora_fim = hora_fim;
    }
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Calendar hora_inicio;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)  
    private Calendar hora_fim;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean [] getAgenda() {
        return agenda;
    }

    public void setAgenda(boolean[] agenda) {
        this.agenda = agenda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(Calendar hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Calendar getHora_fim() {
        return hora_fim;
    }

    public void setHora_fim(Calendar hora_fim) {
        this.hora_fim = hora_fim;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
