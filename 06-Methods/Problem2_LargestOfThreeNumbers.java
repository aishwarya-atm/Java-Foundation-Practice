import java.util.Scanner;
public class Problem2_LargestOfThreeNumbers {
    static int LargestOfThree(int a , int b , int c){
        if(a > b && a > c){
            return a;
        }
        else if(b > a && b > c){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Largest of "+ a + " " + b +" and "+ c +" : " + LargestOfThree(a, b, c));
        sc.close();
    }
}
