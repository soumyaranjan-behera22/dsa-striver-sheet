public class prime_check_optimize {
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
       boolean res= isPrime(10);
       System.out.println(res);
    }
}
