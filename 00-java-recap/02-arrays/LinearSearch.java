public class LinearSearch {
    public static int searchLinear(int arr[], int num){

        for(int i=0;i<=arr.length-1;i++){
            if(num == arr[i]){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {12,13,90,38,20,82};
        int find = searchLinear(arr, 20);
        System.out.println("the element found at index "+ find);
    }
}
