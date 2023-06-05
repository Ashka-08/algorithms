package homeworks.hw_2;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addFirst(int value){
        Node node = new Node(value);
        if (first == null){
            first = last = node;
            size ++;
            return;
        }

        Node temp = first;
        first = node;
        first.next = temp;
        size ++;
    }

    public void addLast(int value){
        Node node = new Node(value);
        if (first == null){
            first = last = node;
            size ++;
            return;
        }

        last.next = node;
        last = node;
        size ++;
    }


    public void addIndex(int index, int value){
        if (index == 0){
            this.addFirst(value);
        } else if (index == size){
            this.addLast(value);
        } else {
            Node node = new Node(value);
            Node current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
            size ++;
        }
    }

    public void deleteIndex(int index){
        if (index == 0){
            this.deleteFirst();
        } else if (index == size - 1){
            this.deleteLast();
        } else {
            Node current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node temp = current.next.next;
            current.next.next = null;
            current.next = null;
            current.next = temp;
            size --;
        }
    }

    public void deleteFirst(){
        Node temp = first.next;
        first.next = null;
        first = temp;
        size --;
    }

    public void deleteLast(){
        Node prevLast = this.getPrevLast();
        prevLast.next = null;
        size --;
    }

    public Node getPrevLast(){
        Node temp = first;
        while (temp.next.next != null){
            temp = temp.next;
        }
        return temp;
    }

    public void list(){
        System.out.println(size);
        Node current = first;
        while (current != null){
            System.out.print(current.value + "\t");
            current = current.next;
        }
        System.out.println();
    }

    public int indexOf(int item){
        Node temp = first;
        int cnt = 0;
        while (temp != null){
            if (temp.value == item){
                return cnt;
            }
            temp = temp.next;
            cnt ++;
        }
        return -1;
    }
    public int lastIndexOf(int item){
        Node temp = first;
        int cnt = 0;
        int index = -1;
        while (temp != null){
            if (temp.value == item){
                index = cnt;
            }
            temp = temp.next;
            cnt ++;
        }
        return index;
    }

    public boolean contains(int item){
        if (this.indexOf(item) == -1){
            return false;
        }else {
            return true;
        }
    }

    public boolean search(int item){
        Node temp = first;
        while (temp != null){
            if (temp.value == item){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int getKthFromEnd(int k){
        Node temp = first;
        int cnt = 0;
        while (temp != null){
            if (cnt == size - k){
                return temp.value;
            }
            temp = temp.next;
            cnt ++;
        }
        return -1;
    }

    public void reverse(){
        Node temp = first;
        Node current = new Node(temp.value);
        while (temp.next != null){
            temp = temp.next;
            Node node = new Node(temp.value);
            node.next = current;
            current = node;
        }

        while (current != null){
            System.out.print(current.value + "\t");
            current = current.next;
        }
        System.out.println();
    }
}
