package controllers;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import views.PaginaCrearUsuario;
import models.Cliente;
/**
 *
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
    public void actionPerformed(ActionEvent e) {
        ArrayList<JButton> buttons = paginaCrearUsuario.getButtons();
      if(e.getSource() == buttons.get(0)){
        Cliente cliente = paginaCrearUsuario.mostrarUsuario();
        String AUTH_TOKEN = "";
        String ACCOUNT_SID = "";
        String numberFrom = "+19793832872";
      
        Twilio.init(ACCOUNT_SID,AUTH_TOKEN);
        
        Message mensaje = Message.creator(
                      new PhoneNumber(cliente.getTelefono()),
                      new PhoneNumber(numberFrom),
                      "Hola " + cliente.getNombre() + ". Tu usuario ha sido creado"
                      ).create();
      }else if(e.getSource() == buttons.get(1)){  
        paginaCrearUsuario.setVisible(false);
        paginaCrearUsuario.repaint();
      }
    }
}
