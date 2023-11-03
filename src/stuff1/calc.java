package stuff1;

public class calc {
        public void add(int a, int b) {
            System.out.println("addition of 2 numbers = " + (a+b));
        }
        public void add(int a, int b, int c){

            System.out.println("addition of 3 numbers = " + (a+b+c));
        }
        public void multiply(int a, int b){
        System.out.println("multiplication of 2 numbers is: " + (a*b));
        }
        public void multiply(int a, int b, int c){
        System.out.println("multiplication of 2 numbers is: " + (a*b*c));
        }
}
class mycalc extends calc{
    public void multiply(int a, int b){
        System.out.println("multiplication of 2 numbers from mycalc is: " + (a*b));
    }
}
class main{
    public static void main(String[] args) {
            stuff1.mycalc mycalc = new stuff1.mycalc();
            mycalc.multiply(2,3);
    }
}