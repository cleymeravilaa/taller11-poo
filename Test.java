public class Test {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(5, 10);
        r.showArea();
        Circle c = new Circle(5);
        c.showArea();

        System.out.println("\n-----------------------------------------------\n");
        Employee e = new Manager("Carlos", 30, 10000, 100);
        e.showDetails();
        e = new SalesPerson("Juan", 25, 5000, 200);
        e.showDetails();
    }
}
