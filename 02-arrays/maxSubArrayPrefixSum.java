public class maxSubArrayPrefixSum {
    public static int prefixSum(int arr[]){
int sum =0;
int max = Integer.MIN_VALUE;

        int pref[] = new int[arr.length];
        pref[0] = arr[0];
        for(int i=1;i<pref.length;i++){

            // if i starts from 0 then the loop goes through contions like if prev[i] ==0 then prev[i] me arr[0] valeue store karo

            pref[i] = pref[i-1]+arr[i];
        }
        // for(int i=0;i<pref.length;i++){
        //     System.out.println(pref[i]);
        // }


        // max sub array sum using prefix sum
        for(int i =0;i<arr.length;i++){
            sum =0 ;
            for(int j=i;j<arr.length;j++){
                if(i == 0){ // mistake was i check pref[i] == 0 the value withe the index which is wrong the index with index
                    sum = pref[j];
                }
                else{
                sum = pref[j] - pref[i-1];
                }

              if(max<sum){
                max = sum;

              }
            }
         
        }
         return max;
    
   
    } 

    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        // int arr[] = {-14,-81,-12,-20};

        int max = prefixSum(arr);
        System.out.print(max);
    }
}
