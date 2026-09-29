public class Problem2_StringMethods {
    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = "WORLD";
        String str3 = "Hello";
        System.out.println("Upper Case = "+str1.toUpperCase());
        System.out.println("Lower Case = "+str2.toLowerCase());
        System.out.println("String1 and String2 are equal = "+str1.equals(str2));
        System.out.println("String1 and String3 are equal = "+str1.equals(str3));
        System.out.println("String1 contains \'ell\' = "+str1.contains("ell"));
        System.out.println("String1 contains \'leo\' = "+str1.contains("leo"));
    }
}
