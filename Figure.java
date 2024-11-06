public abstract class Figure {
    public abstract void calArea();
    public void showArea(){
        calArea();
    }
}

class Rectangle extends Figure {
    double length;
    double width;
    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }
    
    @Override 
    public void calArea() {
        System.out.println("Area: " + length * width);
    }
}

class Circle extends Figure {
    double radius;
    Circle(double r) {
        this.radius = r;
    }
    @Override 
    public void calArea() {
        System.out.println("Area: " + Math.PI * radius * radius);
    }

    @Override
    public void showArea() {
        calArea();
    }
}