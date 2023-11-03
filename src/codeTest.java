public class codeTest {
    /*
    i just use this to test out blocks of code
    like small blocks from lectures, random practice
    problems on linkedin etc.
    */

    public static void main(String[] args) {
        codeTest codeTest = new codeTest();

        System.out.println(codeTest.hash("Hello", 10));

    }
    public int hash(String key, int tableSize){
        int hashValue = 0;

        for (int i = 0; i < key.length(); i++) {
            hashValue += key.charAt(i);
        }
        return hashValue % tableSize;
    }
}
