public class Problem1_DifferentExecutionOfMethods {
    static void greet(){
        System.out.println("Hello");
    }
    static void printName(String name){
        System.out.println("Name : "+ name);
    }
    static void add(int a, int b){
        System.out.println("Addtion = "+(a+b));
    }
    static int square(int n){
        return n*n;
    }
    static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        greet();
        printName("Aishwarya A T M");
        add( 10 , 20);
        int a = 5;
        int result = square(a);
        System.out.println("Square of "+ a + " = "+result);
        System.out.println("Is the number "+ a + " is even ? "+isEven(a));
    }
}
