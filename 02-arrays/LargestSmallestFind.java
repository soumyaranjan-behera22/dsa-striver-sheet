// import java.util.*;
public class LargestSmallestFind {
    public static int findLargest(int arr[]){
        int largerInt =Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>largerInt){
                largerInt = arr[i];
            }
            
        }
        return largerInt;
    }
    public static int secLargest(int arr[]){
        int large = Integer.MIN_VALUE;
        int secLarge = 0 ;
        for(int i =0 ; i<arr.length;i++){
            if(arr[i]>large){
                secLarge = large;
                large = arr[i];
            }
        }
        return secLarge;
    }
    public static int findSmallest(int arr[]){
        int SmallerInt =Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<SmallerInt){
                SmallerInt = arr[i];
            }
            
        }
        return SmallerInt;
    }
    public static int secSmallest(int arr[]){
        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;
        for(int i =0 ; i<arr.length;i++){
            if(arr[i]<small){
                small = secSmall;
                secSmall = arr[i];
            }
        }
        return secSmall;
    }
    public static void main(String[] args) {
        int arr[] = {12,13,90,38,20,192,82};
        int max = findLargest(arr);
        int min = findSmallest(arr);
        System.out.println("max num is "+max);
        System.out.println("min is  "+min);
        int secLarge = secLargest(arr);
        int secSmall = secSmallest(arr);
        System.out.println("second large is "+secLarge); 
        System.out.println("second min is  "+secSmall);
    }
}
