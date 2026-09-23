import java.util.Scanner;
public class Problem4_GreatestOfThreeNumbers {
  public static void main(String[] args){
    System.out.println("Enter three numbers: ");
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    int c= sc.nextInt();
    if(a>b && a>c){
        System.out.println(a + " is greater than other three numbers.");
    }
    else if(b>c && b>a){
        System.out.println(b + " is greater than other three numbers.");
    }
    else{
        System.out.println(c + " is greater than other three numbers.");
    }
  }  
}
