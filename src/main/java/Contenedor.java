public class Contenedor {
  private static Contenedor contenedor;
  public StringBuilder stringBuilder;

  private Contenedor() {
    this.stringBuilder = new StringBuilder();
  }

  public static Contenedor obtenerInstancia() {
    if (contenedor == null) {
      contenedor = new Contenedor();
    }
    return contenedor;
  }
}
