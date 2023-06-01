package homeworks.hw_2;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(30);
        linkedList.addFirst(40);

        linkedList.addLast(20);
        linkedList.addLast(10);

        linkedList.addIndex(3, 15);
        linkedList.addIndex(2, 25);
        linkedList.addIndex(1, 35);

        linkedList.list();
        linkedList.reverse();

    }
}
