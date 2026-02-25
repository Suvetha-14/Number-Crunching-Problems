
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=sc.nextInt();
        int n=num;
        int rev=0;
        while(num>0){
            int last_digit=num%10;
            rev=rev*10+last_digit;
            num=num/10;

        }
        if(n==rev){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }

    }
    
}
