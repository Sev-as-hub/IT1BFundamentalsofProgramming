import javax.swing.JOptionPane;
public class JOp {
    public static void main (String[] args){
        String hourlyrate = JOptionPane.showInputDialog("Enter hourly pay rate");
        double rate = Double.parseDouble(hourlyrate);
        String hoursworked = JOptionPane.showInputDialog("Enter hours worked");
        double hours = Double.parseDouble(hoursworked);

        double gross = hours * rate;

        double percent;
        if (gross <= 2000.00)       percent = 10;
        else if (gross <= 4000.00)  percent = 12;
        else if (gross <= 10000.00) percent = 15;
        else                        percent = 20;

        double tax = gross * percent / 100.0;
        double net = gross - tax;

        JOptionPane.showMessageDialog(null,
                "Hourly Rate: " + rate +
                        "\nHours Worked: " + hours +
                        "\nGross Pay: " + gross +
                        "\nWithholding ( "+percent+"% ): " + tax +
                        "\nNet Pay: " + net ,
                "----- PAYSLIP -----", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}