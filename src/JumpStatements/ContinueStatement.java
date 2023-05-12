package JumpStatements;

public class ContinueStatement {
    public static void main(String[] args) {
//        int i;
//        for (i = 0; i < 12; i++) {
      //  The continue keyword is used to end the current iteration in a for loop (or a while loop), and continues to the next iteration.
//            if (i ==7)
//                continue;//jumps i=7
//            System.out.println(i);// prints i<12
//
//
//        }
//        System.out.println(i);// prints the last element
        int i = 0;
        while (i < 5) {
            if (i == 2) {
                i++;// this only executes if the condition is true(i==2) then it increases to 3
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
