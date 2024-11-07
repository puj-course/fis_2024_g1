package models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Random;
public class Hotel {
  private List<Cliente> clientes;
  private List<Reserva> reservas;
  private List<Trabajador> trabajadores;
  private List<Habitacion> habitaciones;

  private static Hotel instancia;


  private Hotel() {
    // Inicializa los atributos si es necesario
    this.clientes = new ArrayList<>();
    this.trabajadores = new ArrayList<>();
    this.habitaciones = new ArrayList<>();
    this.reservas = new ArrayList<>();

  }

  public static Hotel getInstancia() {
    if (instancia == null) {
      instancia = new Hotel();
    }
    return instancia;
  }


  public Habitacion obtencionHabitacion(String numero) {
    for (Habitacion t : habitaciones) {
      if (t.getNumeroHabitacion().equals(numero)) {
        return t; // Se encuentra la habitación y se devuelve
      }
    }

    return null; // Si no se encuentra la habitación, se retorna null
  }


  public Cliente obtencionCliente (String id) {
    for (Cliente t : clientes) {
      if (t.getIdCliente().equals(id)) {
        return t; // Se encuentra la habitación y se devuelve
      }
    }

    return null; // Si no se encuentra la habitación, se retorna null
  }



  public Reserva obtencionReserva(String id) {
    for (Reserva t : reservas) {
      if (t.getCliente().getIdCliente().equals(id)) {
        return t; // Se encuentra la habitación y se devuelve
      }
    }

    return null; // Si no se encuentra la habitación, se retorna null
  }



  public List<Cliente> getClientes() {
    return clientes;
  }

  public void setClientes(List<Cliente> clientes) {
    this.clientes = clientes;
  }

  public List<Reserva> getReservas() {
    return reservas;
  }

  public void setReservas(List<Reserva> reservas) {
    this.reservas = reservas;
  }

  public List<Trabajador> getTrabajadores() {
    return trabajadores;
  }

  public void setTrabajadores(List<Trabajador> trabajadores) {
    this.trabajadores = trabajadores;
  }

  public List<Habitacion> getHabitaciones() {
    return habitaciones;
  }

  public void setHabitaciones(List<Habitacion> habitaciones) {
    this.habitaciones = habitaciones;
  }

  // Método para agregar un cliente individual a la lista
  public void addCliente(Cliente cliente) {
    this.clientes.add(cliente);
  }

  // Método para agregar una reserva individual a la lista
  public void addReserva(Reserva reserva) {
    this.reservas.add(reserva);
    System.out.println("Se agrego reservas");
    for (Reserva h : Hotel.getInstancia().getReservas()) {
      System.out.println("ID reserva: " + h.getCliente().getIdCliente());
      System.out.println("Fecha inicio: " + h.getFechaInicio());
      System.out.println("Fecha final: " + h.getFechaFinal());
      System.out.println("Estado: " + h.getEstado());
      System.out.println("Número habitación: " + h.getHabitacion().getNumeroHabitacion());
      System.out.println("Cliente: " + h.getCliente().getNombre());
      System.out.println("Medio de Pago: " + h.getMediopago());
      System.out.println("Cumplido: " + h.isCumplida());
      System.out.println("------------------------------------");
    }


  }


  // Método para agregar un trabajador individual a la lista
  public void addTrabajador(Trabajador trabajador) {
    this.trabajadores.add(trabajador);
  }


  // Método para agregar una habitación individual a la lista
  public void addHabitacion(Habitacion habitacion) {
    this.habitaciones.add(habitacion);
  }




  // Método para generar un ID aleatorio corto
  private String generarIdCorto() {
    String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    Random random = new Random();
    StringBuilder id = new StringBuilder(5);  // Crear un StringBuilder para construir el ID

    for (int i = 0; i < 5; i++) {
      id.append(caracteres.charAt(random.nextInt(caracteres.length())));  // Añadir un carácter aleatorio
    }
    return id.toString();  // Convertir el StringBuilder a una cadena y devolverlo
  }

  // Método para generar el ID basado en el valor del parámetro 'uno'
  public String generarIDAleatorio(int uno) {
    if (uno == 1) { // Generar ID para Cliente
      String idCliente = "";

      // Generar un ID aleatorio único
      boolean de = true;
      while (de) {
        idCliente = generarIdCorto();  // Llamar al método para generar un ID corto
        de = false;
        for (Cliente c : clientes) {
          if (idCliente.equals(c.getIdCliente())) {
            de = true;
            break;
          }
        }
      }
      return idCliente;

    } else if (uno == 2) { // Generar ID para Reserva
      String idReserva = "";

      // Generar un ID aleatorio único
      boolean de = true;
      while (de) {
        idReserva = generarIdCorto();  // Llamar al método para generar un ID corto
        de = false;
        for (Reserva r : reservas) {
          if (idReserva.equals(r.getIdReserva())) {
            de = true;
            break;
          }
        }
      }
      return idReserva;

    } else if (uno == 3) { // Generar ID para Trabajador
      String idTrabajador = "";

      // Generar un ID aleatorio único
      boolean de = true;
      while (de) {
        idTrabajador = generarIdCorto();  // Llamar al método para generar un ID corto
        de = false;
        for (Trabajador t : trabajadores) {
          if (idTrabajador.equals(t.getIdTrabajador())) {
            de = true;
            break;
          }
        }
      }
      return idTrabajador;

    } else if (uno == 4) { // Generar ID para Habitación
      String idHabitacion = "";

      // Generar un ID aleatorio único
      boolean de = true;
      while (de) {
        idHabitacion = generarIdCorto();  // Llamar al método para generar un ID corto
        de = false;
        for (Habitacion h : habitaciones) {
          if (idHabitacion.equals(h.getId())) {
            de = true;
            break;
          }
        }
      }
      return idHabitacion;
    }

    return null; // Retorna null si no se cumple ninguna condición
  }



  public boolean comprobadorTrabajador(String id, String contraseña) {
    // Recorremos la lista de trabajadores
    for (Trabajador trabajador : trabajadores) {
      if (trabajador.getIdTrabajador().equals(id) && trabajador.getContra().equals(contraseña)) {
        return true;  // Trabajador encontrado
      }
    }

    return false;  // No se encontró ni usuario ni trabajador con esas credenciales
  }


  public boolean comprobarHabitacion(String numero) {
    for(Habitacion habitacion: habitaciones){
      if(habitacion.getNumeroHabitacion().equals(numero)){

        return true;

      }
    }

    return false;
  }





  public boolean comprobadorCliente(String id, String contraseña) {
    // Recorremos la lista de usuarios
    for (Cliente usuario : clientes) {
      if (usuario.getIdCliente().equals(id) && usuario.getContra().equals(contraseña)) {
        return true;  // Usuario encontrado
      }
    }
    return false;
  }
}





