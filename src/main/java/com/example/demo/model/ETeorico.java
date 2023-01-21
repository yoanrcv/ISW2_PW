package com.example.demo.model;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
@Table(name = "ETeorico")

public class ETeorico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private Long ci;
    private String fecha_aplic;
    private String evaluacion;

    public ETeorico() {
    }

    public ETeorico(int id, Long ci, String fecha_aplic, String evaluacion) {
        this.id = id;
        this.ci = ci;
        this.fecha_aplic = fecha_aplic;
        this.evaluacion = evaluacion;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Long getCi() {
        return this.ci;
    }

    public void setCi(Long ci) {
        this.ci = ci;
    }

    public String getFecha_aplic() {
        return this.fecha_aplic;
    }

    public void setFecha_aplic(String fecha_aplic) {
        this.fecha_aplic = fecha_aplic;
    }

    public String getEvaluacion() {
        return this.evaluacion;
    }

    public void setEvaluacion(String evaluacion) {
        this.evaluacion = evaluacion;
    }
}
