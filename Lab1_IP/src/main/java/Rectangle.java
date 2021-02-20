public class Rectangle extends Shape{
    private double height;
    private double width;
    Rectangle(){
        height=0;
        width=0;
    }
    public Rectangle setHeight(double x){

        height=x;
        onAreaChange();
        return this;
    };
    public Rectangle setWidth(double x){

        width=x;
        onAreaChange();
        return this;
    };
    public void onAreaChange(){
        area=height*width;
    };
}
