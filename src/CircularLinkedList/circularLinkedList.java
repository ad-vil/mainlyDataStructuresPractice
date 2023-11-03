package CircularLinkedList;

class circularLinkedList {
    public class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void display(){
        Node current = head;
        while(current.next != tail.next){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print(current.data + " -> " + "(" + head.data + ")");
    }

    public static void main(String[] args) {
        circularLinkedList circularLinkedList = new circularLinkedList();

        circularLinkedList.insert(1);
        circularLinkedList.insert(2);
        circularLinkedList.insert(3);
        circularLinkedList.insert(4);
        circularLinkedList.insert(5);

        circularLinkedList.display();
    }
}