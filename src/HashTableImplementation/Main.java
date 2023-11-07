package Lab18;

public class Main {
    public static void main(String[] args) {
        /*  just making sure my linkedList works before i start the hashmap
        Lab18.LinkedList<Integer> linkedList = new Lab18.LinkedList<>();

        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(1);
        linkedList.insert(4);

        linkedList.display();

        System.out.println(linkedList.find(4));
        System.out.println(linkedList.find(6));

        linkedList.delete(4);

        linkedList.display();

        linkedList.clear();

        linkedList.display();
         */

        HashT<Student> hashT = new HashT<>(20);

        Student student1 = new Student(3244, "john", 18);
        Student student2 = new Student(5612, "yesyesyes", 21);
        hashT.insert(student1);
        hashT.insert(student1); //collisions
        hashT.insert(student2);

        System.out.println(hashT.find(student1));

        hashT.delete(student1);

        hashT.displayTable();
    }
}
