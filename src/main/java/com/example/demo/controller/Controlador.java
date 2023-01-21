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


import com.example.demo.interfaceService.IUsuarioService;

import com.example.demo.model.Usuario;


@Controller
@RequestMapping

public class Controlador {
    @Autowired
    private IUsuarioService service;
  

@RequestMapping(path = {"/","/principal"})
public String principal(){
    return "Principal";
}


/*Metodos de la clase usuario */

    @RequestMapping("/listar")
    public String listar(Model model,@Param("palabraClave")String palabraClave) {
        List<Usuario>usuario=service.listAll(palabraClave);
        model.addAttribute("usuarios",usuario);
        model.addAttribute("palabraClave",palabraClave);
        return "index";
    }
    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("usuario", new Usuario());
        return "registrar_usuario";

    }
    @RequestMapping("/guardar")
    public String save(@Validated Usuario u ,Model model){
        service.save(u);
            return "redirect:/listar";
    }
     @GetMapping("/editar/{id}")
     public String editar(@PathVariable int id, Model model){
        Optional<Usuario>usuario=service.listarId(id);
        model.addAttribute("usuario", usuario);

        return "registrar_usuario";
    
     }
         @GetMapping("/eliminar/{id}")
    public String delete(Model model,@PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }

}


