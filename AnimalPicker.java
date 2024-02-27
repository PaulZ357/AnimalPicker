import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Which animal would you like to see? ");
        String word;
        do {
            word = keyboard.nextLine();
            if (word.equalsIgnoreCase("cat")) {
                System.out.println(" _._     _,-'\"\"`-._\r\n" + //
                                        "(,-.`._,'(       |\\`-/|\r\n" + //
                                        "    `-.-' \\ )-`( , o o)\r\n" + //
                                        "          `-    \\`_`\"'-");
            } else if (word.equalsIgnoreCase("dog")) {
                System.out.println("            __\r\n" + //
                                        "(\\,--------'()'--o\r\n" + //
                                        " (_    ___    /~\"\r\n" + //
                                        "  (_)_)  (_)_)");
            } else {
                // error message
                System.out.print("Invalid animal. ");
            }
        } while (!word.equalsIgnoreCase("cat") && !word.equalsIgnoreCase("dog"));
        keyboard.close();
    }
}