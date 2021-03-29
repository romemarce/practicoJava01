/**
 * @author Marcelo Romero
 */
package ejercicio5;

import java.util.Objects;

public class LineaArea {
  private int numero;
  private String nombre;

  public LineaArea(int numero, String nombre) {
    this.numero = numero;
    this.nombre = nombre;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LineaArea lineaArea = (LineaArea) o;
    return numero == lineaArea.numero && nombre.equals(lineaArea.nombre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numero, nombre);
  }

  @Override
  public String toString() {
    return "LineaArea{ " + numero + " - " + nombre + '}';
  }
}
