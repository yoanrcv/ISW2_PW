package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Interfaces.ICurso;
import com.example.demo.interfaceService.ICursoService;
import com.example.demo.model.Curso;
@Service
public class CursoService implements ICursoService{
    @Autowired
private ICurso datacur;
    @Override
    public List<Curso> listAll(String palabraClave) {
        if(palabraClave != null){
        return datacur.findAll(palabraClave);
        }
        return datacur.findAll();
    }

    @Override
    public Optional<Curso> listarIdCur(int id) {
       
        return datacur.findById(id);
    }

    @Override
    public int saveCur(Curso c) {
    int res=0;
    Curso curso = datacur.save(c);
    if(!curso.equals(null)){
        res=1;
    }
    return res;
    }

    @Override
    public void deleteCur(int id) {
        datacur.deleteById(id);
         
        
        
    }

    

}