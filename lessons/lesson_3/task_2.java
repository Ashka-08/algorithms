package lessons.lesson_3;

// односвязанный список

public class task_2 {
    public class Node {
        int value;
        Node next;
    }

    Node head; //голова

    public void revert() {
        if (head != null && head.next != null) {
            revert(head.next, head);
        }
    }

    private void revert (Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
        previousNode.next = null;
    }
    
}
