
import javax.swing.JOptionPane;

public class JOpACT2 {
    public static void main(String[] args) {

        String o = "Even numbers from 2 to 100:\n";

        for (int i = 2; i <= 100; i += 2) {

            o += i + " ";

            if (i % 20 == 0) {
                o += "\n";
            }
        }

        JOptionPane.showMessageDialog(null, o,
                "OUTPUT",JOptionPane.INFORMATION_MESSAGE );
    }
}
