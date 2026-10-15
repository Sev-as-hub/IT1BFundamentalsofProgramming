
import java.io.BufferedReader;
import java.io.StringReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ass4 {
    public static void main(String[] args) throws IOException {

        double height;
        int age;
        String c, r;
        String rt;

        String input1 = JOptionPane.showInputDialog(
                "Enter Height in cm:"
        );

        BufferedReader br = new BufferedReader(
                new StringReader(input1)
        );
        height = Double.parseDouble(br.readLine());

        String input2 = JOptionPane.showInputDialog(
                "Enter Age:"
        );

        Scanner sc = new Scanner(input2);
        age = sc.nextInt();

        c = JOptionPane.showInputDialog(
                "Enter Citizenship Code:\nC - Citizen of Endor\nN - Non-citizen"
        );

        r = JOptionPane.showInputDialog(
                "Enter Recommendee Code:\nR - Recommendee\nN - Non-recommendee"
        );

        if (r.equalsIgnoreCase("R")) {
            rt = "ACCEPTED";
        }
        else if (height >= 200 &&
                age >= 21 && age <= 25 &&
                c.equalsIgnoreCase("C")) {
            rt = "ACCEPTED";
        }
        else {
            rt = "REJECTED";
        }

        JOptionPane.showMessageDialog(
                null,
                "Height: " + height + " cm" +
                        "\nAge: " + age +
                        "\nCitizenship: " + c.toUpperCase() +
                        "\nRecommendee: " + r.toUpperCase() +
                        "\n\nApplication Status: " + rt,
                "Jedi Academy Result",
                JOptionPane.INFORMATION_MESSAGE
        );

        br.close();
        sc.close();
    }
}