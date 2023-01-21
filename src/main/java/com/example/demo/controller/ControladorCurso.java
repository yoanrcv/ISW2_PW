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

import com.example.demo.interfaceService.ICursoService;
import com.example.demo.model.Curso;


@Controller
@RequestMapping
public class ControladorCurso {
    @Autowired
    private ICursoService serviceCur;
    
    @GetMapping("/listarCur")
    public String listarCur(Model model, @Param("palabraClave") String palabraClave) {
        List<Curso> curso = serviceCur.listAll(palabraClave);
        model.addAttribute("cursos", curso);
        model.addAttribute("palabraClave", palabraClave);
        return "listarCurso";
    }

    @GetMapping("/newCur")
    public String agregarCur(Model model) {
        model.addAttribute("curso", new Curso());
        return "registrar_curso";

    }

    @RequestMapping("/guardarCur")
    public String saveCur(@Validated Curso c, Model model) {
        serviceCur.saveCur(c);
        return "redirect:/listarCur";
    }

    @GetMapping("/editarCur/{id}")
    public String editarCur(@PathVariable int id, Model model) {
        Optional<Curso> curso = serviceCur.listarIdCur(id);
        model.addAttribute("curso", curso);

        return "registrar_curso";

    }

    @GetMapping("/eliminarCur/{id}")
    public String deleteCur(Model model, @PathVariable int id) {
        serviceCur.deleteCur(id);
        return "redirect:/listarCur";
    }

    
}
