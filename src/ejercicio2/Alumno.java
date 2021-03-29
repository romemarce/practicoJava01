/**
 * @author Marcelo Romero
 */
package ejercicio2;

import java.util.Objects;

public class Alumno {
    private String nombre, apellido, notaConceptual;
    private int examen1, examen2, examen3, notaFinal;

    public Alumno(String nombre, String apellido, int examen1, int examen2, int examen3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.examen1 = examen1;
        this.examen2 = examen2;
        this.examen3 = examen3;
        this.notaFinal = 0;
        this.notaConceptual = "";
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getExamen1() { return examen1; }
    public int getExamen2() { return examen2; }
    public int getExamen3() { return examen3; }
    public int getNotaFinal() {
        // Calculo de la nota final con ponderación
        int e1 = (int) Math.round(this.examen1 * 0.25);
        int e2 = (int) Math.round(this.examen2 * 0.30);
        int e3 = (int) Math.round(this.examen3 * 0.45);

        return e1+e2+e3;
    }
    public String getNotaConceptual() {
        // Obtencion de la nota conceptual segun la nota final

        int auxNotaFinal = getNotaFinal();
        if (auxNotaFinal < 4) return "Insuficiente";
        else if (auxNotaFinal == 4 || auxNotaFinal == 5) return "Regular";
        else if (auxNotaFinal == 6) return "Aprobado";
        else if (auxNotaFinal == 7) return "Bueno";
        else if (auxNotaFinal == 8) return "Muy Bueno";
        else if (auxNotaFinal == 9) return "Distinguido";
        else if (auxNotaFinal == 10) return "Excelente";
        else
            return "Sin calificar";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setExamen1(int examen1) {
        this.examen1 = examen1;
    }
    public void setExamen2(int examen2) {
        this.examen2 = examen2;
    }
    public void setExamen3(int examen3) {
        this.examen3 = examen3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Alumno alumno = (Alumno) o;
        return examen1 == alumno.examen1 &&
                examen2 == alumno.examen2 &&
                examen3 == alumno.examen3 &&
                nombre.equals(alumno.nombre) &&
                apellido.equals(alumno.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, examen1, examen2, examen3);
    }

    @Override
    public String toString() {
        return getNombre() + " " + getApellido() +
                ": { Exam1: " + getExamen1() +
                ", Exam2: " + getExamen2() +
                ", Exam3: " + getExamen3() +
                " }, Nota final: "+ getNotaFinal() +
                " ("+ getNotaConceptual() + ") ";
    }
}
