package FactoryPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape you want to draw: ");
        String shapeType = sc.nextLine().toUpperCase();
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape(shapeType);
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Shape not found");
        }
        sc.close();
    }
}
