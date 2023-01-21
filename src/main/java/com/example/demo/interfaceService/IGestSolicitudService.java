package com.example.demo.interfaceService;
import java.util.List;
import java.util.Optional;
import com.example.demo.model.GestSolicitud;

public interface IGestSolicitudService{
  public List<GestSolicitud>listAll(String palabraClave);
  public Optional<GestSolicitud>listarIdG(int id);
  public int saveG(GestSolicitud g);
  public void deleteG(int id);
}