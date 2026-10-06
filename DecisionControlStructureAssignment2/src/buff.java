import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buff {
    public static void main (String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter hourly pay rate: ");
        double rate = Double.parseDouble(a.readLine().trim());

        System.out.print("Enter hours worked: ");
        double hours = Double.parseDouble(a.readLine().trim());

        double gross = hours * rate;

        double percent;
        if (gross <= 2000.00)       percent = 10;
        else if (gross <= 4000.00)  percent = 12;
        else if (gross <= 10000.00) percent = 15;
        else                        percent = 20;

        double tax = gross * percent / 100.0;
        double net = gross - tax;

        System.out.println("\n----- PAY SLIP -----");
        System.out.println("Hourly Rate: " + rate);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Gross Pay: " + gross);
        System.out.println("Withholding ( "+percent+"% ): " + tax);
        System.out.print("Net Pay: " + net);

        a.close();
    }
}