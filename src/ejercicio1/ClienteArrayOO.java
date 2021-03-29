/**
* @author Marcelo Romero
*/
package ejercicio1;
public class ClienteArrayOO {
    public static void main(String[] args) {
        ArrayOO array = new ArrayOO();
        array.add(7);
        array.add(14);
        array.add(8);
        array.add(7);
        array.add(-10);
        array.add(-4);
        array.add(9);
        array.add(9);

        System.out.println("ArrayOO: \n" + array);
        System.out.println("Valor maximo del ArrayOO: \n"+array.maximo() );
        System.out.println("Valor minimo del ArrayOO: \n"+array.minimo() );
        System.out.println("Calcular promedio en ArrayOO: \n"+array.promedio() );
        array.quitarRepetidos();



    }


}
