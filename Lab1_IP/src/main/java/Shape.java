abstract public class Shape {
    protected double area;
    Shape(){
        area=0;
    }
    public double getArea(){return area;};
    abstract void onAreaChange();
}
