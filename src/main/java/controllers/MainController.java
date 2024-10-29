package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import views.PaginaPrincipal;

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

  public void actionPerformed(ActionEvent act){
    if(act.getSource() == paginaP.getBtAcceder()){ // boton acceder
      if(usuarioValido(paginaP.getTxtUsuario().getText(), paginaP.getTxtContrasenha().getPassword())){
        
      }
    }else if(act.getSource() == paginaP.getBtRegistrar()){ // boton registrar
      new CrearUsuarioController().start();
    }else if(act.getSource() == paginaP.getBtSalir()){ //boton salir
      System.out.println("Saliendo de SisteTurismo...");
      System.exit(0);
    }
  }

  private boolean usuarioValido(String usuario, char password[]){
    if(usuario.isEmpty() || password.length == 0) return false;
    if(!usuario.matches("[a-zA-Z ]+")) return false;
    return true;
  }
}
