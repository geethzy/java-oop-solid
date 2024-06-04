public class Method {

    // defining a method
    static void myMethod() {
        System.out.println("I am excited");
    }

    // passing multiple parameters
    static void namePrint(String fname, int age) {
        System.out.println("My first name is " + fname + ". My age is " + age);
    }

    // return value - RETURN KEYWORD
    static int addNum(int num) {
        return 5 + num;
    }

    // MAIN METHOD
    public static void main(String[] args) {
        myMethod();

        namePrint("Chathu", 21);
        // fname is a parameter and "chathu" is a arguments

        System.out.println(addNum(3));
        int result = addNum(3); // recommmended way
        System.out.println(result);

    }
}