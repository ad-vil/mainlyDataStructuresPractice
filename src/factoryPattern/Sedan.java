package factoryPattern;

public class Sedan implements Car{

    @Override
    public void assemble(){
        System.out.println("Sedan is being assembled");
    }
}
