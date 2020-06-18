import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EventosOperaciones implements ActionListener {
  Double numero1 = 0.0;
  Double numero2 = 0.0;
  String operacion = "";

  public void actionPerformed(ActionEvent evento) {
    Caja miCajaTexto = Caja.obtenerInstancia();
    StringBuilder stringBuilder = Contenedor.obtenerInstancia().stringBuilder;
    switch (evento.getActionCommand()) {
      case "+":
        if (stringBuilder.length() != 0) {
          numero1 = Double.parseDouble(stringBuilder.toString());
        }
        stringBuilder.setLength(0);
        operacion = "+";
        break;
      case "-":
        if (stringBuilder.length() != 0) {
          numero1 = Double.parseDouble(stringBuilder.toString());
        }
        stringBuilder.setLength(0);
        operacion = "-";
        break;
      case "*":
        if (stringBuilder.length() != 0) {
          numero1 = Double.parseDouble(stringBuilder.toString());
        }
        stringBuilder.setLength(0);
        operacion = "*";
        break;
      case "/":
        if (stringBuilder.length() != 0) {
          numero1 = Double.parseDouble(stringBuilder.toString());
        }
        stringBuilder.setLength(0);
        operacion = "/";
        break;
      case "=":
        numero2 = Double.parseDouble(stringBuilder.toString());
        stringBuilder.setLength(0);
        switch (operacion) {
          case "+":
            stringBuilder.append(Double.toString(numero1 + numero2));
            break;
          case "-":
            stringBuilder.append(Double.toString(numero1 - numero2));
            break;
          case "*":
            stringBuilder.append(Double.toString(numero1 * numero2));
            break;
          case "/":
            stringBuilder.append(Double.toString(numero1 / numero2));
            break;
          default:
        }
        miCajaTexto.getCaja().setText(stringBuilder.toString());
        numero1 = (numero1 / numero2);
        numero2 = 0.0;
        break;
      default:
    }
  }
}
