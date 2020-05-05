package basic.trim1.array;

public class oef8_2_3 {
    public static void main(String[] args) {
        double p[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        double q[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        double som = 0;
        for(int i = 0; q.length > p.length ? i < p.length : i < q.length; i++) {
            som += p[i] * q[i];
        }
        System.out.println(som);
    }
}
