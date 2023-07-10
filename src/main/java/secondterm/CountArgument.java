package secondterm;

import java.util.Scanner;

public class CountArgument {

    public static int argumentCount(String sen, char letter) {
        int argument = 0;
        for (int i = 0; i < sen.length(); i++) {
            if (sen.charAt(i) == letter) {
                argument++;
            }
        }
        return argument;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string and a letter separated by a comma: ");
        String input = s.nextLine();

        int comma = input.indexOf(',');
        String sen = input.substring(0, comma).trim();
        char letter = input.charAt(comma + 1);

        int count = argumentCount(sen, letter);
        System.out.println("Number of letter " + letter + " in string " + sen + " is " + count);

        s.close();
    }
}