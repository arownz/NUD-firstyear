package secondterm;
    import java.util.Scanner;
public class Pasion_LargestNum {
    
public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter 10 numbers: ");  
        
        double l = input.nextDouble();
        for (int i = 1; i <10 ; i++) {

        double n = input.nextDouble();
        l = Largestnum(l, n);
    }
             System.out.print("The largest number is: " + l);
  }
    public static double Largestnum(double l, double n) {
    return Math.max(l, n);
  }
}

