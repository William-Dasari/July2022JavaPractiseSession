import java.util.Scanner;
public class Day10inttostring
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Integer ");
        int i=sc.nextInt();
        System.out.print("Enter another value to add ");
        int j=sc.nextInt();
        int k=i+j;
        System.out.println("Addition of given number if it is Integer "+k);
        String s=String.valueOf(i);
        System.out.println("After converting to string the addition of both the numbers will be "+s+j);

    }
}
