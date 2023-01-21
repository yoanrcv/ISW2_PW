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

import com.example.demo.interfaceService.IETeoricoService;
import com.example.demo.model.ETeorico;

@Controller
@RequestMapping
public class ControladorETeorico {
    @Autowired
    private IETeoricoService serviceETeo;

    @RequestMapping("/listarETeo")
public String listarETeo(Model model, @Param("palabraClave") String palabraClave) {
    List<ETeorico> eteorico = serviceETeo.listAll(palabraClave);
    model.addAttribute("eteorico",eteorico);
    model.addAttribute("palabraClave", palabraClave);
    return "listarETeorico";
}

@GetMapping("/newETeo")
public String agregarETeo(Model model) {
    model.addAttribute("eteorico", new ETeorico());
    return "registrar_eteorico";

}

@RequestMapping("/guardarETeo")
public String saveETeo(@Validated ETeorico t, Model model) {
    serviceETeo.saveETeo(t);
    return "redirect:/listarETeo";
}

@GetMapping("/editarETeo/{id}")
public String editarETeo(@PathVariable int id, Model model) {
    Optional<ETeorico> eteorico = serviceETeo.listarIdETeo(id);
    model.addAttribute("eteorico", eteorico);

    return "registrar_eteorico";

}

@GetMapping("/eliminarETeo/{id}")
public String deleteETeo(Model model, @PathVariable int id) {
    serviceETeo.deleteETeo(id);
    return "redirect:/listarETeo";
}


    
}
