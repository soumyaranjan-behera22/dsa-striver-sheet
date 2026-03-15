public class PrimeCheck {
    public static boolean isPrime(int n){
        boolean check = true;
        for (int i = 2; i<=n-1; i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        boolean x= isPrime(10);
        if(x == true){
        System.out.println("not prime");
        } else{
            System.out.println("prime");
        }
    }           
}
