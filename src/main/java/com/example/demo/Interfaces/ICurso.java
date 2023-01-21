package com.example.demo.Interfaces; 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Curso;

@Repository
public interface ICurso extends JpaRepository<Curso, Integer>{
@Query("SELECT c FROM Curso c WHERE" + " CONCAT(c.id,c.ci,c.fecha_ini,c.fecha_fin)"
+ " LIKE %?1%")
public List<Curso> findAll(String palabraClave);

}

