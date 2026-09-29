public class Problem4_ReverseAString {
    public static void main(String[] args){
        String str = "Technology";
        String strcpy = "";
        int n = str.length();
        for(int i = n-1 ; i >= 0 ; i--){
            strcpy += str.charAt(i);
        }
        System.out.println("Copied String = "+strcpy);
    }
}
