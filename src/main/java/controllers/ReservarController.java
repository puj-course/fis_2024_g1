package controllers;

import models.Hotel;
import views.PantallaCliente;
import views.PantallaReservar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Habitacion;
import models.Reserva;

public class ReservarController implements ActionListener {
    static private PantallaReservar pantallaReservar;
    StringBuilder sb = new StringBuilder();

    public ReservarController(){
        pantallaReservar = new PantallaReservar();
        for(JButton button : pantallaReservar.getButtons())
            button.addActionListener(this);
    }

    public void start(){pantallaReservar.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == pantallaReservar.getBtAcceder1()) {

            for (Habitacion h : Hotel.getInstancia().getHabitaciones()) {
                sb.append("Número de habitación: ").append(h.getNumeroHabitacion()).append("\n");
                sb.append("Tipo: ").append(h.getTipo()).append("\n");
                sb.append("Precio por noche: ").append(h.getPrecioNoche()).append("\n");
                sb.append("Disponibilidad: ").append(h.isDisponible()).append("\n");
                sb.append("------------------------------------\n");
            }
            pantallaReservar.getjTextArea1().setText(sb.toString());

            // Establecer el contenido del JTextArea con la información de las habitaciones
            //textArea.setText(sb.toString());
        }

        if(e.getSource() == pantallaReservar.getBtAcceder()){
            String Habitacion = pantallaReservar.getjTextField1().getText();
            String FechaInicio =pantallaReservar.getjTextField3().getText();
            String FechaFinal = pantallaReservar.getjTextField2().getText();
            String nombre = pantallaReservar.getjTextField4().getText();

            Reserva reserva = new Reserva(Hotel.getInstancia().obtencionHabitacion(Habitacion),FechaInicio,FechaFinal,"Ocupado",Hotel.getInstancia().obtencionCliente(nombre),"",false);
            Hotel.getInstancia().addReserva(reserva);
            System.out.println("Se reservo");

        }





        }


    }

