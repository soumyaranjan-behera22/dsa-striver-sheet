public class maxSumSubarrayKadane {
    public static int kadane(int arr[]){
        int curSum = 0;
        int Max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            curSum +=arr[i];
            if(curSum<0){
                curSum=0;
            }
            if(curSum>Max){
                Max = curSum;
            }
        }
        return Max;
    }
    // errors in the all negative case
    
    public static int kadaneForNeg(int arr[]){
        int curSum =0;
        int max =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            curSum+=arr[i];
            // here the negative values are also compared in case of all negative 
            if(curSum>max){
                max = curSum;
            }

            if(curSum<0){
                curSum = 0;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        // int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        // int arr[] = {-1,-2,-3,-4};
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        int max = kadaneForNeg(arr);
        int max2 = kadane(arr);
        System.out.println(max);
        System.out.println(max2);
    }
}
