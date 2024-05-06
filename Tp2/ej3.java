package Tp2;

public class ej3 {
    public static String decimalaoBinario(int decimal) {
        if (decimal<=1) {
            return String.valueOf(decimal); // Si el número decimal es menor o igual a 1 convierte decimal a strin
        }else
        return  decimalaoBinario(decimal/2)+decimal%2;
    }

    public static void main(String[] args) {
        int decimal = 26; // Número decimal que queremos convertir
        System.out.println(decimal + " en binario es: " + decimalaoBinario(decimal));
    }
}
