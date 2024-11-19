import java.util.Scanner;

public class UtilityClass {

    // method to print out all Strings(options) in the passed array
    public static void menu(String[] options) {
        for(int i = 0; i < options.length; i++) {
            System.out.println((i+1) + ".) " + options[i]);
        }
    }

    // method to ensure user enters a valid int and a number between the specified range
    public static int validateRange(int min, int max) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        boolean done = false;

        while(!done) {
            if(scanner.hasNextInt()) {
                input = scanner.nextInt();

                if(input < min || input > max) {
                    System.out.println("Invalid! Please choose the following (1-3)");
                }
                else done = true;
            }
            else {
                System.out.println("Please enter a valid int (" +min+ "-" +max+ ")");
            }
        }

        return input;
    }
}
