/**
 * @author Marcelo Romero
 */
package ejercicio4;

import java.util.Objects;

public class Embarcacion {
  private int numero, anioConstruccion;
  private String nombre;
  private EmbarcacionTipo embarcacionTipo;
  private Localidad localidad;
  private Dimensiones dimensiones;

  public Embarcacion(int numero, int anioConstruccion, String nombre, EmbarcacionTipo embarcacionTipo, Localidad localidad, Dimensiones dimensiones) {
    this.numero = numero;
    this.anioConstruccion = anioConstruccion;
    this.nombre = nombre;
    this.embarcacionTipo = embarcacionTipo;
    this.localidad = localidad;
    this.dimensiones = dimensiones;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getAnioConstruccion() {
    return anioConstruccion;
  }

  public void setAnioConstruccion(int anioConstruccion) {
    this.anioConstruccion = anioConstruccion;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public EmbarcacionTipo getTipoEmbarcacion() {
    return embarcacionTipo;
  }

  public void setTipoEmbarcacion(EmbarcacionTipo embarcacionTipo) {
    this.embarcacionTipo = embarcacionTipo;
  }

  public Localidad getLocalidad() {
    return localidad;
  }

  public void setLocalidad(Localidad localidad) {
    this.localidad = localidad;
  }

  public Dimensiones getDimensiones() {
    return dimensiones;
  }

  public void setDimensiones(Dimensiones dimensiones) {
    this.dimensiones = dimensiones;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Embarcacion that = (Embarcacion) o;
    return numero == that.numero && anioConstruccion == that.anioConstruccion && nombre.equals(that.nombre) && embarcacionTipo.equals(that.embarcacionTipo) && localidad.equals(that.localidad) && dimensiones.equals(that.dimensiones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numero, anioConstruccion, nombre, embarcacionTipo, localidad, dimensiones);
  }

  @Override
  public String toString() {
    return "Embarcacion {" +
            "Numero: " + numero +
            ", Año de Construccion: " + anioConstruccion +
            ", Nombre: '" + nombre + '\'' +
            ", Tipo de Embarcacion: " + embarcacionTipo +
            ", Localidad: " + localidad +
            ", Dimensiones: " + dimensiones +
            '}';
  }
}
