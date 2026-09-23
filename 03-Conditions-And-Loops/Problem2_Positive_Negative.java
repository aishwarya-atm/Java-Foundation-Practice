import java.util.Scanner;
public class Problem2_Positive_Negative {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println(n + " is negative number.");
        }
        else if(n>0){
            System.out.println(n+ " is positive number.");
        }
        else{
            System.out.println(n + " is equal to zero");
        }
    }
}
