import java.util.*;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        double a=read.nextDouble();
        double b=read.nextDouble();
        double c=read.nextDouble();
        double d=2*(a+b);
        double cost=d*c;
        System.out.printf("%.0f",(cost));
    }
}