package com.example.demo.interfaceService;
import java.util.List;
import java.util.Optional;


import com.example.demo.model.Usuario;

public interface IUsuarioService{
  public List<Usuario>listAll(String palabraClave);
  public Optional<Usuario>listarId(int id);
  public int save(Usuario u);
  public void delete (int id);
}