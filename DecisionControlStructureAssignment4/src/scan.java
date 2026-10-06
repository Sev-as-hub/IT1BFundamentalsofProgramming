import java.util.Scanner;

public class scan {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        double height = i.nextDouble();

        System.out.print("Enter age: ");
        int a = i.nextInt();

        System.out.print("Enter citizenship (C/N): ");
        char c = i.next().charAt(0);

        System.out.print("Enter recommendation (R/N): ");
        char r = i.next().charAt(0);

        if (r == 'R') {
            System.out.println("ACCEPTED");
        }
        else if (height >= 200 && a >= 21 && a <= 25 && c == 'C') {
            System.out.println("ACCEPTED");
        }
        else {
            System.out.println("REJECTED");
        }

        i.close();
    }
}
