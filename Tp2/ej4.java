package Tp2;

public class ej4 {
    public static void fibonacci(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(SecuenciaFibonacci(i) + " ");
        }
    }
    public static int SecuenciaFibonacci(int num) {
        if (num <= 1) {
            return num; //Caso base: si n es 0 o 1, el término de Fibonacci es n
        } else{
            //formula fibonacci de internet Fn = Fn-1 + Fn-2
            return SecuenciaFibonacci(num - 1) + SecuenciaFibonacci(num - 2);
        }
    }

    public static void main(String[] args) {
        int n = 6; // Número de términos de Fibonacci que quieres mostrar
        System.out.println("Los primeros " + n + " términos de la secuencia de Fibonacci son:");
        fibonacci(n);
    }
}