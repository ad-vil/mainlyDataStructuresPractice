package Lab18;
import java.util.LinkedList;

public class HashT<T> {
    LinkedList<T>[] Table;

    HashT(int s) {
        Table = new LinkedList[s + (s / 3)];
    }

    public int Hash(T key) {
        int hash = key.hashCode() % Table.length;
        if (hash < 0) {
            hash += Table.length;
        }
        return hash;
    }

    public void insert(T obj) {
        int hash = Hash(obj);

        if (Table[hash] == null) {
            Table[hash] = new LinkedList<>();
        }

        Table[hash].add(obj);
    }

    public boolean find(T obj) {
        int hash = Hash(obj);
        LinkedList<T> list = Table[hash];

        if (list != null) {
            return list.contains(obj);
        }

        return false;
    }

    public void delete(T obj) {
        int hash = Hash(obj);
        LinkedList<T> list = Table[hash];

        if (list != null) {
            list.remove(obj);
        }
    }

    public void displayTable() {
        for (int i = 0; i < Table.length; i++) {
            System.out.print("index " + i + ": ");
            LinkedList<T> list = Table[i];

            if (list != null) {
                for (T item : list) {
                    System.out.print(item + " -> ");
                }
            }

            System.out.println("null");
        }
    }
}
