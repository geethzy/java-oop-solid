public class Objectesr {

    // can have multiple attributes and and multiple classes

    int x = 5; // if final keyword is used cannot override

    public static void main(String[] args) {
        Objectesr firstObj = new Objectesr();
        firstObj.x = 43; // override the value or can modidfy the attribute
        System.out.println(firstObj.x); // class attributes/variables/fileds can access in object using the dot
    }
}
