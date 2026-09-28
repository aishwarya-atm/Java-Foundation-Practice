public class Problem3_FindSumAndAverage {
    public static void main(String[] args){
        int[] arr = {80,70,90,60,100};
        int n = arr.length;
        int sum=0,avg;
        for(int i = 0 ; i < n ; i++){
            sum+=arr[i];
        }
        avg = sum / n;
        System.out.println("Sum      = "+sum);
        System.out.println("Average  = "+avg);
    }
}
