import java.util.*;
public class Problem12_MultiplicationTable {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the multiplication table you want: ");
        int n=sc.nextInt();
        for(int i=1;i<=16;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}
