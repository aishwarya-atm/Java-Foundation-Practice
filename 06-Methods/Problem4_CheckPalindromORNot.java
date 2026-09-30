import java.util.Scanner;

public class Problem4_CheckPalindromORNot {
    static void isPalindrome(int n){
        int a = n , rev = 0;
        while(a != 0){
            rev = (rev * 10)+(a%10);
            a/=10;
        }
        System.out.println("Original Number  : "+ n);
        System.out.println("Reversed Number  : "+rev);
        if(n == rev){
            System.out.println(n + " is Palindrome");
        }
        else{
            System.out.println(n + " is not a Palindrome");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        isPalindrome(n);
        sc.close();
    }
}
