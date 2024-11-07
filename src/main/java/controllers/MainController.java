package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import models.Hotel;
import views.PaginaPrincipal;
import views.PantallaCliente;

public class MainController implements ActionListener{
  static private PaginaPrincipal paginaP;
  public MainController(){
    paginaP = new PaginaPrincipal();
    for(JButton button: paginaP.getButtons())
      button.addActionListener(this);
  }
  
  public void start(){
    paginaP.setVisible(true);
  }

  public void actionPerformed(ActionEvent act) {
    if (act.getSource() == paginaP.getBtAcceder()) { // boton acceder

      /*
      if (usuarioValido(paginaP.getTxtUsuario().getText(), paginaP.getTxtContrasenha().getPassword())) {

      }

       */

      String usuario = paginaP.getTxtUsuario().getText();
      String Contra = paginaP.getTxtContrasenha().getText();
      Boolean xd = false;
      xd = Hotel.getInstancia().comprobadorCliente(usuario,Contra);
      System.out.println(xd);
      if(xd == true){
        //pantalla cliente
        new MenuUsuarioController().start();


      }
      Boolean xd_dos = false;
      xd_dos = Hotel.getInstancia().comprobadorTrabajador(usuario,Contra);
      System.out.println(xd_dos);
      if(xd_dos == true){
        //pantalla trabajador
        new MenuTrabajadorController().start();

      }



    } else if (act.getSource() == paginaP.getBtRegistrar()) { // boton registrar
      new CrearUsuarioController().start();
    } else if (act.getSource() == paginaP.getBtSalir()) { //boton salir
      System.out.println("Saliendo de SisteTurismo...");
      System.exit(0);
    }else if(act.getSource() == paginaP.getBtuno()){
      new CrearTrabajadorController().start();

    }


  }

  private boolean usuarioValido(String usuario, char password[]){
    if(usuario.isEmpty() || password.length == 0) return false;
    if(!usuario.matches("[a-zA-Z ]+")) return false;
    return true;
  }
}
