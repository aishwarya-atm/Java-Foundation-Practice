import java.util.Scanner;

public class Problem2_SumOf_N_Numbers {
    static int PrintSum(int n){
        if(n==0){
            return 0;
        }
        return n+PrintSum(n-1);
    }    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Sum = "+PrintSum(n));
        sc.close();
    }
}
