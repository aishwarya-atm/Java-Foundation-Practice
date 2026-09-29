public class Problem5_PalindromeOrNot {
    public static void main(String[] args){
        String str = "madam";
        String strcpy = "";
        int n = str.length();
        for(int i = n-1 ; i >= 0 ; i--){
            strcpy += str.charAt(i);
        }
        if(str.equals(strcpy)){
            System.out.println(str+" is a Palindrome");
        }
        else{
            System.out.println(str+ " is not a palindrome");
        }
    }
}
