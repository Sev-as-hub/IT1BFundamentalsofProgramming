
import java.io.BufferedReader;
import java.io.StringReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ass2 {
    public static void main(String[] args) throws IOException {

        double r, h, gpay, tRate;
        double WHT, nPay;

        String input1 = JOptionPane.showInputDialog(
                "Enter Hourly Pay Rate (Php):"
        );

        BufferedReader br = new BufferedReader(
                new StringReader(input1)
        );
        r = Double.parseDouble(br.readLine());

        String input2 = JOptionPane.showInputDialog(
                "Enter Hours Worked:"
        );

        Scanner sc = new Scanner(input2);
        h = sc.nextDouble();


        gpay = r * h;

        if (gpay <= 2000) {
            tRate = 0.10;
        }
        else if (gpay <= 4000) {
            tRate = 0.12;
        }
        else if (gpay <= 10000) {
            tRate = 0.15;
        }
        else {
            tRate = 0.20;
        }

        WHT = gpay * tRate;
        nPay = gpay - WHT;

        JOptionPane.showMessageDialog(
                null,
                String.format(
                        "Hourly Pay Rate: Php %.2f" +
                                "\nHours Worked: %.2f" +
                                "\nGross Pay: Php %.2f" +
                                "\nWithholding Tax Rate: %.0f%%" +
                                "\nWithholding Tax: Php %.2f" +
                                "\nNet Pay: Php %.2f",
                        r, h, gpay,
                        tRate * 100, WHT, nPay
                ),
                "Employee Salary Computation",
                JOptionPane.INFORMATION_MESSAGE
        );

        br.close();
        sc.close();
    }
}