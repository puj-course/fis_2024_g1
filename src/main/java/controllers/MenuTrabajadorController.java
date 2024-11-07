package controllers;

import views.PantallaCliente;
import views.PantallaTrabajador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuTrabajadorController implements ActionListener {
    static private PantallaTrabajador paginatrabajador;

    public MenuTrabajadorController(){
        paginatrabajador = new PantallaTrabajador();
        for(JButton button : paginatrabajador.getButtons())
            button.addActionListener(this);
    }

    public void start(){paginatrabajador.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == paginatrabajador.getjButton2()){

            new HabitacionController().start();



        }

    }
}
