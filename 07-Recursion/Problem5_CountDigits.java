import java.util.Scanner;

public class Problem5_CountDigits {
    static int countDigit(int n){
        if(n == 0){
            return 0;
        }
        return 1 + countDigit(n/10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Count of digits in " + num + " = " + countDigit(num) );
        sc.close();
    }
}
