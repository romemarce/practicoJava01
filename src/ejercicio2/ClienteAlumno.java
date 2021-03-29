/**
 * @author Marcelo Romero
 */
package ejercicio2;
public class ClienteAlumno {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[5];
        alumnos[0] = new Alumno("Marcelo", "Romero", 7,6, 8);
        alumnos[1] = new Alumno("Juando", "Rosas", 5,7, 7);
        alumnos[2] = new Alumno("German", "Strechmel", 6,4, 9);
        alumnos[3] = new Alumno("Nicolas", "Curbelo", 9,6, 7);
        alumnos[4] = new Alumno("Israel", "Gauna", 3,8, 6);

        for (Alumno alumno: alumnos) {
            System.out.println(alumno.toString());
        }

    }
}
