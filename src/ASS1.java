
import java.util.Arrays; //To use deepToString().

public class ASS1 {
    public static void main(String[] args) {

        String[][] upuan = {
                {"Alice", "Bob", "Charlie"}, // first row
                {"David", "Emma", "Frank"}   // second row
        };
        System.out.println("Person in second row, third column: " + upuan[1][2]);
        //change Bob name to Vacant
        upuan[0][1] = "Vacant";
        System.out.println("Updated Cinema Seating Chart: " + Arrays.deepToString(upuan));

    }
}
