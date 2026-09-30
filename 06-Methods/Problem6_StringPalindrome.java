import java.util.Scanner;

public class Problem6_StringPalindrome {
    static void isPalindrome(String str){
        int n = str.length();
        String str2 = "";
        for(int i = n - 1 ; i >= 0 ; i--){
            str2 += str.charAt(i);
        }
        System.out.println("Original String : "+str);
        System.out.println("Reversed String : "+str2);
        if(str.equals(str2)){
            System.out.println(str + " is a palindrome");
        }
        else{
            System.out.println(str + " is not a palindrome");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        isPalindrome(str);
        sc.close();
    }

}
