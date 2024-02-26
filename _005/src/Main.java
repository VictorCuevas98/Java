//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("red", true, 12.75);
        Rectangle rectangle = new Rectangle(15, 15, "yellow", false);
        Shape star = new Shape("green", false);

        System.out.println("Circle's Details: " + circle.toString());
        System.out.println("Rectangle's Details: " + rectangle.toString());
        System.out.println("Star's Details: " + star.toString());

    }
}