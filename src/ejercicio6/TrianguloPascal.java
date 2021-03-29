/**
 * @author Marcelo Romero
 */
package ejercicio6;

public class TrianguloPascal {

  /**
   * Este ejercicio se realizo en base a "Combinatoria en el triángulo de Pascal"
   * https://es.wikipedia.org/wiki/Tri%C3%A1ngulo_de_Pascal#Combinatoria_en_el_tri.C3.A1ngulo_de_Pascal
   *
   * Usando la formula de Combinaciones sin repetición
   * https://es.wikipedia.org/wiki/Combinatoria#Combinaciones_sin_repetici.C3.B3n
   *
   * */

  private int comb(int n, int p) {
    return (int) Math.round( factorial( n ) / (factorial( p ) * factorial( n - p )) );
  }

  private double factorial (double numero) {
    if (numero == 0){
      return 1;
    }else{
      return numero * factorial(numero - 1);
    }
  }

  public void calcularHasta(int n){
    String linea = "";
    int cant = n;
    for (int i = 0; i < n; i++) {
      int consecutivo = i;
      linea = "";

      for (int j = 0; j < consecutivo+1; j++) {
        linea += comb(i, j) + " ";
      }

      System.out.println( linea );
    }
  }


}
