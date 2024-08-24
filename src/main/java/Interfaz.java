import javax.swing.*;

public class Interfaz extends JFrame{
  private JLabel label;

  public Interfaz(){
    setLayout(null);
    this.label = new JLabel("Esto es una Interfaz de ejemplo");
    this.label.setBounds(90, 20, 200, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add(label);
    this.setBounds(100,200,500,400);
  }
}
