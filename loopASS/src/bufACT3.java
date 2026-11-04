import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class bufACT3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        double bal = 20000;
        double am;

        System.out.println("MUCHO DINERO SAVINGS ACCOUNT");
        System.out.println("Starting Balance: P" + bal);

        for (int i = 1; ; i++) {

            System.out.print("Enter amount (0 to stop): ");
            am = Double.parseDouble(br.readLine());

            if (am == 0) {
                break;
            }

            if (am > 0) {
                bal += am;
                System.out.println("Deposit successful!");
            }
            else {
                if (Math.abs(am) <= bal) {
                    bal += am;
                    System.out.println("Withdrawal successful!");
                }
                else {
                    System.out.println("INSUFFICIENT FUNDS!");
                }
            }

            System.out.println("Outstanding Balance: P" + bal);
        }

        System.out.println("Final Balance: P" + bal);
        System.out.println("Thank you!");
    }
}
