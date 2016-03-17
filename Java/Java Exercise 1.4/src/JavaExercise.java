/**
 * Created by Clark Elliott on 6/7/2014.
 * JavaExercise 1.4 (Print a Table)
 *
 * This was a great exercise! I had to resolve some scope and logical errors during this.
 */
public class JavaExercise {
    public static void main(String[] args) {
        int i = 1;
        String output;

        System.out.println("  a     a^2   a^3  ");

        // Loop to display table
        while(i < 5) {
            // If statement to correct formatting for double digit numbers
            if(i == 4) {
                output = ("  " + i + "     " + (i * i) + "    " + (i * i * i) + "  ");
            }
            else {
                output = ("  " + i + "     " + (i * i) + "     " + (i * i * i) + "  ");
            }
            System.out.println(output);
            i++;
        }

    }
}
