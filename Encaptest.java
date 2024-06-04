import multipleclass.Encapobj;

public class Encaptest {

    // gives error
    // public static void main(String[] args) {
    // Encaptest newObj = new Encaptest();
    // newObj.name = "john";
    // System.out.println(newObj.name);
    // }

    public static void main(String[] args) {
        Encapobj newObj = new Encapobj();
        newObj.setName("john");
        System.out.println(newObj.getName());
    }
}