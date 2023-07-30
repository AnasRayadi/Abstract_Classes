public class Circle extends Shape{
    public final double PI = 3.14;
    public double rayon;
    @Override
    public double getArea(){
        return PI*(rayon*rayon);
    }
    @Override
    public double getPerimeter(){
        return 2 * PI * rayon;
    }

}
