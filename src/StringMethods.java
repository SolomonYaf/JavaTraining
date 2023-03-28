public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int len = str.length();
        System.out.println(len);

        // substring() method: This method returns a substring of a string based on the
        //specified starting and ending index.

        String subst = str.substring(0, 5);
        System.out.println(subst);

        // equals() method: This method compares two strings and returns true if they are
        //equal, otherwise it returns false.

        String str1 = "Hello";
        String str2 = "hello";

        if (str1.equals(str2)) {
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
        if (str1.equalsIgnoreCase(str2)) {       // ignores the lower and upper cases
            System.out.println("Strings are equal");
        } else {

            System.out.println("Strings are not equal");
        }

        //  toUpperCase() method: This method converts all characters in a string to uppercase.
        String strUpper = str.toUpperCase();
        System.out.println(strUpper);

        //replace() method: This method replaces all occurrences of a specified character or
        //substring with another character or substring.
        String strReplace = str.replace("o","x");// why do we mention it as string? b/c it is defined as string
        System.out.println("The replaced character is: "+ strReplace);


        // indexOf() method: This method returns the index of the first occurrence of a
        //specified character or substring in a string. If the specified character or substring is
        //not found, it returns -1.

        int indexOf = str.indexOf("o");
        System.out.println("Index of 'o' in Hello, World! is: "+ indexOf);

        //trim() method: This method returns a copy of the string with leading and trailing
        //whitespace removed.
        String trimmedStr = str.trim();
        System.out.println("The trimmed String is: "+ trimmedStr);

        //startsWith() method: This method checks if a string starts with a specified prefix and
        //returns true if it does, otherwise it returns false.

        boolean startsWithH= str.startsWith("Hello");
        System.out.println(startsWithH);

        //endsWith() method: This method checks if a string ends with a specified suffix and
        //returns true if it does, otherwise it returns false.

        boolean endsWithWorld = str.endsWith("!");
        System.out.println(" The String Ends with: " + endsWithWorld);


        // valueOf() method: This method converts a value of any type to a string.
        int num = 42;
        String strNum = String.valueOf(num);// what is the need(advantage of changing int to String
        System.out.println(strNum);


        System.out.println((int)(Math.random()*10));
    }

}
