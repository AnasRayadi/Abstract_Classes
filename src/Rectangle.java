import java.util.Scanner;

public class Rectangle extends Shape{
    private double length;
    private double width;
    public void setLength(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the length (cm): ");
        double length =scanner.nextDouble();
        if(length<=0)
            System.out.println("the length most be positive value !");
        else
            this.length=length;
    }
    public void setWidth(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Width (cm):");
        double width=scanner.nextDouble();
        if (width<=0)
            System.out.println("the width most be positive value !");
        else
            this.width=width;
    }
    @Override
    public double getArea(){
        setLength();
        setWidth();
        return length * width;
    }
    @Override
    public double getPerimeter(){
        setLength();
        setWidth();
        return 2*(length+width);
    }
}
