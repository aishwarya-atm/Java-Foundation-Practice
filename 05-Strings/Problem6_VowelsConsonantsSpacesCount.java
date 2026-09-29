public class Problem6_VowelsConsonantsSpacesCount {
    public static void main(String[] args){
        String str = "Java is a high level programming language";
        str = str.toLowerCase();
        int vow = 0 , cons = 0 , space = 0;
        for(int i = 0 ; i < str.length() ; i++){
            char s = str.charAt(i);
            if( s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u'){
                vow++;
            }
            else if(s >= 'a' && s <= 'z'){
                cons++;
            }
            else if(s == ' '){
                space++;
            }
        }
        System.out.println("Vowels     = "+vow);
        System.out.println("Consonants = "+cons);
        System.out.println("Spaces     = "+space);
    }
}
