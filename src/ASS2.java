
public class ASS2 {
    public static void main(String[] args) {

        double[] temperatures = new double[5];
        //firstday temp
        temperatures[0] = 32.5;
        //secondday temp
        temperatures[1] = 34.0;
        //thirdday temp
        temperatures[2] = 31.8;
        // fourthday temp
        temperatures[3] = 33.2;
        //fifthday temp
        temperatures[4] = 35.1;
        //ogtemp
        System.out.print("Original Temperatures: [");

        for (int i = 0; i < temperatures.length; i++) {
            System.out.print(temperatures[i]);

            if (i < temperatures.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //update thirdday
        temperatures[2] = 32.0;
        System.out.print("Updated Temperatures: [");

        for (int i = 0; i < temperatures.length; i++) {
            System.out.print(temperatures[i]);

            if (i < temperatures.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Updated temperature for the third day: " + temperatures[2]);
    }
}
