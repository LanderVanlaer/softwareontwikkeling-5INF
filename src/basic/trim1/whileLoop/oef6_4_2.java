package basic.trim1.whileLoop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class oef6_4_2 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter(new File("src/basic/trim1/whileLoop/oef6_4_2.txt")));
        int getal = 0;
        int kwadraat = 0;
        do {
            kwadraat = getal * getal;
            pw.println(kwadraat);
            getal -= -1;
        } while(kwadraat < 100);
        pw.close();
    }
}
