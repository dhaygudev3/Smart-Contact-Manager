import java.util.Scanner;

public class Star1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input
        int a = sc.nextInt();

        // Loop to control the number of rows
        for (int i = 1; i <= a; i++) {
            // Loop to control the number of columns (printing numbers)
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }

        sc.close(); // Close the scanner
    }
}
