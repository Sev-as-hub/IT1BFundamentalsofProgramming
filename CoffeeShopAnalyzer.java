
import java.util.Arrays;
// Ginagamit para sa pag-aayos ng listahan.

public class CoffeeShopAnalyzer {
    public static void main(String[] args){

        int[] weeklySales = {120, 145, 130, 155, 180, 210, 195};
        // Listahan ng benta bawat araw.

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // Mga araw sa isang linggo.

        System.out.println("---Daily Sales---");
        // Pamagat ng araw-araw na benta.

        for(int i = 0; i<weeklySales.length; i++){
            // Inuulit ang bawat araw.

            System.out.println(daysOfWeek[i] + " Sales: " + weeklySales[i]);
            // Ipinapakita ang benta bawat araw.
        }

        int totalSales = 0;
        // Panimulang kabuuang benta.

        for(int dailySale : weeklySales){
            // Kinukuha ang benta bawat araw.

            totalSales += dailySale;
            // Idinadagdag ang bawat benta.
        }

        double averageSales = (double)totalSales / weeklySales.length;
        // Kinukuha ang average na benta.

        System.out.println("\n---WeeklySummary---");
        // Pamagat ng buod ng linggo.

        System.out.println("Total Sales: " + totalSales + " cups");
        // Ipinapakita ang kabuuang benta.

        System.out.println("Average Daily Sale: " + averageSales + " cups");
        // Ipinapakita ang average na benta.

        int MaxSales = weeklySales[0];
        // Panimulang pinakamataas na benta.

        int MinSales = weeklySales[0];
        // Panimulang pinakamababang benta.

        String Bestday = daysOfWeek[0];
        // Panimulang pinakamagandang araw.

        String Worstday = daysOfWeek[0];
        // Panimulang pinakamahinang araw.

        for(int i = 1; i < weeklySales.length; i++){
            // Sinusuri ang benta bawat araw.

            if(weeklySales[i] > MaxSales){
                MaxSales = weeklySales[i]; Bestday = daysOfWeek[i];
                // Ina-update ang pinakamataas na benta.
            }

            if(weeklySales[i] < MinSales){
                // Sinusuri ang pinakamababang benta.

                MinSales = weeklySales[i];
                Worstday = daysOfWeek[i];
                // Ina-update ang pinakamababang benta.
            }
        }

        System.out.println("\n---Bests and Worsts---");
        // Pamagat ng pinakamataas at pinakamababang benta.

        System.out.println("Best Day was " + Bestday + " with " + MaxSales + " cups");
        // Ipinapakita ang araw na may pinakamataas na benta.

        System.out.println("Worst Day was " + Worstday + " with " + MinSales + " cups");
        // Ipinapakita ang araw na may pinakamababang benta.
    }
}
