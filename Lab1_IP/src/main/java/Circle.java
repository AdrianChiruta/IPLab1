public class Circle extends Shape {
    private double radius;
    private final double PI=3.14;
    Circle(){
        radius=0;
    }
    public Circle setRadius(double r)
    {
        radius=r;
        onAreaChange();
        return this;
    };
    public void onAreaChange(){
        area=PI*radius*radius;
    };
}
