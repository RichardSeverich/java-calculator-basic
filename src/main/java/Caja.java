import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class Caja {
  private static Caja caja;
  private JTextField miCajaTexto;

  private Caja() {
    miCajaTexto = new JTextField();
    miCajaTexto.setBounds(15, 10, 295, 40);
    miCajaTexto.setFont(new Font("Arial", Font.PLAIN, 25));
    miCajaTexto.setForeground(new Color(0, 0, 0));
    miCajaTexto.setEnabled(false);
  }

  public JTextField getCaja() {
    return miCajaTexto;
  }

  public static Caja obtenerInstancia() {
    if (caja == null) {
      caja = new Caja();
    }
    return caja;
  }
}
