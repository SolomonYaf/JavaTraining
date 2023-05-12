package JumpStatements;

public class ReturnStatement {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
            if (i == 7)

                return;// returns to  the main method
            System.out.println(i);//prints up to 6

        }
        System.out.println(i);//never executes

    }
}
