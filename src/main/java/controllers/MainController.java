package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import views.PaginaPrincipal;

public class MainController implements ActionListener{
  static private PaginaPrincipal paginaP;
  static private CrearUsuarioController crearUsuario;
  public MainController(){
    paginaP = new PaginaPrincipal();
    crearUsuario = new CrearUsuarioController();
    for(JButton button: paginaP.getButtons())
      button.addActionListener(this);
  }
  
  public void start(){
    paginaP.setVisible(true);
  }

  public void actionPerformed(ActionEvent act){
    ArrayList<JButton> buttons = paginaP.getButtons();
      if(act.getSource() == buttons.get(0)){
        paginaP.desplegarMensaje("Ingresando");
      }else if(act.getSource() == buttons.get(1)){  
        crearUsuario.start();
      }else if(act.getSource() == buttons.get(2)){
        paginaP.desplegarMensaje("Gracias por usar Siste Turismo");
        System.exit(0);
      }
  }
}
