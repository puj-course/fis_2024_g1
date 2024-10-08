import javax.swing.*;
import java.awt.event.*;

public class Interfaz extends JFrame implements ActionListener{
  private JLabel label;
  private JButton button;

  public Interfaz(){

    this.label = new JLabel("Menu Principal Siste Turismo");
    this.label.setBounds(410, 2, 200, 100);

    this.button = new JButton("Ingresar");
    this.button.setBounds(440, 100, 100, 50);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(button);
    add(label);
    setBounds(0,0,1000,800);
    setLocationRelativeTo(null);
    setResizable(false);
    setLayout(null);
    this.button.addActionListener(this);
  }

  public void actionPerformed(ActionEvent action){
    if(action.getSource() == button){
      JLabel anuncio = new JLabel("Usted dijito ingresar");
      anuncio.setBounds(420, 250, 200, 100);
      add(anuncio);
      revalidate();
      repaint();
    }
  }
}
