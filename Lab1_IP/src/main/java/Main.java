public class Main {
    public static void main(String[] args)
    {
        Circle cerc = new Circle();
        cerc.setRadius(3);
        System.out.println(cerc.area);

        Rectangle dreptunghi = new Rectangle();
        dreptunghi = dreptunghi.setHeight(5);
        dreptunghi = dreptunghi.setWidth(10);
        System.out.println(dreptunghi.area);

        Triangle triunghi = new Triangle();
        triunghi = triunghi.setBase(3);
        triunghi = triunghi.setHeight(6);
        System.out.println(triunghi.area);

    }
}
