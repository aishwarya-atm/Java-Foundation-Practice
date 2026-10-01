import java.util.Scanner;

public class Problem7_ReverseANumber {
    static int Reverse(int n,int rev){
        if(n == 0){
            return rev;
        }
        return Reverse(n/10 , (rev * 10)+(n % 10));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Reversed number : " + Reverse(n,0));
        sc.close();
    }
}
