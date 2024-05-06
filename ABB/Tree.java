package ABB;

public class Tree {
    private TreeNode root;

    public Tree() {
        this.root = null;
    }
    public void add(Integer value) {
        if (this.root == null)
            this.root = new TreeNode(value);
        else
            this.add(this.root,value);
    }
    private void add(TreeNode actual, Integer value) {
        if (actual.getValue() > value) {
            if (actual.getLeft() == null) {
                TreeNode temp = new TreeNode(value);
                actual.setLeft(temp);
            } else {
                add(actual.getLeft(),value);
            }
        } else if (actual.getValue() < value) {
            if (actual.getRight() == null) {
                TreeNode temp = new TreeNode(value);
                actual.setRight(temp);
            } else {
                add(actual.getRight(),value);
            }
        }
    }


    public int getRoot(){
        return this.root.getValue();
    }
    public  int getHeight(){
        return getHeight(this.root);
    }
    private int getHeight(TreeNode root){
        if (root == null){
            return 0;
        }

        int subArbolIzquierdo = getHeight(root.getLeft());
        int subArbolDerecho = getHeight(root.getRight());


        return Math.max(subArbolIzquierdo,subArbolDerecho) + 1;
    }


    public boolean hasElement(Integer elem) {
        return hasElement(this.root, elem);
    }

    private boolean hasElement(TreeNode actual, Integer elem) {
        if (actual.getValue().equals(elem)) {//si es igual devuelvo true
            return true;
        } else if (actual.getValue() > elem) {//si es menor chequeo q haya un nodo izquierdo, si lo hay lo paso como raiz, si no encuentra es false
            if (actual.getLeft() == null) {
                return false;
            }
            return hasElement(actual.getLeft(), elem);
        } else {
            if (actual.getRight() == null) {
                return false;
            }
            return hasElement(actual.getRight(), elem);
        }
    }
    public boolean isEmpty() {
        return this.root == null;
    }
    public void printPostOrder() {
        printPostOrder(this.root);
    }

    private void printPostOrder(TreeNode current) {
        if (current != null) {
            printPostOrder(current.getLeft());
            printPostOrder(current.getRight());
            System.out.println(current.getValue() + " ");
        }
    }

    public void printPreOrder() {
        printPreOrder(this.root);
    }

    private void printPreOrder(TreeNode current) {
        if (current != null) {
            System.out.println(current.getValue() + " ");
            printPreOrder(current.getLeft());
            printPreOrder(current.getRight());
        }
    }

    public void printInOrder() {
        printInOrder(this.root);
    }

    private void printInOrder(TreeNode current) {
        if (current != null) {
            printInOrder(current.getLeft());
            System.out.println(current.getValue() + " ");
            printInOrder(current.getRight());
        }
    }


}
