package basic.trim1.whileLoop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class oef6_4_1 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter(new File("src/basic/trim1/whileLoop/graden.txt")));
        for(int graden = -40; graden <= 40; graden += 5) {
            if(String.valueOf(graden).length() <= 1) {
                pw.println(graden + "°C\t\t" + (((9D / 5D) * graden) + 32D) + "°F");
            } else {
                pw.println(graden + "°C\t" + (((9D / 5D) * graden) + 32D) + "°F");
            }
        }

        pw.close();
    }
}
