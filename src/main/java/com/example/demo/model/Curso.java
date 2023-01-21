package com.example.demo.model;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
@Table(name = "Curso")

public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private Long ci;
    private String fecha_ini;
    private String fecha_fin;

    public Curso() {
    }

    public Curso(int id, Long ci, String fecha_ini, String fecha_fin) {
        this.id = id;
        this.ci = ci;
        this.fecha_ini = fecha_ini;
        this.fecha_fin = fecha_fin;
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

    public String getFecha_ini() {
        return this.fecha_ini;
    }

    public void setFecha_ini(String fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public String getFecha_fin() {
        return this.fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
}
