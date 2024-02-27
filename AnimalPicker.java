import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Which animal would you like to see? ");
        String word = keyboard.next();
        if (word.equalsIgnoreCase("cat")) {
            System.out.println("CAT");
        } else if (word.equalsIgnoreCase("dog")) {
            System.out.println("DOG");
        } else {
            System.out.println("invalid option");
        }
        keyboard.close();
    }
}
