package LW_01;

class Circle {
     final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

}
public class Q05 {
    public static void main(String[] args) {
        double r1 = 3.0;
        double r2 = 5.0;

        Circle innerCircle = new Circle(r1);
        Circle outerCircle = new Circle(r2);

        double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();

        System.out.println("Inner Circle Area is: " + innerCircle.computeArea());
        System.out.println("Outer Circle Area is : " + outerCircle.computeArea());
        System.out.println("Shaded Region Area is: " + shadedArea);
    }
}
