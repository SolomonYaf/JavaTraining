package JavaLoops;

public class NestedForSimple {
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            System.out.println("I = "+i);
            for (int j=0; j<5; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}