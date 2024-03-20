import java.util.*;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=1;j--)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}