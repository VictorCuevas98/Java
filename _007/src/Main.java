//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Tus zonas erroneas", "Wayne", 2014);

        book1.displayInfo();
        book2.displayInfo();
    }
}