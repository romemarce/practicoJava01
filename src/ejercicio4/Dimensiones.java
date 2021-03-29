/**
 * @author Marcelo Romero
 */
package ejercicio4;

import java.util.Objects;

public class Dimensiones {
  private float eslora, manga, puntal;

  public Dimensiones(float eslora, float manga, float puntal) {
    this.eslora = eslora;
    this.manga = manga;
    this.puntal = puntal;
  }

  public float getEslora() {
    return eslora;
  }

  public void setEslora(float eslora) {
    this.eslora = eslora;
  }

  public float getManga() {
    return manga;
  }

  public void setManga(float manga) {
    this.manga = manga;
  }

  public float getPuntal() {
    return puntal;
  }

  public void setPuntal(float puntal) {
    this.puntal = puntal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Dimensiones that = (Dimensiones) o;
    return Float.compare(that.eslora, eslora) == 0 && Float.compare(that.manga, manga) == 0 && Float.compare(that.puntal, puntal) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(eslora, manga, puntal);
  }

  @Override
  public String toString() {
    return "Dimensiones { " +"Eslora: " + eslora +", Manga: " + manga + ", Puntal: " + puntal + '}';
  }
}
