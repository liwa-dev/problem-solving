import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        for (int i = 0; i < size; i++) {
            int value = sc.nextInt(); // 56486
            while (value != 0) {
                int my_num = value % 10; //5648.6
                value = value / 10; // 5648
            }

        }

    }
}
