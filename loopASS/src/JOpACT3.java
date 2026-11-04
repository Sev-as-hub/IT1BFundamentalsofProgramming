
import javax.swing.JOptionPane;

public class JOpACT3 {
    public static void main(String[] args) {

        double bal = 20000;
        double am;

        String out = "MUCHO DINERO SAVINGS ACCOUNT\n";
        out += "Starting Balance: P" + bal + "\n";

        for (int i = 1; ; i++) {

            am = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Enter amount (0 to stop):"));

            if (am == 0) {
                break;
            }

            if (am > 0) {
                bal += am;
                out += "Deposit successful!\n";
            }
            else {
                if (Math.abs(am) <= bal) {
                    bal += am;
                    out += "Withdrawal successful!\n";
                }
                else {
                    out += "INSUFFICIENT FUNDS!\n";
                }
            }

            out += "Outstanding Balance: P" + bal + "\n\n";
        }

        out += "Final Balance: P" + bal;
        out += "\nThank you!";

        JOptionPane.showMessageDialog(null, out);
    }
}
