import java.util.Scanner;
public class SwapTwoNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Number : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Before Swapping ");
        System.out.println("----------------");
        System.out.println(num1);
        System.out.println(num2);
        int temp=num1;
        num1=num2;
        num2=num1;
        System.out.println("After Swapping ");
        System.out.println("----------------");
        System.out.println(num1);
        System.out.println(num2);

        
    }
}