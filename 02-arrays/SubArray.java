public class SubArray {


    public static void subArray(int  arr[] ) {
        for(int i=0;i<arr.length;i++){

            for(int j=0 ;j<arr.length;j++){
// MISTAKE
// Note: j = i se start karna zaroori hai.
// Agar j = 0 karenge to har iteration me j reset ho jayega.
// Example: i = 2, j = 0 → start > end jo ki k ke andar nhi ata (k ka kam he i se ja ke beech ki otems print karna) ho jayega aur invalid/empty subarray banega.
// Subarray rule: start index ≤ end index, isliye j = i use karte hain.
                System.out.print("[");
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                }
                System.out.print("]");
                // System.out.println("");
            }
        }
    }
    public static void subArrayApp2(int  arr[] ) {
        for(int i=0;i<arr.length;i++){
            for(int j=i ;j<arr.length;j++){
                System.out.print("[");
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                }
                System.out.print("]");
                System.out.println("");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]= {5,6,7,8};
        // subArray(arr);
        subArrayApp2(arr);
    }
}
