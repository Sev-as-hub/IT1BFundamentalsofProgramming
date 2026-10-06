import javax.swing.JOptionPane;

public class JOp {
    public static void main(String[] args) {

        double h = Double.parseDouble(
                JOptionPane.showInputDialog("Enter height in cm:")
        );

        int a = Integer.parseInt(
                JOptionPane.showInputDialog("Enter age:")
        );

        char c = JOptionPane.showInputDialog(
                "Enter citizenship (C/N):"
        ).charAt(0);

        char r = JOptionPane.showInputDialog(
                "Enter recommendation (R/N):"
        ).charAt(0);

        String result;

        if (r == 'R') {
            result = "ACCEPTED";
        }
        else if (h >= 200 && a >= 21 && a <= 25 && c == 'C') {
            result = "ACCEPTED";
        }
        else {
            result = "REJECTED";
        }

        JOptionPane.showMessageDialog(
                null,
                "Applicant is " + result
        );
    }
}
