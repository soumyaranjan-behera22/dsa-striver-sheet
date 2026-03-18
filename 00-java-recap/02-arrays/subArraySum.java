public class subArraySum{
    public static int sumSubArray(int arr[]) {
        int n=arr.length;
        int maxSum = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum=0;
                for(int k =i;k<=j;k++){
                    sum+=arr[k];
                    if(sum>maxSum){
                        maxSum=sum;
                    }
                    // System.err.print(arr[k]);
                }
                // System.out.println();
            }
        }
        return maxSum;
        
    }
public static void main(String[] args) {
     int arr[] = {4,5,6};
       int max=  sumSubArray(arr);
       System.out.println(max);
}
}