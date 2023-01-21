package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Interfaces.IETeorico;
import com.example.demo.interfaceService.IETeoricoService;
import com.example.demo.model.ETeorico;

@Service
public class ETeoricoService implements IETeoricoService {
    @Autowired
    private IETeorico dataETeo;

    @Override
    public List<ETeorico> listAll(String palabraClave) {
        if (palabraClave != null) {
            return dataETeo.findAll(palabraClave);
        }
        return dataETeo.findAll();
    }

    @Override
    public Optional<ETeorico> listarIdETeo(int id) {

        return dataETeo.findById(id);
    }

    @Override
    public int saveETeo(ETeorico t) {
        int res = 0;
        ETeorico eteorico = dataETeo.save(t);
        if (!eteorico.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void deleteETeo(int id) {
        dataETeo.deleteById(id);
    }
  

}