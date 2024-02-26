public class Circle extends Shape{
    private double radius;

    public Circle (String color, boolean filled, double radius){
        super(color, filled);
        setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + " | radius: " + getRadius();
    }
}
