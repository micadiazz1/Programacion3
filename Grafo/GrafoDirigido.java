package Grafo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GrafoDirigido<T> implements Grafo<T> {

    /*
        key representa un vertice
        el value representa la lista de vertices adyacentes de ese vertice (key)
     */
    private HashMap<Integer, HashSet<Arco<T>>> vertices;

    public GrafoDirigido(){
        this.vertices = new HashMap<>();
    }
    @Override
    public void agregarVertice(int verticeId) {
        if (!contieneVertice(verticeId))
            this.vertices.put(verticeId,new HashSet());
    }

    @Override
    public void borrarVertice(int verticeId) {
        if (contieneVertice(verticeId))
            this.vertices.remove(verticeId);
    }

    @Override
    public void agregarArco(int verticeId1, int verticeId2, T etiqueta) {
        //si contiene esos dos vertices
        if(ContieneKeys(verticeId1, verticeId2)){
            //el arco al manipularse con HashSet se utiliza funcion add para agregar el arco
            this.vertices.get(verticeId1).add(new Arco<>(verticeId1,verticeId2,etiqueta));
        }
    }
    public boolean ContieneKeys(int vertice1, int vertice2){
        return this.vertices.containsKey(vertice1) && this.vertices.containsKey(vertice2);
    }
    @Override
    public void borrarArco(int verticeId1, int verticeId2) {

        if(ContieneKeys(verticeId1,verticeId2)){
            //para recorrer el arco lo iterator
            //para obtener un Iterator sobre el conjunto de arcos asociados al vertice  con el id verticeId1
            Iterator<Arco<T>> arcos = this.vertices.get(verticeId1).iterator();
            if (arcos!=null){
                while (arcos.hasNext()){
                    Arco<T> arco = arcos.next();
                    //al estar ya en el conjunto del verticeId1 me fijo si tiene como destino el verticeId2
                    //pd: no se si esta bien asi, logicamente si pero no se si tengo que verificar el origen tambien
                    //pd: pensandolo bien tenes que ver el arco de origen jajajaj tambien
                    /**
                     *  if (arco.getVerticeDestino() == verticeId2) {
                     *                         arcos.remove(); // Eliminar el arco encontrado
                     *                     }
                     */
                    if (arco.getVerticeOrigen() == verticeId1 && arco.getVerticeDestino() == verticeId2) {
                        arcos.remove(); // Eliminar el arco encontrado
                    }
                }
            }
        }
    }

    @Override
    public boolean contieneVertice(int verticeId) {
        return this.vertices.containsKey(verticeId);
    }

    @Override
    public boolean existeArco(int verticeId1, int verticeId2) {

        if (ContieneKeys(verticeId1,verticeId2)){
            Iterator<Arco<T>> arcos = this.vertices.get(verticeId1).iterator();
            while (arcos.hasNext()){
                Arco<T> arco = arcos.next();
                if (arco.getVerticeOrigen() == verticeId1 && arco.getVerticeDestino() == verticeId2){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Arco<T> obtenerArco(int verticeId1, int verticeId2) {
        /*
        Arco<T> arcoAux = null;

        if (existeArco(verticeId1, verticeId2)) {
            Iterator<Arco<T>> arcos = this.vertices.get(verticeId1).iterator();
            while (arcos.hasNext()) {
                arcoAux = arcos.next();
                return arcoAux;
            }
        }
        return arcoAux; */
        if (existeArco(verticeId1, verticeId2)) {
            HashSet<Arco<T>> arcos = this.vertices.get(verticeId1);
            for (Arco<T> arco : arcos) {
                if (arco.getVerticeDestino() == verticeId2) {
                    return arco;
                }
            }
        }
        return null; // Devolvemos null si no se encuentra el arco
    }

    @Override
    public int cantidadVertices() {
        return this.vertices.size();
    }

    @Override
    public int cantidadArcos() {
        int cant = 0;
        for (HashSet<Arco<T>> conjuntoArcos: vertices.values()) {
            System.out.println(conjuntoArcos + " " );
            cant+= conjuntoArcos.size();

        }
        return cant;
    }

    @Override
    public Iterator<Integer> obtenerVertices() {
        //keySet un metodo del mapa ya me da de una el conjunto de todas las claves presentes del mapa
        return this.vertices.keySet().iterator();
    }

    @Override
    public Iterator<Integer> obtenerAdyacentes(int verticeId) {
        Iterator<Arco<T>> arcos = this.vertices.get(verticeId).iterator();
        if (vertices.containsKey(verticeId)){
            HashSet<Integer> conjuntoAdyacente = new HashSet<>();
            while (arcos.hasNext()){
                conjuntoAdyacente.add(arcos.next().getVerticeDestino());
            }
            return conjuntoAdyacente.iterator();
        }
        return null;
    }

    @Override
    public Iterator<Arco<T>> obtenerArcos() {
        Set<Integer> vertices = this.vertices.keySet();
        Set<Arco<T>> arcos = new HashSet<>();
        for (Integer vertice : vertices){
            arcos.addAll(this.vertices.get(vertice));
        }
        return arcos.iterator();
    }

    @Override
    public Iterator<Arco<T>> obtenerArcos(int verticeId) {
        if (this.vertices.containsKey(verticeId)){
            Set<Arco<T>> vertices = this.vertices.get(verticeId);
            return vertices.iterator();
        }
        return null;
    }







}