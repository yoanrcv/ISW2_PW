package com.example.demo.interfaceService;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.EPractico;




public interface IEPracticoService{
  public List<EPractico>listAll(String palabraClave);
  public Optional<EPractico>listarIdPrac(int id);
  public int savePrac(EPractico p);
  public void deletePrac (int id);
}
