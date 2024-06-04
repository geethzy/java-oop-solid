public class Testinheritance { // vehicle

    protected String brand = "Lancer";

    public void honk() {
        System.out.println("HOink... HOIINk..");
    }

}

class Car extends Testinheritance {
    private String modelName = "Mustang";

    public static void main(String args[]) {
        Car myFastCar = new Car();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
}
