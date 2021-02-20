public class Triangle extends Shape{
    private double base;
    private double height;
    Triangle(){
        base=0;
        height=0;
    }
    public Triangle setBase(double x){

        base=x;
        onAreaChange();
        return this;
    };
    public Triangle setHeight(double x){

        height=x;
        onAreaChange();
        return this;
    };
    public void onAreaChange(){
        area=base*height/2;
    };
}
