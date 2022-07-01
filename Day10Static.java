import java.util.Scanner;
public class Day10Static
{
    static int B,H;
    static boolean flag=false;
    static {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter breadth value : ");
        B=sc.nextInt();
        System.out.print("Enter Height value : ");
        H=sc.nextInt();
        if(B<=0 || H<=0){
            System.out.println("Equation has a negative value");
        }
        else
            flag=true;
    }
    public static void main (String []args)
    {
        if (flag==true){
            int Area=B*H;
            System.out.println("Area of parallelogram is  "+Area);
        }

    }
}
