package JavaLoops;

public class NestedForLoopTriangle2 {
    public static void main(String[] args) {
        int n=5;
        for (int i =1; i<=n; i++) {

            for (int j = i; j <=5 ; j++) {
                System.out.print(" " +"\t");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+"\t");

            }

            System.out.println();
        }

    }
}

