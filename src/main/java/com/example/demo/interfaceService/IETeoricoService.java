package com.example.demo.interfaceService;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.ETeorico;



public interface IETeoricoService{
  public List<ETeorico>listAll(String palabraClave);
  public Optional<ETeorico>listarIdETeo(int id);
  public int saveETeo(ETeorico t);
  public void deleteETeo (int id);
}
