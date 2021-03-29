/**
 * @author Marcelo Romero
 */
package ejercicio3;
public class ClienteProyectoSoftware {
  public static void main(String[] args) {

    Perfil[] perfiles = new Perfil[6];
    perfiles[0] = new Perfil("Diseñador gráfico");
    perfiles[1] = new Perfil("Programador Web Frontend");
    perfiles[2] = new Perfil("Programador Web Backend");
    perfiles[3] = new Perfil("Administrador de Base de datos");
    perfiles[4] = new Perfil("Administrador de Redes");
    perfiles[5] = new Perfil("Líder de proyecto");

    Honorario[] honoProyecto1 = new Honorario[2];
    honoProyecto1[0] = new Honorario( perfiles[0], 2069, 3525.88f);
    honoProyecto1[1] = new Honorario( perfiles[1],2093, 4029.57f);

    Honorario[] honoProyecto2 = new Honorario[2];
    honoProyecto2[0] = new Honorario( perfiles[2],2793, 5339.87f);
    honoProyecto2[1] = new Honorario( perfiles[3],2373, 5850.45f);

    Honorario[] honoProyecto3 = new Honorario[2];
    honoProyecto3[0] = new Honorario( perfiles[4],2373, 5850.45f);
    honoProyecto3[1] = new Honorario( perfiles[5],4004, 8573.17f);

    ProyectoSoftware[] proyectoSoftwares = new ProyectoSoftware[3];
    proyectoSoftwares[0] = new ProyectoSoftware("Gestor de ventas", perfiles, 10, honoProyecto1);
    proyectoSoftwares[1] = new ProyectoSoftware("Control de stock en almacen", perfiles, 20, honoProyecto2);
    proyectoSoftwares[2] = new ProyectoSoftware("Intranet virtual", perfiles, 15, honoProyecto3);

    for (ProyectoSoftware proyecto: proyectoSoftwares){
      System.out.println("Proyecto "+proyecto.getNombre()+": ");
      System.out.println("Valor minimo: "+proyecto.minimo());
      System.out.println("Valor maximo: "+proyecto.maximo());
      System.out.println("Valor promedio: "+proyecto.promedio());
      System.out.println("========================================");
    }
  }
}
