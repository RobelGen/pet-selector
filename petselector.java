import java.util.Scanner;

public class petselector {
    public static void main(String[] args) {
        /*
         * Name: Robel
         * Date: October 15, 2026
         * Description: Determines the perfect pet based on
         * the user's name, favorite color, and favorite season.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("hey what's your name?");
        String name = scan.nextLine().toLowerCase().trim();
        if (name.length() == 0 ||
            "abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0, 1)) == -1) {
            System.out.println("that's not a real name!");
            scan.close();
            return;
        }

        String color = "";
        String season = "";
        String pet = "";

        System.out.println("Enter your favorite color (blue, red, or green):");
        color = scan.nextLine().toLowerCase();

         if (!color.equals("blue") && !color.equals("red") && !color.equals("green")) {
        System.out.println("Invalid color. Try again:");
        color = scan.nextLine().toLowerCase();
        }

        System.out.println("Enter your favorite season (spring, summer, fall, or winter):");
        season = scan.nextLine().toLowerCase();

        if (!season.equals("spring") && !season.equals("summer") && !season.equals("fall") && !season.equals("winter")) {
        System.out.println("Invalid season. Try again:");
        season = scan.nextLine().toLowerCase();
        }
        else if (color.equals("blue") && season.equals("fall")) {
            pet = "Alligator";
        }
        else if (color.equals("blue") && season.equals("spring")) {
            pet = "Ostrich";
        }
        else if (color.equals("green") && season.equals("winter")
            && "aeiou".indexOf(name.substring(0, 1)) == -1) {
            pet = "Giraffe";
        }
        else if (color.equals("green") && !season.equals("fall")) {
            pet = "Dog";
        }
        else if (color.equals("red") && "aeiou".indexOf(name.substring(0, 1)) != -1) {
            pet = "Porcupine";
        }
        else if (color.equals("red")) {
            pet = "Panda";
        }
        else if (season.equals("summer")) {
            pet = "Pony";
        }
        else if (color.equals("blue") && "aeiou".indexOf(name.substring(0, 1)) == -1
            && !season.equals("summer") && !season.equals("fall")) {
            pet = "Axolotl";
        }
        else {
            pet = "Pet rock";
        }

        if (!pet.equals("")) {
            System.out.println("Your perfect pet is: " + pet);
        }

        scan.close();
    }
}