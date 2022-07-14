//program to insert and print elements using 1D array
import java.util.Scanner;
public class Day15Array
{
    public static void main (String[] args)
    {
        //variable declaration
        int i,j;

        //Entering array size
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Array size : ");
        System.out.print("");
        int arraySize=scanner.nextInt();
        int[] a=new int[arraySize];

        //Entering elements into array
        System.out.println("Enter elements into array : ");
        for(i=0;i<a.length;i++)
        {
          System.out.print("a["+i+"] : ");
          a[i]=scanner.nextInt();
          System.out.println("");
        }
        //printing array elements

        for(j=0;j<a.length;j++)
        {
            System.out.print(j+"--->"+a[j]+"\n");
        }
        scanner.close();
    }

}
