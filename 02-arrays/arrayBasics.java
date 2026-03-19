// taking input in an array

import java.util.Scanner;
public class arrayBasics{
    public static int basic(int arr[]){
        int len = arr.length-1;
        System.out.println("enter the elements");
        for(int i=0;i<=len;i++){
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
    System.out.println("the elemenhts are ");

        for(int i=0;i<=len;i++){
            System.out.print(arr[i]+" ");
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        basic(arr);
    }
}