import java.util.Scanner;
public class primeCheckOptimized {
    public static boolean isPrime(int n){
        boolean check = true;
        for(int i =2;i*i<n;i++){
            if(n%i == 0){
                return false;
            }
            return true;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
       boolean res= isPrime(n);
       System.out.println(res);
    }
}
