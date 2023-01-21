package com.example.demo.Interfaces; 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Licencia;


@Repository
public interface ILicencia extends JpaRepository<Licencia, Integer>{
@Query("SELECT l FROM Licencia l WHERE" + " CONCAT(l.id,l.ci,l.fecha_venc,l.categoria,l.estado)"
+ " LIKE %?1%")
public List<Licencia> findAll(String palabraClave);

}

