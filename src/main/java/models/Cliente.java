package models;

import contracts.ContractModel;


import java.util.UUID;
public class Cliente implements ContractModel{
  private String nombre;
  private String idCliente;
  private String email;
  private String telefono;

  private String contra;
  private String medioPago;
  private String extension;
  public Cliente(String nombre, String email, String telefono, String medioPago, String contra, String extension){
    this.nombre = nombre;
    this.email = email;
    this.telefono = telefono;
    this.medioPago = medioPago;
    this.contra = contra;
    this.idCliente = idCliente;
    this.extension = extension;
  }


  public void setId(String id){
    this.idCliente = id;

  }
  public String getNombre() {
      return nombre;
  }
  public String getEmail() {
      return email;
  }
  public String getTelefono() {
      return telefono;
  }

  public String getContra(){return  contra;}
  public void setIdCliente(String id){
     this.idCliente = id;
  }
  public String getIdCliente(){return idCliente;}

  public void generarIDAleatorio() {
    // Genera un ID único aleatorio usando UUID
    idCliente = UUID.randomUUID().toString();
  }

  public String getMedioPago() { return medioPago; }

  public String getExtension() { return extension; }

  @Override
  public String scriptInsertarSQL() {
    return 
    "INSERT INTO cliente "+
    "(nombre,email,telefono,medioPago) "+
    "VALUES ("+nombre+","+email+","+telefono+","+medioPago+")";
  }

}
