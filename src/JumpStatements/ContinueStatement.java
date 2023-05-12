package JumpStatements;

public class ContinueStatement {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 12; i++) {
            if (i ==7)
                continue;//jumps i=7
            System.out.println(i);// prints i<12


        }
        System.out.println(i);// prints the last element

    }
}
