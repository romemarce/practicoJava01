/**
 * @author Marcelo Romero
 */
package ejercicio5;

import java.util.Objects;

public class Vuelo {
  private int numeroVuelo;
  private LineaArea lineaAerea;
  private Ciudad ciudadOrigen, ciudaDestino;
  private FechaHora fechaPartida, fechaArribo;

  public Vuelo(int numeroVuelo, LineaArea lineaArea, Ciudad ciudadOrigen, Ciudad ciudaDestino, FechaHora fechaPartida, FechaHora fechaArribo) {
    this.numeroVuelo = numeroVuelo;
    this.lineaAerea = lineaArea;
    this.ciudadOrigen = ciudadOrigen;
    this.ciudaDestino = ciudaDestino;
    this.fechaPartida = fechaPartida;
    this.fechaArribo = fechaArribo;
  }

  public int getNumeroVuelo() {
    return numeroVuelo;
  }

  public void setNumeroVuelo(int numeroVuelo) {
    this.numeroVuelo = numeroVuelo;
  }

  public LineaArea getLineaAerea() {
    return lineaAerea;
  }

  public void setLineaAerea(LineaArea lineaAerea) {
    this.lineaAerea = lineaAerea;
  }

  public Ciudad getCiudadOrigen() {
    return ciudadOrigen;
  }

  public void setCiudadOrigen(Ciudad ciudadOrigen) {
    this.ciudadOrigen = ciudadOrigen;
  }

  public Ciudad getCiudaDestino() {
    return ciudaDestino;
  }

  public void setCiudaDestino(Ciudad ciudaDestino) {
    this.ciudaDestino = ciudaDestino;
  }

  public FechaHora getFechaPartida() {
    return fechaPartida;
  }

  public void setFechaPartida(FechaHora fechaPartida) {
    this.fechaPartida = fechaPartida;
  }

  public FechaHora getFechaArribo() {
    return fechaArribo;
  }

  public void setFechaArribo(FechaHora fechaArribo) {
    this.fechaArribo = fechaArribo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Vuelo vuelo = (Vuelo) o;
    return numeroVuelo == vuelo.numeroVuelo && Objects.equals(lineaAerea, vuelo.lineaAerea) && Objects.equals(ciudadOrigen, vuelo.ciudadOrigen) && Objects.equals(ciudaDestino, vuelo.ciudaDestino) && Objects.equals(fechaPartida, vuelo.fechaPartida) && Objects.equals(fechaArribo, vuelo.fechaArribo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroVuelo, lineaAerea, ciudadOrigen, ciudaDestino, fechaPartida, fechaArribo);
  }

  @Override
  public String toString() {
    return "Vuelo{" +
            "Num: " + numeroVuelo +
            ", Linea Aerea=" + lineaAerea +
            ", Origen: " + ciudadOrigen +
            ", Destino: " + ciudaDestino +
            ", Partida: " + fechaPartida +
            ", Arribo: " + fechaArribo +
            '}';
  }
}
