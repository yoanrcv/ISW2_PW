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

import com.example.demo.interfaceService.IModeloCTService;
import com.example.demo.model.ModeloCT;
@Controller
@RequestMapping
public class ControladorModeloCT {
    @Autowired
    private IModeloCTService serviceCT;


@RequestMapping("/listarCT")
public String listarCT(Model model,@Param("palabraClave")String palabraClave) {
    List<ModeloCT>modeloct=serviceCT.listAll(palabraClave);
    model.addAttribute("modeloct",modeloct);
    model.addAttribute("palabraClave",palabraClave);
    return "listarmodeloct";
}
@GetMapping("/newCT")
public String agregarCT(Model model){
    model.addAttribute("modeloct", new ModeloCT());
    return "registrar_modeloct";

}
@RequestMapping("/guardarCT")
public String saveCT(@Validated ModeloCT m ,Model model){
    serviceCT.saveCT(m);
        return "redirect:/listarCT";
}
 @GetMapping("/editarCT/{id}")
 public String editarCT(@PathVariable int id, Model model){
    Optional<ModeloCT>modeloct=serviceCT.listarId(id);
    model.addAttribute("modeloct", modeloct);

    return "registrar_modeloct";

 }
     @GetMapping("/eliminarCT/{id}")
public String deleteCT(Model model,@PathVariable int id){
    serviceCT.deleteCT(id);
    return "redirect:/listarCT";
}













    
}
