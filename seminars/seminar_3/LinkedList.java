package seminars.seminar_3;

/* Реализуем односвязный список LinkedList*/

public class LinkedList {
    private Node head;

    private class Node {
        private Node next;
        private int value;
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
        Node currentNode = new Node();
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        Node node = new Node();
        node.value = value;
        currentNode.next = node;
        node.next = null;
    }

    /**
     * Метод удаления последнего элемента списка 
     */
    public void delLast() {
        if (head != null) {
            if (head.next != null) {
                Node currentNode = new Node();
                while (currentNode.next.next != null) {
                    currentNode = currentNode.next;
                }
                currentNode.next = null;
            } else {
                    head = null;
            }
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
}

/* JCF - Java Collections Framework
На вершине иерархии в Java Collection Framework располагаются 2 интерфейса: 
Collection и Map. Эти интерфейсы разделяют все коллекции, входящие во фреймворк на две 
части по типу хранения данных: простые последовательные наборы элементов 
и наборы пар «ключ — значение» (словари). 

У Garbage Collector всего две задачи - это обнаружение и очистка мусора
*/