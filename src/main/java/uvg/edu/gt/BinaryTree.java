package uvg.edu.gt;

public class BinaryTree<E extends Comparable<E>> {
    private E value;
    private BinaryTree<E> leftChild;
    private BinaryTree<E> rightChild;

    public BinaryTree(E value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    public BinaryTree() {
        this.value = null;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void insert(E newValue) {
        if (this.value == null) {
            this.value = newValue;
        } else {
            if (newValue.compareTo(this.value) < 0) {
                if (this.leftChild == null) {
                    this.leftChild = new BinaryTree<E>(newValue); // Indica explícitamente el tipo genérico E aquí
                } else {
                    this.leftChild.insert(newValue);
                }
            } else if (newValue.compareTo(this.value) > 0) {
                if (this.rightChild == null) {
                    this.rightChild = new BinaryTree<E>(newValue); // Y también aquí
                } else {
                    this.rightChild.insert(newValue);
                }
            }
        }
    }
    

    public E find(Comparable<E> valueToFind) {
        if (valueToFind.compareTo(this.value) == 0) {
            return this.value;
        } else if (valueToFind.compareTo(this.value) < 0 && this.leftChild != null) {
            return this.leftChild.find(valueToFind);
        } else if (valueToFind.compareTo(this.value) > 0 && this.rightChild != null) {
            return this.rightChild.find(valueToFind);
        }
        return null;
    }

    public void inOrderTraversal() {
        if (this.leftChild != null) {
            this.leftChild.inOrderTraversal();
        }
        System.out.println(this.value);
        if (this.rightChild != null) {
            this.rightChild.inOrderTraversal();
        }
    }
}

