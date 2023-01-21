package com.example.demo.Interfaces; 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.GestSolicitud;

@Repository
public interface IGestSolicitud extends JpaRepository<GestSolicitud, Integer>{
@Query("SELECT g FROM GestSolicitud g WHERE" + " CONCAT(g.id,g.nombre,g.apellido,g.ci,g.fecha,g.direccion,g.categoria)"
+ " LIKE %?1%")
public List<GestSolicitud> findAll(String palabraClave);

}

