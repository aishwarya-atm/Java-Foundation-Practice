public class Problem4_FindLargestAndSmallestElement {
    public static void main(String[] args){
        int[] arr = {25, 10, 45, 5, 30};
        int max = arr[0], min = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Largest Element  = "+max);
        System.out.println("Smallest Element = "+min);
    }
}
