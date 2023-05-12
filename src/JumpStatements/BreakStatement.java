package JumpStatements;

public class BreakStatement {
    public static void main(String[] args) {

        int i;
        for (i = 0; i < 10; i++) {
            if (i == 7)
                break;

            System.out.println(i);

            // return i;
        }
        System.out.println(i);
    }
}
