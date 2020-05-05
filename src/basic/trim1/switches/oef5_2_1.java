package basic.trim1.switches;

public class oef5_2_1 {
    public static void main(String[] args) {
        int a = 0;
        switch(a) {
            case 1:
                a += 5;
                break;
            case 2:
                a += 10;
                break;
            case 3:
                a += 16;
                break;
            case 4:
                a += 34;
                break;
            default:
                a = 0;
        }
        System.out.println("abc".hashCode());
        System.out.println("abcd".hashCode());
    }
}
