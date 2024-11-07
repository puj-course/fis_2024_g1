package controllers;

import models.Habitacion;
import models.Hotel;
import views.PantallaCliente;
import views.PantallaCrearHabi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HabitacionController implements ActionListener {
    static private PantallaCrearHabi paginaHabi;

    public HabitacionController(){
        paginaHabi = new PantallaCrearHabi();
        for(JButton button : paginaHabi.getButtons())
            button.addActionListener(this);
    }

    public void start(){paginaHabi.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == paginaHabi.getjButton3()){
            String numeroHabi = paginaHabi.getTxtUsuario().getText();
            String Tipo = paginaHabi.getTxtUsuario2().getText();
            String Precio = paginaHabi.getTxtUsuario1().getText();
            int precio =  Integer.parseInt(Precio);

            if(Hotel.getInstancia().comprobarHabitacion(numeroHabi) == true){

                System.exit(0);

            }else {

                Habitacion habi = new Habitacion(numeroHabi, Tipo, precio);
                Hotel.getInstancia().addHabitacion(habi);
                System.out.println("Se inserto habitacion");

            }








        }

    }
}
