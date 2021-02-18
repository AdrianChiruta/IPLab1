public class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle setBase(double x){
        Triangle triunghi= new Triangle();
        triunghi.base=x;
        return triunghi;
    };
    public Triangle setHeight(double x){
        Triangle triunghi= new Triangle();
        triunghi.height=x;
        return triunghi;
    };
    public void onAreaChange(){};
}
