// 2. Create a base class "Shape" with methods to calculate the area and perimeter (pure virtual). 
// Implement derived classes "Rectangle" and "Circle" 
// that inherit from "Shape" and provide their own area and perimeter calculations.

import java.util.Scanner;

abstract class Shape {

    abstract double area();
    abstract double perimeter();
}

class Rectangle extends Shape {

    private double length;
    private double width; 
    Rectangle(double length, double width) {

        this.length = length;
        this.width = width;
    }

    @Override
    double area() {

        return length * width;
    }

    @Override
    double perimeter() {

        return 2 * (length * width);
    }
}

class Circle extends Shape{

    private double radious;
    final double PI = Math.PI;

    Circle(double radious) {

        this.radious = radious;
    }

    @Override
    double area() {

        return PI * radious * radious;
    }

    @Override
    double perimeter() {

        return 2 * PI * radious;
    }
}

class Client {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        double length = sc.nextDouble();
        
        System.out.print("Enter width : ");
        double width = sc.nextDouble();

        Rectangle rectangle1 = new Rectangle(length,width);
        System.out.println("Area of rectangle " + rectangle1.area());
        System.out.println("Perimeter of rectangle " + rectangle1.perimeter());

        System.out.print("Enter the radious : ");
        double radious = sc.nextDouble();

        Circle circle1 = new Circle(radious);
        System.out.println("Area of circle : " + circle1.area());
        System.out.println("Perimeter of circle : " + circle1.perimeter());

    }
}