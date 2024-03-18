package uvg.edu.gt;

public class BinaryTree<E> {
    private E data;
    private BinaryTree<E> left;
    private BinaryTree<E> right;
    
    public BinaryTree(E data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    public E getData() {
        return data;
    }
    
    public BinaryTree<E> getLeft() {
        return left;
    }
    
    public BinaryTree<E> getRight() {
        return right;
    }
    
    public void setLeft(BinaryTree<E> left) {
        this.left = left;
    }
    
    public void setRight(BinaryTree<E> right) {
        this.right = right;
    }
}