package models;

import java.text.DateFormat;

public class Reserva {
  private String idReserva;
  private DateFormat fechaInicio;
  private DateFormat fechaFinal;
  private String estado;
  Habitacion habitacion;
  Cliente cliente;
}
