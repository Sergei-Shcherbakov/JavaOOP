package homework.dz4;

import java.util.ArrayList;
import java.util.List;

public class ListNode<T>  implements MyLinkedList<T>{

    Node<T> node;

    @Override
    public void addFirst(T item) {
        if(node == null){
            node = new Node<T>(item, null,null);
        }
        else {
            Node<T> newNode = new Node<>(item, node,null);
            node.setPrev(newNode);
            node = newNode;
        }

    }

    @Override
    public void addLast(T item) {
        if (node == null)  {
            node = new Node<T>(item, null,null);
        }
        else {
            Node<T> lastNode = null;
            Node<T> current = node;
            Node<T> node1 = new Node<>(item,null, null);
            if(current.next() != null){
                while (current.next() != null){
                    current = current.next();
                    if(current.next() == null){
                        lastNode = current;
                    }
                }
                node1.setPrev(lastNode);
                lastNode.setNext(node1);
                }
            else {
                node.setNext(node1);
                node1.setPrev(node);
            }
        }
    }

    @Override
    public int size() {
        Node<T> current = node;
        if(current == null){
            return 0;
        }
        int size = 1;
        while (current.next() != null){
            size++;
            current = current.next();
        }
        return size;
    }

  public void printMyList(){
        List<T> list = new ArrayList<>();
        Node<T> current = node;
        while (current != null){
           list.add(current.item());
            current = current.next();
        }

      System.out.println(list);;
  }
}
