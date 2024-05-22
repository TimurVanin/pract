package list1.prac2;
class Point {
    private double x; // Координата x точки
    private double y; // Координата y точки
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
}
class Circle {
    private Point center;
    private double radius;
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    public Point getCenter() {
        return center;
    }
    public double getRadius() {
        return radius;
    }
}
class Tester {
    public static void main(String[] args) {
        Point center1 = new Point(1.0, 2.0);
        Point center2 = new Point(3.0, 4.0);
        Circle circle1 = new Circle(center1, 5.0);
        Circle circle2 = new Circle(center2, 3.0);
        Circle[] circles = {circle1, circle2};
        for (int i = 0; i < circles.length; i++) {
            System.out.println("Окружность " + (i + 1));
            System.out.println("Центр: (" + circles[i].getCenter().getX() + ", " + circles[i].getCenter().getY() + ")");
            System.out.println("Радиус: " + circles[i].getRadius());
            System.out.println();
        }
        System.out.println("Количество окружностей в массиве: " + circles.length);
    }
}