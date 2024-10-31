package models;

import contracts.ContractModel;

public class Cliente implements ContractModel{
  private String nombre;
  private String idCliente;
  private String email;
  private String telefono;
  private String medioPago;
  public Cliente(String nombre, String email, String telefono, String medioPago){
    this.nombre = nombre;
    this.email = email;
    this.telefono = telefono;
    this.medioPago = medioPago;
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

  @Override
  public String scriptInsertarSQL() {
    return 
    "INSERT INTO cliente "+
    "(nombre,email,telefono,medioPago) "+
    "VALUES ("+nombre+","+email+","+telefono+","+medioPago+")";
  }

}
