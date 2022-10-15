import java.text.DecimalFormat;

/**
 * Asignacion 2
 */

public class Asignacion2 {

  public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("#.##");
    double velocidadLuz = 299792.458;
    double velocidadSonido = 0.331;
    double x = 0, z = 0;
    boolean error;
    do try {
      System.out.println("Inserte el tiempo prolongado X");
      x = Integer.parseInt(System.console().readLine());
      error = false;
    } catch (NumberFormatException e) {
      System.out.println("Debe ser un numero entero");
      error = true;
    } while (error);
    do try {
      System.out.println("Inserte el tiempo Z");
      z = Integer.parseInt(System.console().readLine());
      error = false;
    } catch (NumberFormatException e) {
      System.out.println("Debe ser un numero entero");
      error = true;
    } while (error);
    double desaceleracion = Desaceleracion(x, velocidadLuz);
    double kmRecorridos = KmRecorridos(desaceleracion, z, velocidadSonido);

    System.out.println("La desaceleracion es de " + df.format(desaceleracion));
    System.out.println(
      "Kilometros recorridos fue de " + df.format(kmRecorridos)
    );
  }

  private static double KmRecorridos(
    double desaceleracion,
    double z,
    double velocidadSonido
  ) {
    double velocidadFinal = velocidadSonido + desaceleracion * z;
    double distancia = velocidadFinal * z;
    return distancia;
  }

  private static double Desaceleracion(double x, double velocidadLuz) {
    double desaceleracion = 0 - velocidadLuz / x;
    return desaceleracion;
  }
}
