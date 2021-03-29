/**
 * @author Marcelo Romero
 */
package ejercicio3;

public class Perfil {
    private String nombre;

    public Perfil(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                " Nombre:" + nombre + '\'' +
                '}';
    }
}
