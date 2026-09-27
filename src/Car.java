public class Car {

    private String brand;
    private Engine engine;

    public Car(String brand, String engineModel, int horsepower) {
        this.brand = brand;
        this.engine = new Engine(engineModel, horsepower);
    }

    public void showInformation() {
        System.out.println("Marca: " + brand);
        System.out.println("Motor: " + engine.getModel());
        System.out.println("Potencia: " + engine.getHorsepower() + " HP");
    }
}