import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Eventos implements ActionListener {

  public void actionPerformed(ActionEvent evento) {
    Caja miCajaTexto = Caja.obtenerInstancia();
    StringBuilder stringBuilder = Contenedor.obtenerInstancia().stringBuilder;
    switch (evento.getActionCommand()) {
      case "1":
        stringBuilder.append(1);
        break;
      case "2":
        stringBuilder.append(2);
        break;
      case "3":
        stringBuilder.append(3);
        break;
      case "4":
        stringBuilder.append(4);
        break;
      case "5":
        stringBuilder.append(5);
        break;
      case "6":
        stringBuilder.append(6);
        break;
      case "7":
        stringBuilder.append(7);
        break;
      case "8":
        stringBuilder.append(8);
        break;
      case "9":
        stringBuilder.append(9);
        break;
      case "0":
        stringBuilder.append(0);
        break;
      case ".":
        stringBuilder.append(".");
        break;
      default:
    }
    miCajaTexto.getCaja().setText(stringBuilder.toString());
  }
}
