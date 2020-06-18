import javax.swing.JFrame;

public class Ventana {
  private JFrame miJFrame;

  public Ventana() {
    miJFrame = new JFrame();
    miJFrame.setTitle("Calculator");
    miJFrame.setSize(330, 325);
    miJFrame.setResizable(false);
    miJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    miJFrame.setLayout(null);
  }

  public JFrame getJFrame() {
    return miJFrame;
  }
}
