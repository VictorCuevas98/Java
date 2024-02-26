public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle (double width, double length, String color, boolean filled){
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String toString(){
        return super.toString() + " | width: " + getWidth() + " | length: " + getLength();
    }
}
