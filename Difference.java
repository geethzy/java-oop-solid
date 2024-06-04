public class Difference {

    static void staticMethod() {
        System.out.println("static methods can be called without creating objects");
    }

    public void publicMethod() {
        System.out.println("public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        staticMethod();

        // publicMethod(); - gives an error

        Difference myObj = new Difference();
        myObj.publicMethod();
    }

}
