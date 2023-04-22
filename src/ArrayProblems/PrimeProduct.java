package ArrayProblems;

public class PrimeProduct {
    public static void main(String[] args) {

        System.out.println(isPrimeProduct(125));
    }

    public static int isPrimeProduct(int n) {

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {

                for (int j = 2; j < i; j++) {
                    if (i % j == 0)
                        return 0;
                }
            }
            for (int k = i + 1; k < n; k++) {

                if (n % k == 0) {

                    for (int l = 2; l < k; l++) {
                        if (k % l == 0) {
                            return 0;
                        }
                    }
                }

            }

        }

        return 1;

    }

}




