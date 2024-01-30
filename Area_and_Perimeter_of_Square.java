import java.util.*;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        double side=read.nextDouble();
        double area=side*side;
        double perimeter=4*side;
        System.out.printf("%.0f",area);
        System.out.printf("% .0f",perimeter);
    }
}