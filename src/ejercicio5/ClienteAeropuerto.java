package ejercicio5;

public class ClienteAeropuerto {

  private static void imprimir(Vuelo [] vuelosArray){
    // Que imprima los datos del array pasado por parámetro./
    for (Vuelo vuelo: vuelosArray) {
      System.out.println(vuelo);
    }
  }

  private static Vuelo[] agregarVuelo(Vuelo[] array, Vuelo elem){
    Vuelo[] nuevoArray = new Vuelo[array.length + 1];
    for (int i = 0; i < array.length; i++) {
      nuevoArray[i] = array[i];
    }
    nuevoArray[nuevoArray.length - 1] = elem;
    return nuevoArray;
  }

  private static Vuelo[] arribos(Vuelo [] vuelosArray) {
    // Que retorne todos los vuelos cuyo destino es el aeropuerto de Concordia.
    Ciudad concordia = new Ciudad("CON","Concordia");

    Vuelo[] listado = new Vuelo[0];
    for (Vuelo vuelo: vuelosArray) {
      if (vuelo.getCiudaDestino().equals(concordia)) {
        listado = agregarVuelo(listado, vuelo);
      }
    }
    return listado;
  }

  private static Vuelo[] partidas(Vuelo [] vuelosArray){
    // que retorne todos los vuelos que salen del aeropuerto de Concordia
    Ciudad concordia = new Ciudad("CON","Concordia");

    Vuelo[] listado = new Vuelo[0];
    for (Vuelo vuelo: vuelosArray) {
      if (vuelo.getCiudadOrigen().equals(concordia)) {
        listado = agregarVuelo(listado, vuelo);
      }
    }
    return listado;
  }


  public static void main(String[] args){
    Ciudad concordia = new Ciudad("CON", "Concordia");
    Ciudad colon = new Ciudad("COL", "Colon");
    Ciudad ubajai = new Ciudad("UBA", "Ubajai");


    Vuelo[] vuelos = new Vuelo[3];
    vuelos[0] = new Vuelo(
      159, new LineaArea(907, "Aerolineas Splinter"), concordia, colon,
      new FechaHora(22,3,2021), new FechaHora(23,3,2021)
    );

    vuelos[1] = new Vuelo(
      456, new LineaArea(67, "Aerolineas Argentinas"), ubajai, concordia,
      new FechaHora(23,3,2021), new FechaHora(24,3,2021)
    );

    vuelos[2] = new Vuelo(
        234, new LineaArea(789, "Aerolineas CapsulaCorp"), colon, concordia,
        new FechaHora(15,3,2021), new FechaHora(16,3,2021)
    );

    System.out.println("Vuelos: ");
    imprimir(vuelos);
    System.out.println("=========");

    System.out.println("Partidas: ");
    imprimir(partidas(vuelos));
    System.out.println("=========");

    System.out.println("Arribos: ");
    imprimir(arribos(vuelos));
    System.out.println("=========");
  }



}
