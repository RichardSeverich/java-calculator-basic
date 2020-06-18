import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;

public class Boton {
  private JButton miJButton;
  Eventos miEventos = new Eventos();

  public Boton(String nomBoton) {
    miJButton = new JButton(nomBoton);
  }

  public JButton getJButton() {
    miJButton.setSize(new Dimension(70, 50));
    miJButton.setBackground(new Color(0, 0, 0));
    miJButton.setForeground(new Color(255, 255, 255));
    miJButton.setFont(new Font("Arial", Font.PLAIN, 25));
    return miJButton;
  }
}
