import javax.swing.JOptionPane;
public class JOp {
    public static void main (String[] args){
        String enteryear = JOptionPane.showInputDialog("Enter a year");
        int year = Integer.parseInt(enteryear);

        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (leapYear) {
            JOptionPane.showMessageDialog(null, year + " is a leap year ");
        } else {
            JOptionPane.showMessageDialog(null, year + " is a not leap year ");
        }
    }
}