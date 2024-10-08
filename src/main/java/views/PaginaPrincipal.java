package views;

import javax.swing.*;
import java.util.ArrayList;

public class PaginaPrincipal extends JFrame{
  private JButton buttonIniciarSesion;
  private JButton buttonCrearUsuario;
  private JButton buttonSalir;
  private JLabel anuncio;

  public PaginaPrincipal(){
    this.buttonIniciarSesion = new JButton("Iniciar Sesion");
    this.buttonCrearUsuario = new JButton("Crear Usuario");
    this.buttonSalir = new JButton("Salir");
    this.anuncio = new JLabel();
    anuncio.setBounds(420, 250, 200, 100);
    this.buttonIniciarSesion.setBounds(150,100,180,60);
    this.buttonCrearUsuario.setBounds(400,100,180,60);
    this.buttonSalir.setBounds(700,100,180,60);
    this.add(buttonIniciarSesion);
    this.add(buttonCrearUsuario);
    this.add(buttonSalir);
    this.add(anuncio);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBounds(0,0,1000,800);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setLayout(null);
  }

  public ArrayList<JButton> getButtons(){
    ArrayList<JButton> buttons = new ArrayList<>();
    buttons.add(buttonIniciarSesion);
    buttons.add(buttonCrearUsuario);
    buttons.add(buttonSalir);
    return buttons;
  }

  public void desplegarMensaje(String mensaje){
    this.anuncio.setText(mensaje);
    revalidate();
    repaint();
  }
  
}
