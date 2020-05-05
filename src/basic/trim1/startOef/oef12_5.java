
public class oef12_5 {
    public static void main(String[] args) {
        int saldo = 100;
        for (int i = 0; i < 3; i++) {
            saldo += saldo * 0.05;
        }
        System.out.println(saldo);
    }
}
