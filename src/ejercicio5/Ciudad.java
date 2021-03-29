/**
 * @author Marcelo Romero
 */
package ejercicio5;

import java.util.Objects;

public class Ciudad {
  private String codigoIata, nombre;

  public Ciudad(String codigoIata, String nombre) {
    this.codigoIata = codigoIata;
    this.nombre = nombre;
  }

  public String getCodigoIata() {
    return codigoIata;
  }

  public void setCodigoIata(String codigoIata) {
    this.codigoIata = codigoIata;
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
    Ciudad ciudad = (Ciudad) o;
    return Objects.equals(codigoIata, ciudad.codigoIata) && Objects.equals(nombre, ciudad.nombre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoIata, nombre);
  }

  @Override
  public String toString() {
    return "Cod. IATA: "+codigoIata+" - "+nombre;
  }
}

