package assignment1;
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    void specificToCircle() {
        System.out.println("This is a circle operation");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }

    void specificToRectangle() {
        System.out.println("This is a rectangle operation");
    }
}

public class Question5 {
    public static void main(String[] args) {
        // Upcasting
        Shape shape = new Circle(); 
        shape.draw();
       

        shape = new Rectangle(); 
        shape.draw(); 
     

        // Downcasting
        Shape shape1 = new Circle();
        if (shape1 instanceof Circle) {
            Circle circle = (Circle) shape1; 
            circle.draw(); 
            circle.specificToCircle();
        }

        Shape shape2 = new Rectangle();
        if (shape2 instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape2; 
            
            rectangle.draw(); 
            
            rectangle.specificToRectangle(); 
            
        }
    }
}
