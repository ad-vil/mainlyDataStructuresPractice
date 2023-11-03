package BST;

public class recursiveBST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    public recursiveBST() {
        root = null;
    }

    public void traverse (Node root) {
        //traverse to left
        //print root data
        //traverse to right
        if (root != null) {
            traverse(root.left);
            System.out.print(root.data + ", ");
            traverse(root.right);
        }
    }

    void insert(int key){
        root = insertHelper(root, key);
    }
    Node insertHelper(Node root, int key){
        if(root == null) {
            root = new Node(key);
            return root;
        }

        else if (key < root.data){
            root.left = insertHelper(root.left, key);
        }
        else if (key > root.data){
            root.right = insertHelper(root.right, key);
        }

        return root;
    }

    void find(int key){
        System.out.println("is " + key + " in the recursiveBST?: " + findHelper(root, key));
    }

    boolean findHelper(Node root, int key){
        if(root == null){
            return false;
        }
        else if (root.data == key) {
            return true;
        }
        else if(key<root.data){
            return findHelper(root.left, key);
        }
        else if(key> root.data){
            return findHelper(root.right, key);
        }
        return false;
    }
    public boolean search(int data) {
        return searchHelper(root, data);
    }
    private boolean searchHelper(Node root, int data) {

        if(root == null) {
            return false;
        }
        else if(root.data == data) {
            return true;
        }
        else if(root.data > data) {
            return searchHelper(root.left, data);
        }
        else {
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data) {

        if(search(data)) {
            removeHelper(root, data);
        }
        else {
            System.out.println(data + " could not be found");
        }
    }
    private Node removeHelper(Node root, int data) {

        if(root == null) {
            return root;
        }
        else if(data < root.data) {
            root.left = removeHelper(root.left, data);
        }
        else if(data > root.data) {
            root.right = removeHelper(root.right, data);
        }
        else { // node found
            if(root.left == null && root.right == null) {
                root = null;
            }
            else if(root.right != null) { //find a successor to replace this node
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            else { //find a predecessor to replace this node
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }
    private int successor(Node root) { //find least value below the right child of this root node
        root = root.right;
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }
    private int predecessor(Node root) {//find greatest value below the left child of this root node
        root = root.left;
        while(root.right != null){
            root = root.right;
        }
        return root.data;
    }


    public static void main(String[] args) {
        recursiveBST binaryTree = new recursiveBST();

        binaryTree.root = new Node(10);

        binaryTree.insert(3);
        binaryTree.insert(11);
        binaryTree.insert(4);
        binaryTree.insert(12);
        binaryTree.insert(20);
        binaryTree.insert(1);
        binaryTree.insert(8);
        binaryTree.insert(7);


        binaryTree.find(3);
        binaryTree.find(56);

        binaryTree.traverse(binaryTree.root);
        System.out.println();

        binaryTree.remove(4);
        binaryTree.remove(20);
        binaryTree.remove(0);

        binaryTree.traverse(binaryTree.root);
    }
}
