import java.util.Scanner;

public class Problem1_Print_1ToN_And_Print_Nto1 {
    static void PrintNum(int n){
        if(n == 0) return;
        System.out.println(n);
        PrintNum(n-1);
    }
    static void PrintNumber(int n, int current){
        if(current > n) return;
        System.out.println(current);
        PrintNumber(n, current+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Numbers in correct order: ");
        PrintNumber(n, 1);
        System.out.println("Number in reverse order: ");
        PrintNum(n);
        sc.close();
    }
}
