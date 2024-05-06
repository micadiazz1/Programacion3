package Grafo;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // Creo un grafo dirigdo donde las etiquetas de los arcos son valores Float
        GrafoDirigido<Float> grafito = new GrafoDirigido<Float>();

        // Agrego los vertices 1 y 2
        grafito.agregarVertice(1);
        grafito.agregarVertice(2);
        grafito.agregarVertice(3);

        // Genero un arco desde 1 hasta 2 con el valor de etiqueta 3
        grafito.agregarArco(1, 2, 3F);
        grafito.agregarArco(1,3,4F);
        grafito.agregarArco(1,1,5F);

        // Obtengo el arco entre 1 y 2, y le pido la etiqueta
        Float etiqueta = grafito.obtenerArco(1, 2).getEtiqueta();
        int cantArcos = grafito.cantidadArcos();
        //System.out.println(etiqueta); // Debería imprimir 3
       // System.out.println(cantArcos); // deberia imprimir 2

       // Iterator<Integer> iterator = grafito.obtenerVertices();

       // while (iterator.hasNext()){
        //    Integer vertice = iterator.next();
        //    System.out.println(vertice);
       // }

      //  Iterator<Integer>iterator= grafito.obtenerAdyacentes(1);
       // while (iterator.hasNext()){
         //   Integer ady = iterator.next();
      //      System.out.println(ady);
      //  }

      //  Iterator<Arco<Float>> a = grafito.obtenerArcos();

       // while (a.hasNext()){
        //    Arco<Float> ar = a.next();
         //   System.out.println(ar);
       // }
        Iterator<Arco<Float>> obtenerArcoEspecifico = grafito.obtenerArcos(1);

        while (obtenerArcoEspecifico.hasNext()){
            Arco<Float> arcoEspecifico = obtenerArcoEspecifico.next();
            System.out.println(arcoEspecifico);
        }

    }
}
