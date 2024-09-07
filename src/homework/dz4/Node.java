package homework.dz4;

public class Node<T> {
    private T item;
    private Node<T> next;
    private Node<T> prev;

    public Node(T item, Node<T> next, Node<T> prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }

    public T item(){
        return item;
    }

    public Node<T> next(){
        return next;
    }

    public Node<T> prev(){
        return prev;
    }

    public void setNext(Node<T> n){
        this.next = n;
    }
    public void setPrev(Node<T> p){
        this.prev = p;
    }
}
