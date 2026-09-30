import java.util.Scanner;

public class Problem5_Prime{
    static void isPrime(int n){
        int found = 0;
        for(int i = 2 ; i < n ; i++){
            if(n % i == 0){
                System.out.println(n + " is not a prime number");
                found = 1;
                break;
            }
        }
        if(found == 0){
            System.out.println(n + " is a prime number");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        isPrime(n);
        sc.close();
    }
}