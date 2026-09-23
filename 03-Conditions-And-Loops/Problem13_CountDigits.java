import java.util.*;
public class Problem13_CountDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
       System.out.println("Digit Count = "+ count);
    }
}
