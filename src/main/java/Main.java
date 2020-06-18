public class Main{

  public static void main(String[] args) {
    Ventana miVentana = new Ventana();
    AnadirBoton.add(miVentana);
    CajaTexto.addCaja(miVentana);
    miVentana.getJFrame().setVisible(true);
  }
}
