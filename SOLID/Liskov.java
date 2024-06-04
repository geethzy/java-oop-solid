package SOLID;

public class Liskov {

}

class Rectangle {
    protected int width, height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    public Square() {
    }

    public Square(int size) {
        width = height = size;
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}

// ************ANOTHER EXAMPLE

class Student {
    private double height;
    private double weight;

    public void setHeight(double h) {
        height = h;
    }

    public void setWeight(double w) {
        weight = w;
    }
}

class StudentBMI extends Student {
    public void setHeight(double h) {
        super.setHeight(h);
        super.setWeight(h);
    }

    public void setWeight(double w) {
        super.setHeight(w);
        super.setWeight(w);
    }
}
// StudentBMI class has extra constraints i.e.
// height and weight that must be the same. Therefore,
// the Student class (base class)
// cannot be replaced by StudentBMI class (derived class)