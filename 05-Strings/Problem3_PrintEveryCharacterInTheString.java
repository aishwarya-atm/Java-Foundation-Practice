public class Problem3_PrintEveryCharacterInTheString {
    public static void main(String[] args){
        String str = "HELLO";
        int n = str.length();
        for(int i = 0 ; i < n ; i++){
            System.out.println(str.charAt(i));
        }
    }
}
