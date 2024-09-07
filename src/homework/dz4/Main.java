package homework.dz4;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new ListNode<Integer>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addFirst(4);
        System.out.println(list.size());
        list.printMyList();

    }
}
