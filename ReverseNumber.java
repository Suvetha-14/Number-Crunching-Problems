import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            int last_digit=num%10;
            rev=rev*10+last_digit;
            num=num/10;

        }
        System.out.println("Reverse of the number is : "+rev);
    }

}