package com.example.demo.Interfaces; 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EPractico;




@Repository
public interface IEPractico extends JpaRepository<EPractico, Integer>{
@Query("SELECT p FROM EPractico p WHERE" + " CONCAT(p.id,p.ci,p.fecha_aplic,p.evaluacion)"
+ " LIKE %?1%")
public List<EPractico> findAll(String palabraClave);

}

