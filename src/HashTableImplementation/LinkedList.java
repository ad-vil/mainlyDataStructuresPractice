package Lab18;

public class LinkedList<T extends Comparable<T>> {
    Node head;

    public void insert(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public boolean find(T data){
        if(head == null){
            return false;
        }
        Node current = head;
        while(current != null){
            if(data.equals(current.data))
                return true;
            current = current.next;
        }
        return false;
    }

    public void clear(){
        head = null;
    }
    public void delete(T data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public int countNode(){
        if(head == null){
            return 0;
        }
        Node current = head;
        short count = 0;
        while(current.next!=null){
            current = current.next;
            count++;
        }
        return count;
    }

    public void display(){
        Node current = head;

        if(head == null){
            System.out.println("list is empty");
            return;
        }
        while(current.next != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println(current.data + " -> null");
        System.out.println();
    }
}
