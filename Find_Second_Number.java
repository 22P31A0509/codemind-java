import java.util.*;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        double a=read.nextDouble();
        double b=read.nextDouble();
        double c=(a*2)-b;
        System.out.printf("%.0f",c);
    }
}