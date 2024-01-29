import java.util.*;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner read =new Scanner(System.in);
        double a=read.nextDouble();
        double b=read.nextDouble();
        double c=1/a;
        double d=1/b;
        double e=c+d;
        double f=1/e;
        System.out.printf("%.0f",f);
    }
    
}