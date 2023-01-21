package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Interfaces.IGestSolicitud;
import com.example.demo.interfaceService.IGestSolicitudService;
import com.example.demo.model.GestSolicitud;
@Service
public class GestSolicitudService implements IGestSolicitudService{
    @Autowired
private IGestSolicitud dataG;
    @Override
    public List<GestSolicitud> listAll(String palabraClave) {
        if(palabraClave != null){
        return dataG.findAll(palabraClave);
        }
        return dataG.findAll();
    }

    @Override
    public Optional<GestSolicitud> listarIdG(int id) {
       
        return dataG.findById(id);
    }

    @Override
    public int saveG(GestSolicitud g) {
    int res=0;
    GestSolicitud gestsolicitud = dataG.save(g);
    if(!gestsolicitud.equals(null)){
        res=1;
    }
    return res;
    }

    @Override
    public void deleteG(int id) {
        dataG.deleteById(id);
}
}