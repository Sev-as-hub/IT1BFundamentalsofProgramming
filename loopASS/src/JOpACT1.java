
import javax.swing.JOptionPane;

public class JOpACT1 {
    public static void main(String[] args) {

        double n, h, l;

        n = Double.parseDouble(
                JOptionPane.showInputDialog("Enter number 1:"));

        h = n;
        l = n;

        for (int i = 2; i <= 10; i++) {

            n = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter number " + i + ":"));

            if (n > h) {
                h = n;
            }

            if (n < l) {
                l = n;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Highest number: " + h +
                        "\nLowest number: " + l ,
                "----- RESULT -----", JOptionPane.INFORMATION_MESSAGE);
    }
}
