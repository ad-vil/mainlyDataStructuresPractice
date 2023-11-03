package factoryPattern;

public class CarFactory implements xCarFactory{
    //driver class
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car suv = carFactory.createCar("suv");
        suv.assemble();

        Car sedan = carFactory.createCar("sedan");
        sedan.assemble();

        Car hatchback = carFactory.createCar("hatchback");
        hatchback.assemble();

    }

    @Override
    public Car createCar(String type) {
        if (type.equalsIgnoreCase("SUV")){
            return new SUV();
        }
        else if (type.equalsIgnoreCase("sedan")){
            return new Sedan();
        } else if (type.equalsIgnoreCase("hatchback")) {
            return new Hatchback();
        }
        else return null;
    }
}
