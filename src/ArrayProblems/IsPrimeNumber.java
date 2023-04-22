package ArrayProblems;

public class IsPrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(41));
    }

public static int isPrimeNumber(int n){
    for (int i = 2; i < n; i++) {
        if (n%i==0){
            return 0;
        }
    }
     return 1;
    }
}
