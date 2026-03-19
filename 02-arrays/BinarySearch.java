public class BinarySearch {   

   //this will work only on the sorted array
    
    public static int findBinarySearchApp1(int arr[],  int num){
        int start = 0;
        int end = arr.length-1;
        int mid = 0; 
        //here the loop and statements are completely different loops run their own and task is based on the index value

        for(int i=0; start<end ;i++){
            mid =(start+end)/2;
            if(num==arr[mid]){
                return mid;
            }
           else if(num>arr[mid]){
                start = mid+1;
            }
           else if(num<arr[mid]){
                end = mid-1;
            }
        }
        return -1;
    }

    public static int findBinarySearchApp2(int arr[],  int num){
        int start = 0;
        int end = arr.length-1;
        int mid = 0; 
        //here the loop and statements are completely different loops run their own and task is based on the index value
        // the index is returned as mid not the i "i" doing that work as iterate times of loop 
        for(int i=0;i<arr.length;i++){
            if(start>end){
                break;
            }
            mid =(start+end)/2;
            if(num==arr[mid]){
                return mid;
            }
           else if(num>arr[mid]){
                start = mid+1;
            }
           else if(num<arr[mid]){
                end = mid-1;
            }
        }
        return -1;
    }

    public static int findBinarySearchApp3(int arr[], int num){

        int start = 0;
        int end = arr.length - 1;

        for(int i = 0; i < arr.length; i++){

            if(start > end){
                break; // binary search terminate
            }

            int mid = (start + end) / 2;

            if(arr[mid] == num){
                return mid;
            }
            else if(num > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {12,13,15,18,20,25};
        // System.out.println(arr[arr.length-1]);
        int mid = findBinarySearchApp2(arr, 20);
        System.out.println("element is present at index "+mid);
    }
}
