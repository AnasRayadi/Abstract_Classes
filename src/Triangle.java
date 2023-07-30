public class Triangle extends Shape{
    //Perimeter of a triangle = a + b +c
    //Area of a triangle = 1/2 b × h
    public double base,height,side1,side2;
    @Override
    public double getArea(){
        return 1/2 * (base*height);
    }
    @Override
    public double getPerimeter(){
        return base+side1+side2;
    }
}
