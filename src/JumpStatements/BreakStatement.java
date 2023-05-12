package JumpStatements;

public class BreakStatement {
    public static void main(String[] args) {

        int i;
        for (i = 0; i < 5; i++) {
            //The break keyword is used to break out a for loop, a while loop or a switch block.
            if (i == 4){
                break;
            }
            System.out.println(i);
        }
    }
}
