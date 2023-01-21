package com.example.demo.model;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
@Table(name = "Licencia")

public class Licencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private Long ci;
    private String fecha_venc;
    private String categoria;
    private String estado;
    public Licencia() {
    }

    public Licencia(int id, Long ci, String fecha_venc, String categoria, String estado) {
        this.id = id;
        this.ci = ci;
        this.fecha_venc = fecha_venc;
        this.categoria = categoria;
        this.estado = estado;
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

    public String getFecha_venc() {
        return this.fecha_venc;
    }

    public void setFecha_venc(String fecha_venc) {
        this.fecha_venc = fecha_venc;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
