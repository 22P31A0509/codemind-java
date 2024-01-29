import java.util.*;
public class MyClass
{
    public static void main(String[] args)
    {
     Scanner read=new Scanner(System.in);
     int a=read.nextInt();
     int b=read.nextInt();
     int c=(a*a)+(b*b);
     double d=Math.sqrt(c);
     System.out.printf("%.2f",d);
    }
}