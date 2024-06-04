import java.util.HashMap;

public class Hmap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("sL", "Kotte");
        capitalCities.put("korea", "Seoul");
        capitalCities.put("german", "Berlin");
        capitalCities.put("england", "london");

        System.out.println(capitalCities);

        capitalCities.get("SL");
        // capitalCities.set("france","paris");
        System.out.println(capitalCities);

    }
}
