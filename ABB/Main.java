package ABB;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de construcción de un árbol

        //raiz del arbol
        Tree root = new Tree();
        Tree root2 = new Tree();
        //subarbol le agregamos valores tanto a la izq como a la derecha
        root.add(6);
        root.add(3);
        root.add(7);
        root.add(1);
        root.add(5);
        root.add(4);
        root.add(7);
        root.add(9);

        root2.add(6);
        root2.add(3);
        root2.add(1);
        root2.add(5);
        root2.add(4);
        root2.add(7);
        root2.add(9);
        root2.add(10);
        root2.add(20);

        System.out.println(root.hasElement(4));
        System.out.println(root2.getHeight());

        root2.printInOrder();

    }
}
