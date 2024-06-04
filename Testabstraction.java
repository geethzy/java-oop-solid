// Abstract class
abstract class Testabstraction {
    // Abstract method (does not have a body)
    public abstract void TestabstractionSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Testabstraction)
class Pig extends Testabstraction {
    public void TestabstractionSound() {
        // The body of TestabstractionSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

// class Main {
// public static void main(String[] args) {
// Pig myPig = new Pig(); // Create a Pig object
// myPig.TestabstractionSound();
// myPig.sleep();
// }
// }