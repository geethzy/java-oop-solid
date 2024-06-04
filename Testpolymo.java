// animalsound has many forms

public class Testpolymo {
    public void animalSound() {
        System.out.println("animals make sound but has different ways");
    }
}

class Pigs extends Testpolymo {
    public void animalSound() {
        System.out.println("pig: oink oink");
    }

}

class Cats extends Testpolymo {
    public void animalSound() {
        System.out.println("cat: meow meow");
    }
}

// class Main {
// public static void main(String[] args) {
// Testpolymo myAnimal = new Testpolymo();
// Testpolymo myPig = new Pigs();
// Testpolymo myCat = new Cats();

// myAnimal.animalSound();
// myPig.animalSound();
// myCat.animalSound();

// }
// }