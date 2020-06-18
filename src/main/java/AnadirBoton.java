import javax.swing.JFrame;

public class AnadirBoton {
  public static void add(Ventana miVentana) {
    // instanciando "Boton"
    Boton miBoton1 = new Boton("1");
    Boton miBoton2 = new Boton("2");
    Boton miBoton3 = new Boton("3");
    Boton miBoton4 = new Boton("4");
    Boton miBoton5 = new Boton("5");
    Boton miBoton6 = new Boton("6");
    Boton miBoton7 = new Boton("7");
    Boton miBoton8 = new Boton("8");
    Boton miBoton9 = new Boton("9");
    Boton miBoton0 = new Boton("0");
    Boton miBotonMas = new Boton("+");
    Boton miBotonMenos = new Boton("-");
    Boton miBotonPor = new Boton("*");
    Boton miBotonEntre = new Boton("/");
    Boton miBotonIgual = new Boton("=");
    Boton miBotonPunto = new Boton(".");
    // posicionar botones
    miBoton1.getJButton().setLocation(15, 165);
    miBoton2.getJButton().setLocation(90, 165);
    miBoton3.getJButton().setLocation(165, 165);
    miBoton4.getJButton().setLocation(15, 110);
    miBoton5.getJButton().setLocation(90, 110);
    miBoton6.getJButton().setLocation(165, 110);
    miBoton7.getJButton().setLocation(15, 55);
    miBoton8.getJButton().setLocation(90, 55);
    miBoton9.getJButton().setLocation(165, 55);
    miBoton0.getJButton().setLocation(15, 220);
    miBotonMas.getJButton().setLocation(90, 220);
    miBotonMenos.getJButton().setLocation(165, 220);
    miBotonPor.getJButton().setLocation(240, 55);
    miBotonEntre.getJButton().setLocation(240, 110);
    miBotonPunto.getJButton().setLocation(240, 165);
    miBotonIgual.getJButton().setLocation(240, 220);
    // Anadir eventos
    Eventos misEventos = new Eventos();
    miBoton1.getJButton().addActionListener(misEventos);
    miBoton2.getJButton().addActionListener(misEventos);
    miBoton3.getJButton().addActionListener(misEventos);
    miBoton4.getJButton().addActionListener(misEventos);
    miBoton5.getJButton().addActionListener(misEventos);
    miBoton6.getJButton().addActionListener(misEventos);
    miBoton7.getJButton().addActionListener(misEventos);
    miBoton8.getJButton().addActionListener(misEventos);
    miBoton9.getJButton().addActionListener(misEventos);
    miBoton0.getJButton().addActionListener(misEventos);
    miBotonPunto.getJButton().addActionListener(misEventos);
    // anadir evento operaciones
    EventosOperaciones eventosOperaciones = new EventosOperaciones();
    miBotonMas.getJButton().addActionListener(eventosOperaciones);
    miBotonMenos.getJButton().addActionListener(eventosOperaciones);
    miBotonPor.getJButton().addActionListener(eventosOperaciones);
    miBotonEntre.getJButton().addActionListener(eventosOperaciones);
    miBotonIgual.getJButton().addActionListener(eventosOperaciones);
    // anadiendo a mi JFrame
    JFrame miJFrame = miVentana.getJFrame();
    miJFrame.add(miBoton1.getJButton());
    miJFrame.add(miBoton2.getJButton());
    miJFrame.add(miBoton3.getJButton());
    miJFrame.add(miBoton4.getJButton());
    miJFrame.add(miBoton5.getJButton());
    miJFrame.add(miBoton6.getJButton());
    miJFrame.add(miBoton7.getJButton());
    miJFrame.add(miBoton8.getJButton());
    miJFrame.add(miBoton9.getJButton());
    miJFrame.add(miBoton0.getJButton());
    miJFrame.add(miBotonMas.getJButton());
    miJFrame.add(miBotonMenos.getJButton());
    miJFrame.add(miBotonPor.getJButton());
    miJFrame.add(miBotonEntre.getJButton());
    miJFrame.add(miBotonIgual.getJButton());
    miJFrame.add(miBotonPunto.getJButton());
  }
}
