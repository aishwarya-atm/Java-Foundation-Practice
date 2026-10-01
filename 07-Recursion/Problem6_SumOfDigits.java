import java.util.Scanner;

public class Problem6_SumOfDigits {
    static int Sum(int n){
        if( n == 0 ){
            return 0;
        }
        return (n%10) + Sum(n/10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Sum of digit " + n +" = " + Sum(n));
        sc.close();
    }
}
