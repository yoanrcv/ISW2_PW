package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfaceService.ILicenciaService;
import com.example.demo.model.Licencia;

@Controller
@RequestMapping

public class ControladorLicencia {

    @Autowired
    private ILicenciaService serviceLic;

   


    @RequestMapping("/listarLic")
    public String listarLic(Model model, @Param("palabraClave") String palabraClave) {
        List<Licencia> licencia = serviceLic.listAllLic(palabraClave);
        model.addAttribute("licencias", licencia);
        model.addAttribute("palabraClave", palabraClave);
        return "listarLic";
    }

    @GetMapping("/newLic")
    public String agregarLic(Model model) {
        model.addAttribute("licencia", new Licencia());
        return "registrar_licencia";

    }

    @RequestMapping("/guardarLic")
    public String saveLic(@Validated Licencia l, Model model) {
        serviceLic.saveLic(l);
        return "redirect:/listarLic";
    }

    @GetMapping("/editarLic/{id}")
    public String editarLic(@PathVariable int id, Model model) {
        Optional<Licencia> licencia = serviceLic.listarIdLic(id);
        model.addAttribute("licencia", licencia);

        return "registrar_licencia";

    }

    @GetMapping("/eliminarLic/{id}")
    public String deleteLic(Model model, @PathVariable int id) {
        serviceLic.deleteLic(id);
        return "redirect:/listarLic";
    }

   

}

