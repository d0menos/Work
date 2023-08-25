public class Circle implements Shape{
    int r = 4;
    public double getArea(){
return Math.PI * (r * r);
    }
    public double getPerimeter(){
        return 2 * Math.PI * r;
    }

}
