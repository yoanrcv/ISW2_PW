package com.example.demo.Interfaces; 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ModeloCT;


@Repository
public interface IModeloCT extends JpaRepository<ModeloCT, Integer>{
@Query("SELECT m FROM ModeloCT m WHERE" + " CONCAT(m.id,m.nombre,m.apellido,m.ci,m.fecha,m.evaluacion,m.categoria)"
+ " LIKE %?1%")
public List<ModeloCT> findAll(String palabraClave);

}

