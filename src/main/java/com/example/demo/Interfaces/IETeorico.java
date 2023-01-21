package com.example.demo.Interfaces; 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ETeorico;



@Repository
public interface IETeorico extends JpaRepository<ETeorico, Integer>{
@Query("SELECT t FROM ETeorico t WHERE" + " CONCAT(t.id,t.ci,t.fecha_aplic,t.evaluacion)"
+ " LIKE %?1%")
public List<ETeorico> findAll(String palabraClave);

}

