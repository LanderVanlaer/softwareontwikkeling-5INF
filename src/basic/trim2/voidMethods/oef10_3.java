package basic.trim2.voidMethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class oef10_3 {
    public static Scanner scan;
    public static List<String> listNames = new ArrayList<String>();
    public static List<Integer> list2000 = new ArrayList<Integer>();
    public static List<Integer> list2012 = new ArrayList<Integer>();

    public static void main(String[] args) throws FileNotFoundException {
        scan = new Scanner(new File("src/basic/trim2/voidMethods/GROEI.txt"));
        scan.nextLine();
        while(scan.hasNext()) {
            inlezen();
        }
        show();
    }

    private static void inlezen() {
        listNames.add(scan.next());
        list2000.add(scan.nextInt());
        list2012.add(scan.nextInt());

    }

    private static void show() {
        for(int i = 0; i < listNames.size(); i++) {
            System.out.println(listNames.get(i) + "		"
                    + ((double) (list2012.get(i) - list2000.get(i)) / (double) list2000.get(i)));
        }
    }
}
