/**
 * @author Marcelo Romero
 */
package ejercicio4;

public class ClientePNA {
  private static void imprimir(Embarcacion[] param){
    /**
     * Imprimir por pantalla los datos contenidos en el array pasado por parámetro.
     * */

    for (Embarcacion emb: param) {
      System.out.println(emb.toString());
    }
  }

  private static Embarcacion[] agregarEmbarcacion(Embarcacion[] array, Embarcacion elem){
    Embarcacion[] nuevoArray = new Embarcacion[array.length + 1];
    for (int i = 0; i < array.length; i++) {
      nuevoArray[i] = array[i];
    }
    nuevoArray[nuevoArray.length - 1] = elem;
    return nuevoArray;
  }

  private static Embarcacion[] filtrarAntiguas(Embarcacion[] param){
    /**
     * Devuelve las embarcaciones cuyo año de construcción es anterior a 1980.
     * */
    Embarcacion[] listado = new Embarcacion[0];
    for (Embarcacion emb: param) {
      if (emb.getAnioConstruccion() < 1980){
        listado = agregarEmbarcacion(listado, emb);
      }
    }
    return listado;
  }
  private static Embarcacion[] filtrarMenores(Embarcacion[] param, int esloraMax){
    /**
     * Devuelve las embarcaciones cuya eslora no superan
     * el valor del parámetro esloraMax.
     * */
    Embarcacion[] listado = new Embarcacion[0];
    for (Embarcacion emb: param) {
      if (emb.getDimensiones().getEslora() < esloraMax){
        listado = agregarEmbarcacion(listado, emb);
      }
    }
    return listado;
  }

  private static Embarcacion[] filtrarPorTipo(Embarcacion[] param, EmbarcacionTipo tipo){
    /**
     * Devuelve las embarcaciones que son Veleros.
     * */
    Embarcacion[] listado = new Embarcacion[0];
    for(Embarcacion emb: param){
      if (emb.getTipoEmbarcacion().equals(tipo)){
        listado = agregarEmbarcacion(listado, emb);
      }
    }
    return listado;
  }

  public static void main(String[] args) {
    Embarcacion[] emb = new Embarcacion[3];
    emb[0] = new Embarcacion(456,1975, "Los Andes",
            new EmbarcacionTipo("Velero"),
            new Localidad("Concordia"),
            new Dimensiones(20f,34f,56f)
    );
    emb[1] = new Embarcacion(788,1985, "Los Andes2",
            new EmbarcacionTipo("Velero"),
            new Localidad("Concordia2"),
            new Dimensiones(16f,34f,56f)
    );
    emb[2] = new Embarcacion(788,1920, "Los Andes3",
            new EmbarcacionTipo("Lancha"),
            new Localidad("Concordia3"),
            new Dimensiones(12f,34f,56f)
    );

    Embarcacion[] embarcacionesAntiguas = filtrarAntiguas(emb);
    System.out.println("Embarcaciones menores que 1980: ");
    for(Embarcacion elem: embarcacionesAntiguas){
      System.out.println(elem.toString());
    }
    System.out.println("======================");

    Embarcacion[] embarcacionesFiltrarMenores = filtrarMenores(emb, 15);
    System.out.println("Embarcaciones filtradas por esloraMax: ");
    for(Embarcacion elem: embarcacionesFiltrarMenores){
      System.out.println(elem.toString());
    }
    System.out.println("======================");

    Embarcacion[] embarcacionesFiltrarPorTipo = filtrarPorTipo(emb, new EmbarcacionTipo("Velero"));
    System.out.println("Embarcaciones filtradas por tipo, en este caso Velero: ");
    for(Embarcacion elem: embarcacionesFiltrarPorTipo){
      System.out.println(elem.toString());
    }
    System.out.println("======================");

  }


}
