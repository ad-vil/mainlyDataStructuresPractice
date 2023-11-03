package Lab6;
class Node{

    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class linkedList{
    Node head;

    public void insert(int data){
        Node newNode = new Node(data);
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


    public boolean find(int data){
        if(head == null){
            return false;
        }
        Node current = head;
        while(current.next != null){
            if(data == current.data)
                return true;
            current = current.next;
        }
        return false;
    }
    public void clear(){
        head = null;
    }
    public void delete(int data) {
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
        System.out.print("null");
        System.out.println();
    }
    public void convertToCircular(){

    }
}


public class Main {
    public static void main(String[] args) {
        linkedList linkedList = new linkedList();

        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(6);

        linkedList.display();

        linkedList.delete(3);
        linkedList.delete(4);

        linkedList.display();

        System.out.println("nodes in list: " + linkedList.countNode());

        int numToFind = 2;
        System.out.println("is " + numToFind + " in this list?: " + linkedList.find(2));

        linkedList.clear();
        System.out.println("nodes in list: " + linkedList.countNode());
        linkedList.display();
    }
}
