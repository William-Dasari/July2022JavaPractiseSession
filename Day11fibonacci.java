import java.util.Scanner;
public class Day11fibonacci
{
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number to check the fibonacci : ");
        int fib=scanner.nextInt();
        int first=0,second=1,count=0;
        System.out.println(first+"  Fibonacci series");
        while(count<=fib){
            System.out.print(first+" ");
            int actual=first+second;
            first=second;
            second=actual;
            count =count+1;
        }
    }
}
