import java.util.Scanner;
public class scan {
    public static void main (String[] args){
        int year;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year= Integer.parseInt(inputDevice.nextLine());
        boolean LeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (LeapYear) {
            System.out.println(year + " is a leap year.");
        }
        else {
        }
        System.out.println(year + " is not a leap year.");
    }
    }