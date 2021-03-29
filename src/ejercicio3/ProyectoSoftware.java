/**
 * @author Marcelo Romero
 */
package ejercicio3;

import java.util.Arrays;
import java.util.Objects;

public class ProyectoSoftware {
    private String nombre;
    private Perfil[] profesionales;
    private int horasDeTrabajo;
    private Honorario[] honorarios;

    public ProyectoSoftware(String nombre, Perfil[] profesionales, int horasDeTrabajo, Honorario[] honorarios) {
        this.nombre = nombre;
        this.profesionales = profesionales;
        this.horasDeTrabajo = horasDeTrabajo;
        this.honorarios = honorarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Perfil[] getProfesionales() {
        return profesionales;
    }

    public void setProfesionales(Perfil[] profesionales) {
        this.profesionales = profesionales;
    }

    public int getHorasDeTrabajo() {
        return horasDeTrabajo;
    }

    public void setHorasDeTrabajo(int horasDeTrabajo) {
        this.horasDeTrabajo = horasDeTrabajo;
    }

    public Honorario[] getHonorarios() {
        return honorarios;
    }

    public void setHonorarios(Honorario[] honorarios) {
        this.honorarios = honorarios;
    }

    public double minimo(){
        /**
         * Devuelve el valor mínimo del proyecto sumando el valor mínimo de honorario
         * de cada perfil profesional.
         * */
        double result = 0;
        for (Honorario h: this.honorarios) {
            result += h.getValorHoraMinimo();
        }
        return result;
    }
    public double maximo(){
        /**
         * Ídem anterior pero sumando el valor máximo de
         * honorario profesional.
         * */
        double result = 0;
        for (Honorario h:this.honorarios){
            result += h.getValorHoraMaximo();
        }
        return result;
    }

    public double promedio(){
        /**
         * ídem anterior pero sumando el valor promedio de
         * honorario por hora de cada perfil profesional.
         * */
        double result = 0;
        for (Honorario h:this.honorarios){
            // Valor promedio por cada perfil.
            float valorPromedio = ( h.getValorHoraMinimo() + h.getValorHoraMaximo() )/2;
            // Acumulado
            result += valorPromedio;
        }
        return  result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProyectoSoftware that = (ProyectoSoftware) o;
        return horasDeTrabajo == that.horasDeTrabajo && Objects.equals(nombre, that.nombre) && Arrays.equals(profesionales, that.profesionales) && Arrays.equals(honorarios, that.honorarios);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre, horasDeTrabajo);
        result = 31 * result + Arrays.hashCode(profesionales);
        result = 31 * result + Arrays.hashCode(honorarios);
        return result;
    }

    @Override
    public String toString() {
        return "ProyectoSoftware{" +
                "nombre='" + nombre + '\'' +
                ", profesionales=" + Arrays.toString(profesionales) +
                ", horasDeTrabajo=" + horasDeTrabajo +
                ", honorarios=" + Arrays.toString(honorarios) +
                '}';
    }
}
