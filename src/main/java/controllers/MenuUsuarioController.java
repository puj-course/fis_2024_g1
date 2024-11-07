package controllers;

import views.PaginaCheckIn;
import views.PaginaCrearTrabajador;
import views.PantallaCliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUsuarioController implements ActionListener {
    static private PantallaCliente paginaCliente;


    public MenuUsuarioController(){
        paginaCliente = new PantallaCliente();
        for(JButton button : paginaCliente.getButtons())
            button.addActionListener(this);
    }

    public String nombreUsuario(String nombre){return nombre; }

    public void start(){paginaCliente.setVisible(true);
    }





    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == paginaCliente.getjButton2()){

            new ReservarController().start();

        }

        if(e.getSource() == paginaCliente.getjButton3()){

          new CheckInController().start();
        }

    }
}
