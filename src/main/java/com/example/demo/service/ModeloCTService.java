package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Interfaces.IModeloCT;
import com.example.demo.interfaceService.IModeloCTService;
import com.example.demo.model.ModeloCT;
@Service
public class ModeloCTService implements IModeloCTService{
    @Autowired
private IModeloCT data;
    @Override
    public List<ModeloCT> listAll(String palabraClave) {
     if(palabraClave != null){
       return data.findAll(palabraClave);
        }
        return data.findAll();
    }

    @Override
    public Optional<ModeloCT> listarId(int id) {
       
        return data.findById(id);
    }

    @Override
    public int saveCT(ModeloCT m) {
    int res=0;
    ModeloCT modeloct = data.save(m);
    if(!modeloct.equals(null)){
        res=1;
    }
    return res;
    }

    @Override
    public void deleteCT(int id) {
        data.deleteById(id);
         
        
        
    }

    

}
