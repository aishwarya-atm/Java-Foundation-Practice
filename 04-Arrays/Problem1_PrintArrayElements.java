public class Problem1_PrintArrayElements {
    public static void main(String[] args){
        int[] arr = { 10,20,30,40,50};
        System.out.println("Length of the array = "+arr.length);
        System.out.print("Elements of the array = ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("First Element = "+arr[0]);
        System.out.println("Last Element  = "+arr[arr.length-1]);
    }
}
