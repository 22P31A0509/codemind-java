import java.util.*;
public class Num
{
    public static void main(String args[])
    {
        int i;
        Scanner m=new Scanner(System.in);
        int a=m.nextInt();
        int b=m.nextInt();
        int c=m.nextInt();
        int y=(a*5)+(b*10);
        if(y<c)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(y/c);
        }
        
       
        
    }
}