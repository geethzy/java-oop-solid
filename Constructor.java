public class Constructor {
    int modelYear;
    String modelName;

    // constructors can take arguments

    public Constructor(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Constructor myObj = new Constructor(2019, "iphone11");
        System.out.println("Phone is " + myObj.modelYear + " and " + myObj.modelName);

        Constructor myTab = new Constructor(2017, "samsungs6");
        System.out.println("Phone is " + myTab.modelYear + " and " + myTab.modelName);
    }

    // public Constructor() {
    // modelYear = 2019;
    // modelName = "iphone 11";
    // }

    // public static void main(String[] args) {
    // Constructor myObj = new Constructor();
    // System.out.println("Phone is " + myObj.modelYear + " and " +
    // myObj.modelName);
    // }
}
