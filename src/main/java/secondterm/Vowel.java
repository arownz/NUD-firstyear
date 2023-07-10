package secondterm;

import java.util.Scanner;

public class Vowel {

    public static int vowelsCount(String sen) {
        int vowel = 0;

        for (int i = 0; i < sen.length(); i++) {
            if (sen.charAt(i) == 'a'
                    || sen.charAt(i) == 'e'
                    || sen.charAt(i) == 'i'
                    || sen.charAt(i) == 'o'
                    || sen.charAt(i) == 'u') {
                vowel++;
            }
        }
        return vowel;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Type a String: ");
        String sen = s.nextLine();

        System.out.print("Vowel counted (a,e,i,o,u): " + vowelsCount(sen));

        s.close();
    }
}
