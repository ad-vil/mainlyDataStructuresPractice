package factoryPattern;

public class Hatchback implements Car{
    @Override
    public void assemble() {
        System.out.println("Hatchback is being assembled");
    }
}
