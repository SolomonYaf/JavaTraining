package ArrayProblems;

public class IsMagicArray {
    public static void main(String[] args) {
        int[] arr1 = {21, 3, 7, 9, 11, 4, 6};
        int[] arr2 = {13, 4, 4, 4, 4};
        int[] arr3 = {0, 6, 8, 20};
        int[] arr4 = {5, 6, 8, 3, 5, 20};
        int []arr5 = { 8,6,3,5};
        System.out.println(isMagicArray(arr1));
        System.out.println(isMagicArray(arr2));
        System.out.println(isMagicArray(arr3));
        System.out.println(isMagicArray(arr4));
        System.out.println(isMagicArray(arr5));
    }

    public static int isMagicArray(int[] a) {
        int sum = 0;
        //if (a[0] == 0)
        //  return 1;
        for (int i=0; i<a.length; i++) {
            int count = 0;
            for (int j = 2; j <=a[i]/2; j++) {
                if (a[i] % j == 0)
                    count++;
            }
            if (count == 0 && a[i] > 0)
                sum += a[i];

        }

        if (sum == a[0])

            return 1;
        else
            return 0;
    }
}