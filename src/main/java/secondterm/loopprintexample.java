
package secondterm;

public class loopprintexample {
    public static void main(String[] args) {

        for (int i = 1, j = 2; i <= 5; i++, j += 3 - (i % 2)) {
        System.out.print(j + " "); //2,5,7,10,12
        }
    }
}

  