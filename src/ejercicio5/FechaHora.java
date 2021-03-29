/**
 * @author Marcelo Romero
 */
package ejercicio5;

import java.util.Objects;

public class FechaHora {
  private int dia,mes,anio;

  public FechaHora(int dia, int mes, int anio) {
    this.dia = dia;
    this.mes = mes;
    this.anio = anio;
  }

  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }

  public int getMes() {
    return mes;
  }

  public int getAnio() {
    return anio;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FechaHora fechaHora = (FechaHora) o;
    return dia == fechaHora.dia && mes == fechaHora.mes && anio == fechaHora.anio;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dia, mes, anio);
  }

  @Override
  public String toString() {
    return dia+"/"+mes+"/"+anio;
  }
}
