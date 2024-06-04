import java.util.Scanner;

public class Getinput {
    public static void main(String[] args) {

        System.out.println("Enter your name: ");
        try (Scanner myObj = new Scanner(System.in)) {
            String name = myObj.nextLine();
            System.out.println("Your name is " + name);
        }

    }
}
