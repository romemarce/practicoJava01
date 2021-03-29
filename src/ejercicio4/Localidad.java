/**
 * @author Marcelo Romero
 */
package ejercicio4;

import java.util.Objects;

public class Localidad {
  private String nombre;

  public Localidad(String nombre) {
    this.nombre = nombre;
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
    Localidad localidad = (Localidad) o;
    return nombre.equals(localidad.nombre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre);
  }

  @Override
  public String toString() {
    return "Localidad: " +nombre;
  }
}
