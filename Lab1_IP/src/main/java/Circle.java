public class Circle extends Shape {
    private double radius;
    private final double PI=3.14;
    public Circle setRadius(double r)
    {
        Circle cerc = new Circle();
        cerc.radius=r;
        return cerc;
    };
    public void onAreaChange(){
    };
}
