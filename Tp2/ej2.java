package Tp2;

public class ej2 {
    /**
     * Implemente un algoritmo recursivo para buscar un elemento en un arreglo ordenado
     * ascendentemente.
     * [5,6,89,688]
     */

    public static int buscarElemento(int[] arr,int pos, int elemento) {

        System.out.println("Comprobando el elemento en el índice " + pos);
        //caso base: si la pos supera
        if (pos >= arr.length - 1) {
            return -1;
        } else if (arr[pos] == elemento) {
            System.out.println("EL" + elemento + "se encuentra" + pos);
            return pos;
        }

        return buscarElemento(arr, pos +1, elemento);
    }

   public static void main(String[] args) {
        int [] arr ={5,6,89,688};
        int elemento = 89;
        int pos= buscarElemento(arr,0,elemento);
       if (pos != -1) {
           System.out.println("El elemento " + elemento + " se encuentra en la posición " + pos);
       } else {
           System.out.println("El elemento " + elemento + " no se encuentra en el arreglo.");
       }
    }
}
