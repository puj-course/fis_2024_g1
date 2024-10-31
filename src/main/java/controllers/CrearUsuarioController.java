package controllers;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import views.PaginaCrearUsuario;
import models.Cliente;
import models.Modelo;
/**
 * @author erick
 */
public class CrearUsuarioController implements ActionListener{
  static private PaginaCrearUsuario paginaCrearUsuario;
  public CrearUsuarioController(){
    paginaCrearUsuario = new PaginaCrearUsuario();
    for(JButton button : paginaCrearUsuario.getButtons())
      button.addActionListener(this);
  }
  
  public void start(){
    paginaCrearUsuario.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent act) {
    if(act.getSource() == paginaCrearUsuario.getBtCrear()){
      Cliente nuevoUsuario = usuarioValido(
                      paginaCrearUsuario.getTxtNombre().getText(),
                      paginaCrearUsuario.getTxtTelefono().getText(), 
                      paginaCrearUsuario.getTxtEmail().getText(),
                      paginaCrearUsuario.getTxtExtension().getText(),
                      paginaCrearUsuario.getTxtContrasenha().getText(),
                      (String)paginaCrearUsuario.getCmboxMetodoPago().getSelectedItem());
      if(nuevoUsuario != null){
        Modelo.saveClient(nuevoUsuario);
        enviarMensajeTexto(
          "Hola" + paginaCrearUsuario.getTxtNombre().getText() + ". Tu usuario ha sido creado",
          nuevoUsuario.getTelefono());
      }
    }else if(act.getSource() == paginaCrearUsuario.getBtSalir()){  
      paginaCrearUsuario.setVisible(false);
      paginaCrearUsuario.repaint();
    }
  }

  private void enviarMensajeTexto(String sendMessage, String number) {
    String AUTH_TOKEN = "";
    String ACCOUNT_SID = "";
    String numberFrom = "+19793832872";
    Twilio.init(ACCOUNT_SID,AUTH_TOKEN);
    Message mensaje = Message.creator
      (new PhoneNumber(number),
      new PhoneNumber(numberFrom), sendMessage)
      .create();
  }

  private Cliente usuarioValido(String nombre, String telefono, String email, String extension, String password, String medioPago) {
    // verifica y despliega un mensaje para que el usuario sepa que campos falta por llenar

    if(nombre == null) System.out.println("nombre");
    if(telefono == null) System.out.println("telefono");
    if(email == null) System.out.println("email");
    if(extension == null) System.out.println("extension");
    if(password == null) System.out.println("password");
    if(medioPago == null) System.out.println("medioPago");
    
    if(nombre.isEmpty() || telefono.isEmpty() || email.isEmpty()|| extension.isEmpty()|| password.isEmpty()){
      JOptionPane.showMessageDialog(
        paginaCrearUsuario,
        "Alguno de los campos esta vacio",
        "Error - Campos",
        JOptionPane.ERROR_MESSAGE);
      return null;
    }

    // expresiones regulares para verificar la estructura de la informacion que dijita el usuario
    if(!telefono.matches("^[0-9]+$") || !extension.matches("^[0-9]+$")) {
      JOptionPane.showMessageDialog(
        paginaCrearUsuario,
        "Solo valores numericos para \"Telefono\" y \"extension\"",
        "Error - Telefono/Extension",
        JOptionPane.ERROR_MESSAGE);
      return null;
    }

    if(!nombre.matches("[a-zA-Z ]+")) {
      JOptionPane.showMessageDialog(
        paginaCrearUsuario,
        "Caracteres no validos para nombre",
        "Error - Nombre",
        JOptionPane.ERROR_MESSAGE);
      return null;
    }

    if(!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) { 
      JOptionPane.showMessageDialog(
        paginaCrearUsuario,
        "Estructura no valida para email",
        "Error - Email",
        JOptionPane.ERROR_MESSAGE);
      return null;
    }
    
    return new Cliente(nombre, email,"+"+extension+telefono, medioPago);
  }
}
