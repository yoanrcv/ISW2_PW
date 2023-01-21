package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Interfaces.IEPractico;
import com.example.demo.interfaceService.IEPracticoService;
import com.example.demo.model.EPractico;

@Service
public class EPracticoService implements IEPracticoService {
    @Autowired
    private IEPractico dataPrac;

    @Override
    public List<EPractico> listAll(String palabraClave) {
        if (palabraClave != null) {
            return dataPrac.findAll(palabraClave);
        }
        return dataPrac.findAll();
    }

    @Override
    public Optional<EPractico> listarIdPrac(int id) {

        return dataPrac.findById(id);
    }

    @Override
    public int savePrac(EPractico p) {
        int res = 0;
        EPractico epractico = dataPrac.save(p);
        if (!epractico.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void deletePrac(int id) {
        dataPrac.deleteById(id);
    }
  

}