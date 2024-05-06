package Tp2;

public class ej5 {
    /**
     * Dado un arreglo ordenado de números distintos A se desea construir un algoritmo que
     * determine si alguno de los elementos de dicho arreglo contiene un valor igual a la posición en la
     * cuál se encuentra, es decir, A[i] = i.
     * 1. Construir un algoritmo recursivo que responda a dicha verificación.
     * 2. Mostrar la pila de ejecución para la invocación algoritmo([-3, -1, 0, 2, 4, 6, 10])
     */
    public static boolean contieneValorIgualaLaPos(int []arr,int pos){
        System.out.println(pos);
        if (pos>=arr.length-1){ //caso base
            return false;
        }
        else if(arr[pos]==pos){
            return true;
        }
        return contieneValorIgualaLaPos(arr,pos+1);
    }

    public static void main(String[] args) {
        int [] arr = {-3, -1, 0, 2, 4, 6, 10};

       System.out.println(contieneValorIgualaLaPos(arr,0));
    }
}
