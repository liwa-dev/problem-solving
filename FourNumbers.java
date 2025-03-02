import java.util.Scanner;

public class FourNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        if (a >= 0 && a <= 10000 && b >= 0 && b <= 10000 && c >= 0 && c <= 10000 && d >= 0 && d <= 10000) {
        }
        System.out.println(a * b * c * d);
        sc.close();
    }
}
