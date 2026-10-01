import java.util.Scanner;

public class Problem9_PalindromeOrNot {
    static boolean isPalindrome(String str){
        if(str.length() <= 1 ){
            return true;
        }
        if(str.charAt(0) != str.charAt(str.length() - 1)){
            return false;
        }
        return isPalindrome(str.substring(1,str.length() - 1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        if(isPalindrome(str)){
            System.out.println(str + " is a palindrome.");
        }
        else{
            System.out.println(str + " is not a palindrome.");
        }
        sc.close();
    }
}
