import javax.swing.JFrame;

public class CajaTexto {

  public static void addCaja(Ventana miVentana) {
    Caja miCajaTexto = Caja.obtenerInstancia();
    JFrame miJFrame = miVentana.getJFrame();
    miJFrame.add(miCajaTexto.getCaja());
  }
}
