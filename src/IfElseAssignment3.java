public class IfElseAssignment3 {
    public static void main(String[] args) {

        //3. Write a Java program that prompts the user to enter a character and then checks whether the character
        // is a vowel or a consonant.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please insert a character");
//        String inputChar = scanner.nextLine();// there is no nextChar
        String inputChar = "a";

//        if(inputChar=="a"|| inputChar=="e"| inputChar=="i"||inputChar=="o"||inputChar=="u"){
//            System.out.println(inputChar+" is vowel");
//        }
//        else
//            System.out.println(inputChar+" is consonant");
        switch (inputChar) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(inputChar + " is vowel");
                break;
            default:
                System.out.println(inputChar + " is consonant");
        }
    }
}
