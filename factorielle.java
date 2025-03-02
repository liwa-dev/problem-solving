import java.util.Scanner;

public class factorielle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        // System.out.println(num);
        if (num == 1) {
            System.out.print("NO");
        } else {
            System.out.print("YES");
        }

    }
}
