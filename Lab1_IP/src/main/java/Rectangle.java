public class Rectangle extends Shape{
    private double height;
    private double width;
    public Rectangle setHeight(double x){
        Rectangle dreptunghi = new Rectangle();
        dreptunghi.height=x;
        return dreptunghi;
    };
    public Rectangle setWidth(double x){
        Rectangle dreptunghi = new Rectangle();
        dreptunghi.width=x;
        return dreptunghi;
    };
    public void onAreaChange(){};
}
