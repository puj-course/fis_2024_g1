package models;

import com.twilio.type.Client;

import java.util.List;

public class Sistema {

    private static Sistema instancia;
   private List<Hotel> hoteles;
   private List<Cliente> clientes;
   private List<Trabajador> trabajadores;

    // Constructor privado para evitar instanciación externa
    private Sistema() {
        // Inicializa los atributos si es necesario
    }

    // Método público para obtener la única instancia de la clase
    public static Sistema getInstancia() {
        if (instancia == null) {
            instancia = new Sistema();
        }
        return instancia;
    }

    // Getters y Setters para los atributos

    public List<Hotel> getHoteles() {
        return hoteles;
    }

    public void setHoteles(List<Hotel> hoteles) {
        this.hoteles = hoteles;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(List<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }
}
