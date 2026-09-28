public class Problem02_PrintEvenNumbers {
    public static void main(String[] args){
        int[] num={1,2,3,4,5,6,7,8,9};
        System.out.print("Even numbers in the array: ");
        for(int i = 0; i < num.length ; i++){
            if(num[i] % 2 == 0){
                System.out.print(num[i]+" ");
            }
        }
        System.out.println();
    }
}
