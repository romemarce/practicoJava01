/**
 * @author Nacho editado por Marcelo Romero
 */

package ejercicio1;

import java.util.Arrays;


public class ArrayOO {
    private int [] array;

    /**
     * Inicializa un array sin posiciones.
     */
    public ArrayOO() {
        this.array = new int[0];
    }

    /**
     * Incrementa en uno la longitud del array e inserta en la última posición
     * el valor pasado por parámetro
     * @param valor
     */
    public void add(int valor){
        //Crear nuevoArray con length = array.length + 1
        int [] nuevoArray = new int[array.length + 1];
        //Copiar los valores de array en otro array nuevoArray
        for (int i = 0; i < array.length; i++) {
            nuevoArray[i] = array[i];
        }
        //Poner el nuevo valor en nuevoArray
        nuevoArray[nuevoArray.length - 1] = valor;
        //Sobreescribir el valor de array
        this.array = nuevoArray;
    }

    /**
     * Quita el elemento ubicado en la posición especificada por el parámetro y
     * disminuye en uno la longitud del array.
     * @param indice
     */
    public void remove(int indice){
        //Crear nuevoArray con length = array.length - 1
        int [] nuevoArray = new int[array.length - 1];

        //Copiar todos los valores menos indice
        int indiceAux = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != indice){
                nuevoArray[indiceAux] = array[i];
                indiceAux++;
            }
        }

        //Sobreescribir el array con nuevoArray
        this.array = nuevoArray;
    }

    /**
     * Obtiene el valor especificado por índice
     * @param indice
     * @return
     */
    public int get(int indice){
        return array[indice];
    }

    /**
     * Establece el valor pasado por parámetro en la posición especificada por
     * indice
     * @param indice
     * @param valor
     */
    public void set(int indice, int valor){
        this.array[indice] = valor;
    }

    /**
     * Devuelve la cantidad de posiciones actual de la estructura.
     * @return
     */
    public int size(){
        return this.array.length;
    }

    public int maximo() {
        // determina el valor máximo almacenado en el array.
        int mayor = 0;

        if (array.length == 0) return mayor;

        for (int i: array) {
            mayor = ( i > mayor)? i : mayor;
        }

        return mayor;
    }

    public int minimo(){
        // determina el valor mínimo almacenado en el array.

        int minimo = 0;

        if (array.length == 0) return minimo;

        for (int i: array){
            minimo = (i < minimo)? i : minimo;
        }

        return minimo;
    }

    public double promedio(){
        // Devuelve el promedio calculado a partir de los valores almacenados en el array.
        double acumulado = 0;

        if (array.length == 0) return acumulado;
        for (int i: array){
            acumulado += i;
        }

        return acumulado / this.array.length;
    }

    public void ordenarElementos(int[] arreglo){
        // Ordena los metodos utilizando el metodo burbuja
        int valorTemporal = 0;
        for ( int i = 0; i < arreglo.length; i++){
            for (int j = 0; j < arreglo.length - 1; j++){
                if (arreglo[j] > arreglo[j+1]){
                    // Cambio de posiciones
                    valorTemporal = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = valorTemporal;
                }
            }
        }
    }

    public void quitarRepetidos(){
        /**
         * Quitar del array las múltiples ocurrencias de elementos de forma
         * que todos ellos aparecen una única vez. */
        if (array.length == 0) return;

        /**
         * Ordenamos los elementos para que los iguales esten consecutivos e
         * ir guardandolo solo si el siguiente es distinto.
         * */

        ordenarElementos( this.array ); // Metodo burbuja

        /**
         * Tambien se puede hacer con: Arrays.sort( this.array );
         * */

        // Almacenamos en un array solo los elementos que son distintos a su consecutivo
        ArrayOO valoresSinRepetir = new ArrayOO();
        for (int i = 0; i < this.array.length - 1; i++) {
            if( this.array[i] != this.array[i+1]){
                valoresSinRepetir.add( this.array[i] );
            }
        }
        System.out.println("valores sin repetir: \n" + valoresSinRepetir);
    }

    /**
     * Concatena en un único String todos los valores de la estructura
     * @return
     */
    @Override
    public String toString() {
        String resultado = "";

        for (int actual : array) {
            resultado += actual + ",";
        }

        if (resultado.length() > 0){
            resultado = resultado.substring(0, resultado.length() - 1) + ".";
        }

        return resultado;
    }


}
