import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class buff {
    public static void main(String[] args) throws IOException {

        BufferedReader input =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter height in cm: ");
        double h = Double.parseDouble(input.readLine());

        System.out.print("Enter age: ");
        int a = Integer.parseInt(input.readLine());

        System.out.print("Enter citizenship (C/N): ");
        char c = input.readLine().charAt(0);

        System.out.print("Enter recommendation (R/N): ");
        char recommend = input.readLine().charAt(0);

        if (recommend == 'R') {
            System.out.println("ACCEPTED");
        }
        else if (h >= 200 && a >= 21 && a <= 25 && c == 'C') {
            System.out.println("ACCEPTED");
        }
        else {
            System.out.println("REJECTED");
        }
    }
}
