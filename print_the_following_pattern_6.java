import java.util.*;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}