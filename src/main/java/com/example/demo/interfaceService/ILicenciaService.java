package com.example.demo.interfaceService;
import java.util.List;
import java.util.Optional;
import com.example.demo.model.Licencia;


public interface ILicenciaService{
  public List<Licencia>listAllLic(String palabraClaveLic);
  public Optional<Licencia>listarIdLic(int id);
  public int saveLic(Licencia l);
  public void deleteLic (int id);
}
