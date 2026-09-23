import java.util.Scanner;
public class Problem5_PassOrFail {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=sc.nextInt();
        if(a>=50){
            System.out.println("PASS.");
        }
        else{
            System.out.println("FAIL");
        }
    }
}
