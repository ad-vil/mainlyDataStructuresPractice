package LinkedList_Singular;

class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class LinkedList {
    static Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public void append(int data ){
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

    public void display(){
        Node current = head;
        while(current.next != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println(current.data);
    }

    public void remove(int data){
        if(head == null){
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    public void removeAll(int data){
        if(head == null){
            return;
        }
        if (head.data == data) {
            head = head.next;
        }
        Node current = head;
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
            }
            current = current.next;
        }
        return;
    }

    public void find(int data){
        int index = 0;
        if(head.data == data){
            System.out.println(index);
            return;
        }
        Node current = head;
        while(current.next != null){
            index++;

            if(current.next.data == data){
                System.out.println(index);
                return;
            }
            current = current.next;
        }
        System.out.println(-1);
        return;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(head);

        linkedList.append(2);
        linkedList.append(5);
        linkedList.append(3);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(2);
        linkedList.append(8);

        linkedList.display();

        linkedList.removeAll(2);

        linkedList.display();

        linkedList.find(9);
    }
}
