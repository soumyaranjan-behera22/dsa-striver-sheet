public class ReverseArray {
    public static int[] arrayReverse(int arr[]){
        int first = 0;
        int last = arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            // swap
            int emp = arr[last];
            arr[last] = arr[first];
            arr[first] =emp;
            first++;
            last--;
        }
        return arr;
    }
    public static void main(String[] args) {
    int arr[] = {12,13,90,38,20,82};
    int rev[] = arrayReverse(arr);
        for(int i=0;i<rev.length-1;i++){
            System.out.println(rev[i]);
        }
    }
}
