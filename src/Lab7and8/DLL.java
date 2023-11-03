package Lab7and8;

public class DLL <T extends Comparable<T>>{
    class Node{
        Node next;
        Node prev;

        T data;

        public Node(T data){
            this.data = data;
        }
    }

    Node head;
    Node tail;
    int length;

    public DLL(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void insert(T data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
        }
        else {
            newNode.prev = tail;
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }
    public Node find(T value){
        Node current = head;

        while(current.next != null){
            if(current.data == value){
                System.out.print("BST " + value + " is present at index: ");
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public void remove(T data){
        //case 1: list is empty
        if(isEmpty()){
            System.out.println("list is empty: there's nothing to remove");
            return;
        }
        //case 2 node to remove is head
        if(head.data == data){
            head = head.next;
            head.prev = null;
            length--;
            return;
        }
        //case 3 node to remove is tail
        if(tail.data == data){
            tail = tail.prev;
            tail.next = null;
            length--;
            return;
        }
        Node current = head;
        while (current.next!= null){
            if(current.data.equals(data)){
                current.prev.next = current.next;
                current.next.prev = current.prev;
                length--;
                return;
            }
            current = current.next;
        }
    }
    public void insertInOrder(T data){

    }
    public boolean isEmpty(){
        return head==null;
    }
    public void display(){
        Node current = head;
        if(isEmpty()){
            System.out.println("the list is currently empty");
        }
        else{
            while (current.next!= null){
                System.out.print(current.data + " <-> ");
                current = current.next;
            }
            System.out.print(current.data);
            System.out.println();
        }
    }
    public void clear(){
        head = null;
        display();
    }
    public int nodeCount(){
        return length;
    }
    public void reverse(){
        if(head == null){
            System.out.println("list is empty, cant reverse");
            return;
        }
        else{
            Node current = head;
            Node temp;

            while(current != null){
                temp = current.prev;
                current.prev = current.next;
                current.next = temp;
                current = current.prev;
            }
            temp = head;
            head = tail;
            tail = temp;
            System.out.println("reverse complete");
        }
    }

}
class Main{
    public static void main(String[] args) {
        DLL<Integer> list = new DLL<>();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        list.display();

        System.out.println("is the list empty?: " + list.isEmpty());

        int valueToFind = 3;
        System.out.println(list.find(valueToFind).data);

        System.out.println("length of list: " + list.nodeCount());

        list.remove(3);

        list.display();


        System.out.println("current list: "); list.display();
        list.reverse();
        System.out.println("reversed list: "); list.display();
        list.clear();
    }
}
