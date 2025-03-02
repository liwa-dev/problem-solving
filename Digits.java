import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int value = sc.nextInt(); // 56486
            if (value == 0) {
                System.out.println(0);
                continue;
            }
            while (value != 0) {
                int my_num = value % 10; //5648.6
                System.out.print(my_num  + " ");
                value = value / 10; // 5648
            }
            System.out.println();
        }

    }
}
