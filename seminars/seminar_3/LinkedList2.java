package seminars.seminar_3;

/* Реализуем двусвязный список LinkedList2*/

public class LinkedList2 {
    private Node head;
    private Node tail;

    private class Node {
        private Node next;
        private Node previous;
        private int value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (head != null) {
            Node node = head;
            while (node.next != null) {
                sb.append("Value: ");
                sb.append(node.value);
                sb.append("\n");
            }
        } else {
            sb.append("Лист пуст");
        }
        return sb.toString();
    }
    /**
     * Метод добавления нового элемента в начало списка 
     * @param value
     */
    public void addFirst(int value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
            head.previous = node;
        }
        head = node;
    }

    /**
     * Удаление первого элемента связного списка
     * @param head
     */
    public void delFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    /**
     * Метод добавления нового элемента в конец списка 
     * @param value
     */
    public void addLast(int value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            if (head.next != null) {
                node = tail.next;
                node.previous = tail;
            } else {
                head.next = node;
                node.previous = head;
            }
        } else {
            head = node;
        }
        
    }

    /**
     * Метод удаления последнего элемента списка 
     */
    public void delLast() {
        if (head != null) {
            tail.previous.next = null;
        }
    }

    /**
     * Метод возвращения информации да/нет 
     * о наличии искомого внутри списка
     * @param value
     * @return
     */
    public boolean findBool(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    /**
     * Метод поиска значения в связном списке
     * @param value
     * @return
     */
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void bubbleSort() {
        Node node = head;
        while (head != null && node.next != null) {
            Node minNode = node;
            Node innerNode = node.next;
            while (innerNode != null) {
                if (innerNode.value < minNode.value) {
                    minNode = innerNode;
                }
                innerNode = innerNode.next;
            }
            if (minNode != node) {
                Node temp = node;
                node = minNode;
                minNode = node;

                if (minNode.previous == null) {
                    head = minNode;
                }

                if (minNode.next == null) {
                    tail = minNode;
                }
                node = minNode.next;
            } else {
                node = node.next;
            }
        }
    }
}
