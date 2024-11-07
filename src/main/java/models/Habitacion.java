package models;

public class Habitacion {
  private String numeroHabitacion;
  private String tipo;
  private int precioNoche;
  private boolean disponible;

  private String idHabitacion;


  public Habitacion(String numeroHabitacion, String tipo, int precioNoche){
    this.numeroHabitacion = numeroHabitacion;
    this.tipo = tipo;
    this.precioNoche = precioNoche;
    this.disponible = disponible;


  }


  public String getId(){
    return idHabitacion;

  }

  // Getter y Setter para numeroHabitacion
  public String getNumeroHabitacion() {
    return numeroHabitacion;
  }

  public void setNumeroHabitacion(String numeroHabitacion) {
    this.numeroHabitacion = numeroHabitacion;
  }

  // Getter y Setter para tipo
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  // Getter y Setter para precioNoche
  public int getPrecioNoche() {
    return precioNoche;
  }

  public void setPrecioNoche(int precioNoche) {
    this.precioNoche = precioNoche;
  }

  // Getter y Setter para disponible
  public boolean isDisponible() {
    return disponible;
  }

  public void setDisponible(boolean disponible) {
    this.disponible = disponible;
  }


}



