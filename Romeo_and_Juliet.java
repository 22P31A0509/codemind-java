import java.util.*;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int x=read.nextInt();
        int y=read.nextInt();
        int z=read.nextInt();
        int a=((x*5)+(y*10))/z;
        System.out.println(a);
    }
}