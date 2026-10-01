import java.util.Scanner;

public class Problem4_Power {
    static int power(int num, int exp){
        if(exp == 0){
            return 1;
        }
        return num * power(num,exp-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Enter the exponent : ");
        int exp = sc.nextInt();
        System.out.println("Result = "+power(n, exp));
        sc.close();
    }
}
