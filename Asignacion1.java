import java.text.DecimalFormat;

/**
 * Asignacion 2
 */

public class Asignacion1 {

  public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("#.##");
    double cantidadPrestada = 0;
    double tasa = 0;
    int meses = 0;
    boolean error;
    do {
      try {
        System.out.println("Inserte los meses");
        meses = Integer.parseInt(System.console().readLine());
        if (meses < 24 || meses > 360) {
          System.out.println("Los meses deben ser minimo 24 meses a 360 meses");
          error = true;
        } else {
          error = false;
        }
      } catch (NumberFormatException e) {
        System.out.println("Debe ser un numero");
        error = true;
      }
    } while (error);
    do {
      try {
        System.out.println("Inserte la cantidad prestada");
        cantidadPrestada = Double.parseDouble(System.console().readLine());
        if (cantidadPrestada < 2000) {
          System.out.println(
            "La cantidad prestada no puede ser menor de $2000"
          );
          error = true;
        } else {
          error = false;
        }
      } catch (NumberFormatException e) {
        System.out.println("Debe ser un numero");
        error = true;
      }
    } while (error);

    do {
      try {
        System.out.println("Inserte la tasa de interes efectiva anual");
        tasa = Double.parseDouble(System.console().readLine());
        if (tasa < 1 || tasa > 25) {
          System.out.println("La tasa debe estar entre 1% al 25%");
          error = true;
        } else {
          error = false;
        }
      } catch (NumberFormatException e) {
        System.out.println("Debe ser un numero");
        error = true;
      }
    } while (error);

    double couta = calcularAmortizacion(cantidadPrestada, tasa, meses);

    System.out.println(
      "La amortizacion del prestamo es de " + df.format(couta)
    );
  }

  static double calcularAmortizacion(
    double cantidadPrestada,
    double tasa,
    int meses
  ) {
    //Formula Cuota = [P * (i/m) (1 + i/m)^nm / (1 + i/m)^nm -1]

    double couta =
      cantidadPrestada *
      (tasa / meses) *
      (1 + tasa / meses) *
      1 *
      meses /
      (1 + tasa / meses) *
      1 *
      meses -
      1;

    return couta;
  }
}
