package Tp2;

public class ej6 {
    /**
     * Implemente un algoritmo de ordenamiento por selección en un arreglo.
     * Implemente un algoritmo de ordenamiento por burbujeo en un arreglo.
     * ● ¿Qué complejidad big-O tienen estos algoritmos?
     */
    /**
     * por seleccion
     *  public static void ordenarPorSeleccion(int[] arreglo) {
     *     for (int i = 0; i < arreglo.length - 1; i++) {
     *         for (int j = i + 1; j < arreglo.length; j++) {
     *             if (arreglo[i] > arreglo[j]) {
     *                 // ...intercambiarlos, es decir, mover el actual a la derecha y el de la derecha al actual
     *                 int temporal = arreglo[i];
     *                 arreglo[i] = arreglo[j];
     *                 arreglo[j] = temporal;
     *             }
     */

    public static void OrdenarPorSeleccionRecursivo(int[] arr, int i, int j){
        if(i>=arr.length && j>=arr.length){
            System.out.println(arr);
        }
        if (arr[i]>arr[j]){
            OrdenarPorSeleccionRecursivo(arr,i+1,j=i+1);
            int temporal = arr[i];
            arr[i] = arr[j];
            arr[j] = temporal;
        }

    }

    public static void main(String[] args) {
        int [] arr = {-3, -1, 0, 2, 4, 6, 10};

      OrdenarPorSeleccionRecursivo(arr,0,0);
    }
}
