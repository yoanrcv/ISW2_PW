package com.example.demo.Interfaces; 
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Usuario;

@Repository
public interface IUsuario extends JpaRepository<Usuario, Integer>{
@Query("SELECT u FROM Usuario u WHERE" + " CONCAT(u.id,u.nombre,u.ci,u.correo)"
+ " LIKE %?1%")
public List<Usuario> findAll(String palabraClave);

}

