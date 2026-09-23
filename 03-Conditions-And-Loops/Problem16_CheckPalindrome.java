import java.util.Scanner;  
public class Problem16_CheckPalindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int digit=sc.nextInt();
        int rem,rev=0,a=digit;
        while(a!=0){
            rem=a%10;
            rev =(rev*10)+rem;
            a/=10;
        }
        if(rev == digit){
            System.out.println(digit + " is palindrome.");
        }
        else{
            System.out.println(digit+" is not a palindrome.");
        }
    }
}
