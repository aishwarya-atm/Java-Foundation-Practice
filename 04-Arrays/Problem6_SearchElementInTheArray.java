public class Problem6_SearchElementInTheArray {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int search = 30 , found = 0 , i = 0 ;
        for(i = 0 ; i < arr.length ; i++){
            if(arr[i] == search){
                found = 1;
                break;
            }
        }
        if(found == 0){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at the index "+i);
        }
    }
}
