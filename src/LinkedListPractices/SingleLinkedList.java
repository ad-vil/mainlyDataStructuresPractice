package LinkedListPractices;

class Node{
    int data;

    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SingleLinkedList {
    Node head;

    public void insert(int data){
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public boolean find(int key){
        if(head == null){
            System.out.println("the list is empty");
            return false;
        }
        if(head.data == key){
            System.out.println("found: " + key);
            return true;
        }

        Node current = head;
        while(current.next != null){
            if(current.data == key){
                System.out.println("found: " + key);
                return true;
            }
            current = current.next;
        }

        System.out.println(key + " is not in this list");
        return false;
    }

    public void clear(){
        head = null;
    }

    public void delete(int key){
        if (head == null){
            System.out.println("there is nothing to delete");
            return;
        }
        if (head.data == key){
            head = null;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
        else{
            System.out.println("the key: " + key + " is not in this list");
        }
    }

    public void display(){
        if(head == null){
            System.out.println("the list is empty");
        }
        else {
            Node current = head;
            while(current.next != null){
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.print(current.data + " -> null");
        }
        System.out.println();
    }
}
class Main{
    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();

        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(7);
        linkedList.insert(8);
        linkedList.insert(5);

        linkedList.find(3);
        linkedList.find(10);
        linkedList.find(7);

        linkedList.display();

        linkedList.delete(8);
        linkedList.delete(10);

        linkedList.display();

        linkedList.clear();

        linkedList.display();
    }
}
