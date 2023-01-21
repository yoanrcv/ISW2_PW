package com.example.demo.interfaceService;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Curso;


public interface ICursoService{
  public List<Curso>listAll(String palabraClaveCur);
  public Optional<Curso>listarIdCur(int id);
  public int saveCur(Curso c);
  public void deleteCur(int id);
}
