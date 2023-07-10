package secondterm;

import java.util.Scanner;

public class Pasion_Palindrome2 {
    public static boolean isPalindrome(String pal)
    {
        int startpa = 0;
        int endpa = pal.length() - 1;
        while(startpa < endpa)
        {
            char lin = pal.charAt(startpa);
            char drome = pal.charAt(endpa);
            if(Character.toLowerCase(lin) != Character.toLowerCase(drome))
                return false;
            startpa += 1;
            endpa -= 1;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome: ");
        String input = sc.nextLine();
        System.out.println(isPalindrome(input));
    }
}