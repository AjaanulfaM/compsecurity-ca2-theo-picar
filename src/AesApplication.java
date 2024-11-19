import java.util.Scanner;

public class AesApplication {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("AES Encryption Simulator");
        menu();
    }

    public static void menu() {
        String[] menuOptions = new String[3];
        menuOptions[0] = "Encrypt file";
        menuOptions[1] = "Decrypt file";
        menuOptions[2] = "Quit application";

        System.out.println("Please choose one of the following (1-3)");
        UtilityClass.menu(menuOptions);

        int choice = scanner.nextInt();

        if(choice == 1) {
            encryptFile();
        }
        else if(choice == 2) {
            decryptFile();
        }
        else {
            System.out.println("Quitting application...\nSession ended, goodbye!");
        }
    }

    public static void encryptFile() {
        System.out.println("Encrypting code here\n");
        menu();
    }

    public static void decryptFile() {
        System.out.println("Decrypting code here\n");
        menu();
    }
}
