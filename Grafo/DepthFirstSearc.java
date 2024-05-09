package Grafo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class DepthFirstSearc<T> {
    //traza de recorrido en profundidad (DFS)

    private Map<Integer,String>colorVertice;
    public DepthFirstSearc(){
        this.colorVertice=new HashMap<>();
    }

    public void Dfs(Grafo<T>grafo){
        Iterator<Integer> it = grafo.obtenerVertices();

        while (it.hasNext()){
            Integer vertice = it.next();
            colorVertice.put(vertice,"BLANCO");
        }
        Iterator<Integer> it1 = grafo.obtenerVertices();
        while (it1.hasNext()){
            Integer vertice = it1.next();
            if (colorVertice.get(vertice)=="BLANCO"){
                dfs_visit(grafo,vertice);
            }
            if (colorVertice.get(vertice)=="AMARILLO"){
                System.out.println("Hay clico en este grafo");
                return;
            }

        }

    }
    private void dfs_visit(Grafo<T>grafo,int verticeId){
        System.out.println(" "+ verticeId);
        colorVertice.put(verticeId, "AMARILLO");
        Iterator<Integer> adyVertice = grafo.obtenerAdyacentes(verticeId);
        while (adyVertice.hasNext()){
            Integer v = adyVertice.next();
            if (colorVertice.get(v)=="BLANCO"){
                dfs_visit(grafo,v);
            }
            colorVertice.put(v,"NEGRO");
        }


    }
}
