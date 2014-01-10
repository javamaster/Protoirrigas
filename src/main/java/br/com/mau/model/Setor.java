/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.model;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Mauricio
 */
@Entity
@Table(name="setor")
public class Setor implements Serializable {

    
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    @OneToMany(cascade= CascadeType.ALL)
    private Set<Ambiente> ambientes = new HashSet<Ambiente>();
    
    @NotNull(message="Largura não pode ficar vazio!!")
    private double largura;
    
    private String tipoSolo;
    
    @Column(name="status")
    private boolean status;
    
    @NotNull
    private double comprimento;
    
    @NotNull
    @OneToOne()
    private Cultura cultura;
    
    @NotNull
    private String descricao;
    
    @NotNull @Size(min=5,max=10, message="O nome não pode ter menos que 5 ou mais que 10 caracteres")
    private String nome;    

    public Setor() {
    }

    public Setor(Long id, double largura, String tipoSolo, boolean status, double comprimento, Cultura cultura, String descricao, String nome) {
        this.id = id;
        this.largura = largura;
        this.tipoSolo = tipoSolo;
        this.comprimento = comprimento;
        this.cultura = cultura;
        this.descricao = descricao;
        this.nome = nome;
        this.status = status;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoSolo() {
        return tipoSolo;
    }

    public void setTipoSolo(String tipoSolo) {
        this.tipoSolo = tipoSolo;
    }
    
    public Cultura getCultura() {
        return cultura;
    }

    public void setCultura(Cultura cultura) {
        this.cultura = cultura;
    }


    public Set<Ambiente> getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(Set<Ambiente> ambientes) {
        this.ambientes = ambientes;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "Setor{" + "largura=" + largura + ", comprimento=" + comprimento + ", cultura=" + cultura + ", descricao=" + descricao + ", nome=" + nome + '}';
    }
    
    
}
