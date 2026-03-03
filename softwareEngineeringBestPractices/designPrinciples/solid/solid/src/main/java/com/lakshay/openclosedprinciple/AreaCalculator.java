package com.lakshay.openclosedprinciple;

// 2️⃣ Open/Closed Principle (OCP)

//✅ Correct – Extend, don’t modify
//✔ Add new shape → just create new class. No modification needed.

interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double radius;
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double length, width;
    public double calculateArea() {
        return length * width;
    }
}

class AreaCalculator {
    double calculate(Shape shape) {
        return shape.calculateArea();
    }
}

// ❌ Wrong – Modify class when adding new shape
//____________________________________________________
//public class AreaCalculator {
//    double calculate(Object shape) {
//        if (shape instanceof Circle) {
//            return Math.PI * ((Circle) shape).radius * ((Circle) shape).radius;
//        } else if (shape instanceof Rectangle) {
//            return ((Rectangle) shape).length * ((Rectangle) shape).width;
//        }
//        return 0;
//    }
//}
//____________________________________________________
