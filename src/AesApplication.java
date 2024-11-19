import java.util.Scanner;

public class AesApplication {

    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        String[] menuOptions = new String[3];
        menuOptions[0] = "Encrypt file";
        menuOptions[1] = "Decrypt file";
        menuOptions[2] = "Quit application";

        UtilityClass.menu(menuOptions);
    }

    public static void encryptFile() {
        // encrypting code here...
    }

    public static void decryptFile() {
        // decrypting code here...
    }
}
