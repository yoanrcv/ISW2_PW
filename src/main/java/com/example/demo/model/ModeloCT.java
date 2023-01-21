package com.example.demo.model;
import jakarta.persistence.Table;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
@Table(name = "ModeloCT")

public class ModeloCT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nombre;
    private String apellido;
    private Long ci;
    private String fecha;
    private String evaluacion;
    private String categoria;
    public ModeloCT() {
    }

    public ModeloCT(int id, String nombre, String apellido, Long ci, String fecha, String evaluacion, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.fecha = fecha;
        this.evaluacion = evaluacion;
        this.categoria = categoria;
    } 
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getCi() {
        return this.ci;
    }

    public void setCi(Long ci) {
        this.ci = ci;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEvaluacion() {
        return this.evaluacion;
    }
    public void setEvaluacion(String evaluacion) {
        this.evaluacion = evaluacion;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getCategoria() {
        return this.categoria;
    }
}