import java.util.Scanner;

public class oef2_6_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner intialiseren
        String zin = "THE QUICK BROWN FOX JUMPS OVER A LAZY DOG", character; // declaleren Strings
        System.out.print("Geef een character: ");
        character = scan.nextLine().toUpperCase();
        System.out.println(character + " komt het eerst voor op positie " + zin.indexOf(character));
    }
}