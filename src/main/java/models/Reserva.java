package models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Reserva {
  private String idReserva;
  private String fechaInicio;
  private String fechaFinal;
  private String estado;
  private Habitacion habitacion;
  private  Cliente cliente;

  private boolean cumplida;

  private String mediopago;

  public Reserva(Habitacion habitacion, String fechaInicio, String fechaFinal,String estado,Cliente cliente,String mediopago, boolean cumplida) {
    this.idReserva = idReserva;
    this.fechaInicio = fechaInicio;
    this.fechaFinal = fechaFinal;
    this.estado = estado;
    this.habitacion = habitacion;
    this.cliente = cliente;
    this.mediopago = mediopago;
    this.cumplida = cumplida;
  }

  public String getIdReserva() {
    return idReserva;
  }

  public void setIdReserva(String idReserva) {
    this.idReserva = idReserva;
  }


  public String getFechaInicio() {
    return fechaInicio;
  }

  public void setFechaInicio(String fechaInicio) {
    this.fechaInicio = fechaInicio;
  }

  public String getFechaFinal() {
    return fechaFinal;
  }

  public void setFechaFinal(String fechaFinal) {
    this.fechaFinal = fechaFinal;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public Habitacion getHabitacion() {
    return habitacion;
  }

  public void setHabitacion(Habitacion habitacion) {
    this.habitacion = habitacion;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }


  public String getMediopago() {
    return mediopago;
  }

  public void setMediopago(String mediopago) {
    this.mediopago = mediopago;
  }

  public boolean isCumplida() {
    return cumplida;
  }

  public void setCumplida(boolean cumplida) {
    this.cumplida = cumplida;
  }
}
