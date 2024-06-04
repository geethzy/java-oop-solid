import java.util.ArrayList;

public class Alist {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Axio");
        cars.add("Lancer");
        cars.add("Aqua");
        System.out.println(cars);
        int size = cars.size();
        System.out.println("array size is " + size);

        cars.set(0, "Prius");

        String r = cars.get(0);
        System.out.println("First item is " + r);

        cars.remove(3);
        System.out.println(cars);

        cars.clear();
        System.out.println(cars);

    }
}
