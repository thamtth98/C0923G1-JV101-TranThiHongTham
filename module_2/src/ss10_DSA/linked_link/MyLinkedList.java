package ss10_DSA.linked_link;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {

    }

    public void addFirst(E element) {
        Node pointHead = head;
        head = new Node(element);
        head.next = pointHead;
        numNodes++;
    }

    public void addLast(E element) {
        Node pointHead = head;
        head = new Node(element);
        while (pointHead.next != null) {
            pointHead = pointHead.next;
        }
        pointHead.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element) {
        Node pointHead = head;
        Node holder;
        for (int i = 0; i < index - 1 && pointHead.next != null; i++) {
            pointHead = pointHead.next;
        }
        holder = pointHead.next;
        pointHead.next = new Node(element);
        pointHead.next.next = holder;
        numNodes++;
    }

    public Object get(int index) {
        Node pointHead = head;
        for (int i = 0; i < index; i++) {
            pointHead = pointHead.next;
        }
        return pointHead.data;
    }

    public int size() {
        return numNodes;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("False index: " + index);
        }
        Node pointHead = head;
        Object data;
        if (index == 0) {
            data = pointHead.data;
            head = head.next;
        } else {
            for (int i = 0; i < index - 1 && pointHead.next != null; i++) {
                pointHead = pointHead.next;
            }
            data = pointHead.next.data;
            pointHead.next = pointHead.next.next;
            numNodes--;
        }
        return (E) data;
    }

    public MyLinkedList<E> clone() {
        if (numNodes == 0) {
            throw new NullPointerException("This LinkedList is null");

        }
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        Node pointHead = head;
        returnLinkedList.addFirst((E) pointHead.data);
        pointHead = pointHead.next;
        while (pointHead != null) {
            returnLinkedList.addLast((E) pointHead.data);
            pointHead = pointHead.next;
        }
        return returnLinkedList;
    }
    public boolean contains(E element){
        Node pointHead = head;
        while (pointHead.next != null){
            if(pointHead.data.equals(element)){
                return true;
            }
            pointHead = pointHead.next;
        }
        return false;
    }

}
