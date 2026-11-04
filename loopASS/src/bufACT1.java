
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class bufACT1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        double n, h, l;

        System.out.print("Enter number 1: ");
        n = Double.parseDouble(br.readLine());

        h = n;
        l = n;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            n = Double.parseDouble(br.readLine());

            if (n > h) {
                h = n;
            }

            if (n < l) {
                l = n;
            }
        }

        System.out.println("Highest number: " + h);
        System.out.println("Lowest number: " + l);
    }
}
