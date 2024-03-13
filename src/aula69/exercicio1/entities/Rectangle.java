package aula69.exercicio1.entities;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle() {
    }

    public double area() {
        return this.width * this.height;
    }

    public double perimeter() {
        return 2.0 * this.width * this.height;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(this.width, 2.0) + Math.pow(this.height, 2.0));
    }
}
