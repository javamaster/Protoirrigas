package br.com.mau.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Mauricio
 */
@Entity
@Table(name="ambiente")
public class Ambiente implements Serializable {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    private float humidity;
    
    private float luminosity;
    
    private float temperature;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordDate;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getLuminosity() {
        return luminosity;
    }

    public void setLuminosity(float luminosity) {
        this.luminosity = luminosity;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }
    
}