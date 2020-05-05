import java.util.Scanner;

public class oef2_6_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner intialiseren
        String zin1, nieuwWoord, deel1, deel2, veranderWoord, zin2; // declaleren Strings
        System.out.print("Geef een zin: ");
        zin1 = scan.nextLine();
        System.out.print("Welk woord wilt u vervangen: ");
        veranderWoord = scan.nextLine();
        int indexWord = zin1.indexOf(veranderWoord);
        if (indexWord == -1) {// Nakijken of het gegeven woord in de zin staat
            System.out.println("\"" + veranderWoord + "\"" + " staat niet in de zin.");
            return; // Return als het gegeven woord niet in de zin staat.
        }
        System.out.print("Door welk woord wilt u \"" + veranderWoord + "\" vervangen: ");
        nieuwWoord = scan.nextLine(); // Woord ingeven om het andere woord te vervangen
        deel1 = zin1.substring(0, indexWord);
        deel2 = zin1.substring((indexWord + veranderWoord.length()));
        zin2 = deel1 + nieuwWoord + deel2;
        System.out.println(zin2); // Veranderede zin weergeven
    }
}