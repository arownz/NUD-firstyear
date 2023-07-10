package secondterm;
/*  Write a java program that calculate the average value of array elements. 
15,20,30,35,46,60,-10,-20,100,-30
*/
public class Pasion {
 
   public static void main(String[] args) {
        double[] array = { 15,20,30,35,46,60,-10,-20,100,-30 };  
        
        double length = array.length;
        
        double sum = 0;
        
       for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
       double average = sum / length;
         
        System.out.println("The average of array is: "+average);
   }

}


