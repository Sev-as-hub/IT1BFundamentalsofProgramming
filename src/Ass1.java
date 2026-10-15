import java.io.BufferedReader;
import java.io.StringReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ass1 {

    public static void main(String[] args) throws IOException {

        String input = JOptionPane.showInputDialog(
                null,
                "Enter a year:"
        );

        BufferedReader br = new BufferedReader(new StringReader(input));
        int year = Integer.parseInt(br.readLine());


        Scanner scanner = new Scanner(input);
        int yC = scanner.nextInt();

        if (yC % 400 == 0 ||
                (yC % 4 == 0 && yC % 100 != 0)) {

            JOptionPane.showMessageDialog(
                    null,
                    year + " is a Leap Year!"
            );

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    year + " is NOT a Leap Year!"
            );
        }

        scanner.close();
    }
}
