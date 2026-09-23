import java.util.Scanner; 
public class Problem18_PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int flag=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(n+" is prime number.");
        }
        else{
            System.out.println(n+" is not a prime number.");
        }
    }
}
