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

import com.example.demo.interfaceService.IGestSolicitudService;
import com.example.demo.model.GestSolicitud;
@Controller
@RequestMapping
public class ControladorGestSolicitud {
    @Autowired
    private IGestSolicitudService serviceG;

    @RequestMapping("/listarG")
public String listarG(Model model,@Param("palabraClave")String palabraClave) {
    List<GestSolicitud>gestsolicitud=serviceG.listAll(palabraClave);
    model.addAttribute("gestsolicituds",gestsolicitud);
    model.addAttribute("palabraClave",palabraClave);
    return "listar_solicitud";
}
@GetMapping("/newG")
public String agregarG(Model model){
    model.addAttribute("gestsolicitud", new GestSolicitud());
    return "registrar_solicitud";

}
@RequestMapping("/guardarG")
public String saveG(@Validated GestSolicitud g ,Model model){
    serviceG.saveG(g);
        return "redirect:/listarG";
}
 @GetMapping("/editarG/{id}")
 public String editarG(@PathVariable int id, Model model){
    Optional<GestSolicitud>gestsolicitud=serviceG.listarIdG(id);
    model.addAttribute("gestsolicitud", gestsolicitud);

    return "registrar_solicitud";

 }
     @GetMapping("/eliminarG/{id}")
public String deleteG(Model model,@PathVariable int id){
    serviceG.deleteG(id);
    return "redirect:/listarG";
}


    
}
