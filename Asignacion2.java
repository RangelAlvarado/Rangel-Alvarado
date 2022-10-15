/**
 * Asignacion 2
 */

public class Asignacion2 {

  public static void main(String[] args) {
    double velocidadLuz = 299792.458;
    double velocidadSonido = 0.331;
    System.out.println("Inserte el tiempo prolongado X");
    double x = Integer.parseInt(System.console().readLine());
    System.out.println("Inserte el tiempo Y");
    double y = Integer.parseInt(System.console().readLine());
    System.out.println("Inserte el tiempo Z");
    double z = Integer.parseInt(System.console().readLine());

    double desaceleracion = Desaceleracion(x, velocidadLuz);
    double kmRecorridos = KmRecorridos(desaceleracion, z, velocidadSonido);

    System.out.println("La desaceleracion es de " + desaceleracion);
    System.out.println("Kilometros recorridos fue de " + kmRecorridos);
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
