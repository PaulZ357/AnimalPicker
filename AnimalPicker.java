import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want a picture of a dog or a cat? ");
        String word = input.next();
        if (word.equalsIgnoreCase("cat")) {
            // cats
            System.out.println("CAT ASCII ART HERE");
        } else if (word.equalsIgnoreCase("dog")) {
            // dogs
            System.out.println("DOG ASCII ART HERE");
        }
        input.close();
    }
}