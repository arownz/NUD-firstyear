package secondterm;

public class Pasion_Palindrome {
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
        System.out.println("is the string (wow) a palindrome? " + isPalindrome("wow"));
        System.out.println("is the string (oum) a palindrome? " + isPalindrome("oum"));
        System.out.println("is the string (dad) a palindrome? " + isPalindrome("dad"));
        System.out.println("is the string (boy) a palindrome? " + isPalindrome("boy"));
        System.out.println("is the string (mom) a palindrome? " + isPalindrome("mom"));

    }
}