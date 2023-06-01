package seminars.seminar_3;

public class Main {
    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        System.out.println(list.toString());
        list.addFirst(5);
        list.addLast(10);
        System.out.println(list.toString());
    }
}
