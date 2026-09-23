import java.util.Scanner; 
public class Problem15_ReverseANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int digit=sc.nextInt();
        int rev=0,rem,a=digit;
        while(a!=0){
            rem=a%10;
            rev=(rev*10)+rem;
            a/=10;
        }
        System.out.println("Original digit: "+digit); 
        System.out.println("Reversed Digit = "+rev);
    }
}
