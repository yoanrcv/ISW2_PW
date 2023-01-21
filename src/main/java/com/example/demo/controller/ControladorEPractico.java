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

import com.example.demo.interfaceService.IEPracticoService;
import com.example.demo.model.EPractico;
@Controller
@RequestMapping
public class ControladorEPractico {
    @Autowired
    private IEPracticoService servicePrac;

    @RequestMapping("/listarPrac")
public String listarPrac(Model model, @Param("palabraClave") String palabraClave) {
    List<EPractico> epractico = servicePrac.listAll(palabraClave);
    model.addAttribute("epracticos", epractico);
    model.addAttribute("palabraClave", palabraClave);
    return "listarEPractico";
}

@GetMapping("/newPrac")
public String agregarPrac(Model model) {
    model.addAttribute("epractico", new EPractico());
    return "registrar_epractico";

}

@RequestMapping("/guardarPrac")
public String savePrac(@Validated EPractico p, Model model) {
    servicePrac.savePrac(p);
    return "redirect:/listarPrac";
}

@GetMapping("/editarPrac/{id}")
public String editarPrac(@PathVariable int id, Model model) {
    Optional<EPractico> epractico = servicePrac.listarIdPrac(id);
    model.addAttribute("epractico", epractico);

    return "registrar_epractico";

}
@GetMapping("/eliminarPrac/{id}")
    public String deletePrac(Model model, @PathVariable int id) {
        servicePrac.deletePrac(id);
        return "redirect:/listarPrac";
    }

    
}
