import java.util.*;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
         int inches=read.nextInt();
         double centimeters=inches*2.54;
         System.out.printf("%.2f",centimeters);
    }
}