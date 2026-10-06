import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buff {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a year: ");
        int year = Integer.parseInt(br.readLine().trim());

        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (leapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        br.close();
    }
}