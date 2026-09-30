import java.util.Scanner;

public class Problem7_countVowels {
    static int countVowels(String str){
        String str2 = str.toLowerCase();
        int count = 0;
        for(int i = 0 ; i < str2.length() ; i++){
            char c = str2.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Count of vowels = "+ countVowels(str));
        sc.close();
    }
}
