package com.example.demo.interfaceService;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.ModeloCT;


public interface IModeloCTService{
  public List<ModeloCT>listAll(String palabraClave);
  public Optional<ModeloCT>listarId(int id);
  public int saveCT(ModeloCT m);
  public void deleteCT (int id);
}