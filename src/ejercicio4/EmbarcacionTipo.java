/**
 * @author Marcelo Romero
 */
package ejercicio4;

import java.util.Objects;

public class EmbarcacionTipo {
  private String descripcion;

  public EmbarcacionTipo(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EmbarcacionTipo that = (EmbarcacionTipo) o;
    return descripcion.equals(that.descripcion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descripcion);
  }

  @Override
  public String toString() {
    return "TipoEmbarcacion: " + descripcion;
  }
}
