package controllers;

import models.Habitacion;
import models.Hotel;
import views.PaginaCheckIn;
import views.PantallaCliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Reserva;

public class CheckInController implements ActionListener {
    static private PaginaCheckIn paginaCheckIn;
    StringBuilder sb = new StringBuilder();


    public CheckInController(){
        paginaCheckIn = new PaginaCheckIn();
        for(JButton button : paginaCheckIn.getButtons())
            button.addActionListener(this);
    }

    public void start() {
        paginaCheckIn.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == paginaCheckIn.getBtCrear()){
            String Nombre = paginaCheckIn.getjTextField1().getText();
            String Pago = paginaCheckIn.getjTextField2().getText();

            Hotel.getInstancia().obtencionReserva(Nombre).setEstado("Ocupada");
            Hotel.getInstancia().obtencionReserva(Nombre).setMediopago(Nombre);

            JOptionPane.showMessageDialog(null, "Operación realizada con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);


        }

        if(e.getSource() == paginaCheckIn.getBtCrear1()){
            //String Nombre = paginaCheckIn.getjTextField1().getText();

            for (Reserva h : Hotel.getInstancia().getReservas()) {
                System.out.println("ID reserva: " + h.getIdReserva());
                System.out.println("Fecha inicio: " + h.getFechaInicio());
                System.out.println("Fecha final: " + h.getFechaFinal());
                System.out.println("Estado: " + h.getEstado());
                System.out.println("Número habitación: " + h.getHabitacion().getNumeroHabitacion());
                System.out.println("Cliente: " + h.getCliente().getNombre());
                System.out.println("Medio de Pago: " + h.getMediopago());
                System.out.println("Cumplido: " + h.isCumplida());
                System.out.println("------------------------------------");
            }

            sb.setLength(0);
            for (Reserva h : Hotel.getInstancia().getReservas()) {
                sb.append("ID reserva: ").append(h.getIdReserva()).append("\n");
                sb.append("fecha inicio: ").append(h.getFechaInicio()).append("\n");
                sb.append("fecha final: ").append(h.getFechaFinal()).append("\n");
                sb.append("Estado: ").append(h.getEstado()).append("\n");
                sb.append("Numero habitacion: ").append(h.getHabitacion().getNumeroHabitacion()).append("\n");
                sb.append("Cliente: ").append(h.getCliente().getNombre()).append("\n");
                sb.append("MedioPago: ").append(h.getMediopago()).append("\n");
                sb.append("Cumplido: ").append(h.isCumplida()).append("\n");
                sb.append("------------------------------------\n");
            }


           paginaCheckIn.getjTextArea1().setText(sb.toString());

            // Establecer el contenido del JTextArea con la información de las habitaciones
            //textArea.setText(sb.toString());


        }


    }
}
