/**
 * @author Marcelo Romero
 */
package ejercicio3;

import java.util.Objects;

public class Honorario {
    private Perfil perfil;
    private float valorHoraMaximo;
    private float valorHoraMinimo;

    public Honorario(Perfil perfil, float valorHoraMaximo, float valorHoraMinimo) {
        this.perfil = perfil;
        this.valorHoraMaximo = valorHoraMaximo;
        this.valorHoraMinimo = valorHoraMinimo;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public float getValorHoraMaximo() {
        return valorHoraMaximo;
    }

    public void setValorHoraMaximo(float valorHoraMaximo) {
        this.valorHoraMaximo = valorHoraMaximo;
    }

    public float getValorHoraMinimo() {
        return valorHoraMinimo;
    }

    public void setValorHoraMinimo(float valorHoraMinimo) {
        this.valorHoraMinimo = valorHoraMinimo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Honorario honorario = (Honorario) o;
        return Float.compare(honorario.valorHoraMaximo, valorHoraMaximo) == 0 && Float.compare(honorario.valorHoraMinimo, valorHoraMinimo) == 0 && Objects.equals(perfil, honorario.perfil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(perfil, valorHoraMaximo, valorHoraMinimo);
    }

    @Override
    public String toString() {
        return "Honorario{" +
                "perfil=" + perfil +
                ", valorHoraMaximo=" + valorHoraMaximo +
                ", valorHoraMinimo=" + valorHoraMinimo +
                '}';
    }
}
