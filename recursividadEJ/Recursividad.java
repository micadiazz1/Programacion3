package recursividadEJ;

public class Recursividad {
    public void Imprimir(int x ){
        if(x<=5){
            System.out.println(x + " ");
            Imprimir(x+1);
        }else{
            System.out.println("Es mayor a 5");
        }
    }
    public int calcular(int x, int n) { //(5,3)

        if (n <= 0) {
            return 1;
        }
        else {
            return x * calcular(x, n - 1);
        }
    }

    public int factorial(int x){
        if(x>0){
            int valor_calculado = x * factorial(x - 1);
            return valor_calculado;
        }
        return 1;
    }
    public static void main(String[] args) {
        Recursividad recursiva = new Recursividad();
        //recursiva.Imprimir(1);
       //int factorial= recursiva.factorial(5);
       //System.out.println(factorial);

       int calcular= recursiva.calcular(5,3);

       System.out.println(calcular);


    }

}
