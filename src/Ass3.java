
import java.io.BufferedReader;
import java.io.StringReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ass3{
    public static void main(String[] args) throws IOException {

        double n, s, e;
        String result;

        String i1= JOptionPane.showInputDialog(
                "Enter NSAT Score:"
        );
        BufferedReader br1 = new BufferedReader(
                new StringReader(i1)
        );
        n = Double.parseDouble(br1.readLine());

        String i2=JOptionPane.showInputDialog(
                "Enter Parent's monthly salary:"
        );
        Scanner sc = new Scanner(i2);
        s = sc.nextDouble();

        String i3= JOptionPane.showInputDialog(
                "Enter Entrance Exam Score:"
        );
        e = Double.parseDouble(i3);

        if (s > 10000 || n < 90 || e < 85) {
            result = "REJECTED";
        }
        else if (s <= 3500 && (n + e) / 2 >= 91) {
            result = "ACCEPTED";
        }
        else {
            result = "FOR FURTHER STUDY";
        }

        JOptionPane.showMessageDialog(
                null,
                "NSAT Score: " + n +
                        "\nParents' Monthly Salary: ₱" + s +
                        "\nEntrance Exam Score: " + e +
                        "\n\nApplication Status: " + result,
                "College Scholarship Result",
                JOptionPane.INFORMATION_MESSAGE
        );

        br1.close();
        sc.close();
    }
}