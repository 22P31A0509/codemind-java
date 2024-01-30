import java.util.*;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        double costprice=read.nextDouble();
        double sellingprice=read.nextDouble();
        double lossprice=sellingprice-costprice;
        double losspercentage=(lossprice/costprice)*100;
        System.out.printf("%.2f",losspercentage);
    }
}