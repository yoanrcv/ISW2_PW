package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Interfaces.ILicencia;
import com.example.demo.interfaceService.ILicenciaService;
import com.example.demo.model.Licencia;

@Service
public class LicenciaService implements ILicenciaService {
    @Autowired
    private ILicencia dataLic;

    @Override
    public List<Licencia> listAllLic(String palabraClave) {
        if (palabraClave != null) {
            return dataLic.findAll(palabraClave);
        }
       
        return dataLic.findAll();
    }

    @Override
    public Optional<Licencia> listarIdLic(int id) {

        return dataLic.findById(id);
    }

    @Override
    public int saveLic(Licencia l) {
        int res = 0;
        Licencia licencia = dataLic.save(l);
        if (!licencia.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void deleteLic(int id) {
        dataLic.deleteById(id);

    }

}