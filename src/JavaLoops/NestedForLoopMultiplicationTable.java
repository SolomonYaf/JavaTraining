package JavaLoops;

public class NestedForLoopMultiplicationTable {
    public static void main(String[] args) {
        for (int i=1;i<=12; i++){
            for (int j=1; j<=12;j++){
               System.out.print(i+" x"+j+ " = " +i*j+ " \t ");
               // System.out.printf("%d x %d = %d \n", i, j, i*j);
            }
            System.out.println();
        }
    }
}
