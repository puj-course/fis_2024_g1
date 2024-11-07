package models;

import java.util.UUID;

public class Trabajador {
  private String nombre;
  private String idTrabajador;
  private String telefono;

  private String contra;

  private String extension;

  public Trabajador(String nombre, String telefono, String extension,String contra) {
    this.nombre = nombre;
    this.contra = contra;

    this.telefono = telefono;
    this.extension = extension;
  }



  public void generarIDAleatorio() {
    // Genera un ID único aleatorio usando UUID
    idTrabajador = UUID.randomUUID().toString();

  }

  // Getter y Setter para nombre
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  // Getter y Setter para idTrabajador
  public String getIdTrabajador() {
    return idTrabajador;
  }

  public void setIdTrabajador(String idTrabajador) {
    this.idTrabajador = idTrabajador;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getContra(){return contra;}


  // Getter y Setter para cargo
}
