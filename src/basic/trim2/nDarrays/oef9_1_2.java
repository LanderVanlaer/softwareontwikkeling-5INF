package basic.trim2.nDarrays;

public class oef9_1_2 {
    public static void main(String[] args) {
        int[][] data = new int[10][10];
        int a = 1;
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                data[i][j] = a++;
            }
        }

        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                System.out.println(data[i][j]);
            }
            i++;
            if(data.length > i) {
                for(int j = data[i].length - 1; j > 0; j--) {
                    System.out.println(data[i][j]);
                }
            }
        }
    }
}
