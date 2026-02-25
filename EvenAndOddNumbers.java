import java.util.Scanner;
public class EvenAndOddNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=sc.nextInt();
        System.out.println("Even Numbers : ");
        for(int i=0;i<=num;i++){
            if(i%2==0){
            System.out.println(i);
        }
    }
        System.out.println("Odd Numbers : ");
        for(int i=0;i<=num;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }


    }
    
}
