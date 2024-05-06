package Tp2;

public class ej1 {
    /**
     * Implemente un algoritmo recursivo que determine si un arreglo de tamaño N está ordenado y
     * responda:
     * 1. ¿Qué complejidad O tiene? (La complejidad en el peor caso)
     * 2. ¿Trae algún problema hacerlo recursivo? ¿Cuál?
     * 3. ¿Qué cambiaría si la estructura fuera una lista en lugar de un arreglo?
     * ------
     * 1)Es un O(n), n = es el tamaño del array
     * ---------
     * 2)para este codigo no parece tener un problema importante . ya que hace una pasada comparando par de valores
     *  y corta si llego al rango maximo del array o si no esta ordenado por eso tenemos un o(n)
     * ----------
     * 3)primero que no puedo usar la pos como en un arreglo para acceder a cada nodo, ya que cada nodo es individual,
     * y tiene guardado un valor en memoria que apunta al siguiente para poder comparar en este caso,
     * verificaria que no sea null para que la llamada recurisva siga y ademas
     * comparar los valores o la informacion de un nodo con el siguiente para ver si esta
     * ordenado. En fin tendriamos la misma complejidad pero tiene otra logica trabajar con
     * listas de nodos
     */

    public static boolean estaOrdenado(int[] arr, int n) {
        // Caso base: si el arreglo tiene menos de 2 elementos, está ordenado
        if (n <= 1) {
            return true;
        }
        // Comprobamos si el último elemento es menor o igual que el anterior
        if (arr[n - 1] < arr[n - 2]) {
            return false;
        }
        // Llamada recursiva para el resto del arreglo
        return estaOrdenado(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};

        System.out.println(estaOrdenado(arreglo, arreglo.length) +" " + arreglo.length);
    }

}
