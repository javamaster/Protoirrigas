package br.com.mau.model;

import java.io.Serializable;
import java.util.Date;
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
    
    private Date agenda;    
    
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date hora_inicio;
    
    @Temporal(javax.persistence.TemporalType.TIME)  
    private Date hora_fim;
    
    public Agenda() {
    }

     public Agenda(Long id, String nome, String descricao, Date date, 
                  Date hora_inicio, Date hora_fim) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.agenda = date;
        this.hora_inicio = hora_inicio;
        this.hora_fim = hora_fim;
    }
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getAgenda() {
        return agenda;
    }

    public void setAgenda(Date agenda) {
        this.agenda = agenda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(Date hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Date getHora_fim() {
        return hora_fim;
    }

    public void setHora_fim(Date hora_fim) {
        this.hora_fim = hora_fim;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
