public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        int a = 6;
        while (a >= -6) {
            System.out.println(a);
        a--;
        }
        int b = 10;
        int result = 0;
        do {
            result = result + b;
            if(result % 2 != 0) {
                System.out.println(result);
            }
            b++;
        } while(b <= 20);
    }
}
