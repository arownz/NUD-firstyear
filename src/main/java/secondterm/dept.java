package secondterm;

import java.util.Scanner; 
public class dept {
 public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     
     System.out.print("Enter the dept: ");
     String dept = input.nextLine();
     System.out.print("Enter a year: ");
     String year = input.nextLine();
     
     
     if (dept == null){
         
     }
     else switch (dept) {
         case "TD": System.out.println("Technical Department"); 
         break;
         case "MD": System.out.println("Mechanical Department");
         break;
         case "EED": System.out.println("Electrical and Electronics department");
         break;
         case "": System.out.println("Empty!, pls enter your department");
         break;
         // etc...
         default: System.out.println("Enter a valid department");
     }
     
     if (year == null){
     }
     else switch (year) {
         case "1": System.out.println("The student is in 1st year"); 
         break;
         case "2": System.out.println("The student is in 2nd year");
         break;
         case "3": System.out.println("The student is in 3rd year");
         break;
         case "": System.out.println("Empty!, pls enter your year");
         break;
         // etc...
         default: System.out.println("Enter a valid year.");
     }
 }
}
