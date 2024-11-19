public class UtilityClass {

    // method to print out all Strings(options) in the passed array
    public static void menu(String[] options) {
        for(int i = 0; i < options.length; i++) {
            System.out.println((i+1) + ".)" + options[i]);
        }
    }
}
